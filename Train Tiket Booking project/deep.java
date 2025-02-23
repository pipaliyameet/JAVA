import java.util.*;

class Train {
    int trainNo;
    String name, source, destination;
    Map<String, Integer> seatAvailability; 

    public Train(int trainNo, String name, String source, String destination, int slSeats, int ac3Seats, int ac2Seats, int ac1Seats) {
        this.trainNo = trainNo;
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.seatAvailability = new HashMap<>();
        this.seatAvailability.put("SL", slSeats);
        this.seatAvailability.put("3A", ac3Seats);
        this.seatAvailability.put("2A", ac2Seats);
        this.seatAvailability.put("1A", ac1Seats);
    }

    public String toString() {
        return trainNo + "," + name + "," + source + "," + destination + "," + seatAvailability.get("SL") + "," +
                seatAvailability.get("3A") + "," + seatAvailability.get("2A") + "," + seatAvailability.get("1A");
    }
}

class Passenger {
    String name;
    int age;
    String gender;

    public Passenger(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return name + " (" + age + ", " + gender + ")";
    }
}

class Booking {
    static int pnrCounter = 100000000;
    int pnr, trainNo, numSeats;
    String username, coach, status;
    double amount;
    List<Passenger> passengers;

    public Booking(String username, int trainNo, String coach, int numSeats, double amount, String status, List<Passenger> passengers) {
        this.pnr = pnrCounter++;
        this.username = username;
        this.trainNo = trainNo;
        this.coach = coach;
        this.numSeats = numSeats;
        this.amount = amount;
        this.status = status;
        this.passengers = passengers;
    }

    public String toString() {
        return pnr + "," + username + "," + trainNo + "," + coach + "," + numSeats + "," + amount + "," + status + "," + passengers;
    }
}

public class deep {
    static final Scanner sc = new Scanner(System.in);
    static List<Train> trains = new ArrayList<>();
    static List<Booking> bookings = new ArrayList<>();
    static Map<String, Double> fareRates = Map.of("SL", 1.0, "3A", 2.5, "2A", 3.5, "1A", 5.0);
    static Map<String, Double> userWallets = new HashMap<>();

    public static void main(String[] args) {
        initializeTrains();
        while (true) {
            System.out.println("\n=== Railway Booking System ===");
            System.out.println("1. Login / Signup");
            System.out.println("2. View Trains");
            System.out.println("3. Book Ticket");
            System.out.println("4. Check PNR Status");
            System.out.println("5. Wallet Balance & Recharge");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> userLogin();
                case 2 -> viewTrains();
                case 3 -> bookTicket();
                case 4 -> checkPNRStatus();
                case 5 -> walletRecharge();
                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

    static void initializeTrains() {
        trains.add(new Train(12345, "Rajdhani Express", "Delhi", "Mumbai", 50, 40, 30, 20));
        trains.add(new Train(12456, "Shatabdi Express", "Mumbai", "Ahmedabad", 60, 50, 40, 25));
        trains.add(new Train(12678, "Duronto Express", "Kolkata", "Chennai", 55, 45, 35, 20));
    }

    static void viewTrains() {
        System.out.println("\nAvailable Trains:");
        for (Train train : trains) {
            System.out.println(train.trainNo + " - " + train.name + " (" + train.source + " → " + train.destination + ")");
        }
    }

    static void userLogin() {
        System.out.print("Enter username: ");
        sc.nextLine();
        String username = sc.nextLine();
        if (!userWallets.containsKey(username)) {
            System.out.println("New user detected! Creating an account...");
            userWallets.put(username, 1000.0);
        }
        System.out.println("Login successful! Wallet balance: ₹" + userWallets.get(username));
    }

    static void bookTicket() {
        System.out.print("Enter username: ");
        sc.nextLine();
        String username = sc.nextLine();
        if (!userWallets.containsKey(username)) {
            System.out.println("User not found! Please login first.");
            return;
        }

        System.out.print("Enter Train Number: ");
        int trainNo = sc.nextInt();
        System.out.print("Enter Coach (SL/3A/2A/1A): ");
        String coach = sc.next();
        System.out.print("Enter No. of Passengers: ");
        int numPassengers = sc.nextInt();

        Train selectedTrain = null;
        for (Train train : trains) {
            if (train.trainNo == trainNo) {
                selectedTrain = train;
                break;
            }
        }

        if (selectedTrain == null) {
            System.out.println("Invalid train number!");
            return;
        }

        if (selectedTrain.seatAvailability.get(coach) < numPassengers) {
            System.out.println("Not enough seats available in this coach!");
            return;
        }

        List<Passenger> passengerList = new ArrayList<>();
        for (int i = 0; i < numPassengers; i++) {
            System.out.print("Enter Passenger " + (i + 1) + " Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Enter Passenger " + (i + 1) + " Age: ");
            int age = sc.nextInt();
            System.out.print("Enter Passenger " + (i + 1) + " Gender (M/F/O): ");
            String gender = sc.next();
            passengerList.add(new Passenger(name, age, gender));
        }

        double fare = 750 * fareRates.get(coach) * numPassengers;
        if (userWallets.get(username) >= fare) {
            userWallets.put(username, userWallets.get(username) - fare);
            selectedTrain.seatAvailability.put(coach, selectedTrain.seatAvailability.get(coach) - numPassengers);
            Booking booking = new Booking(username, trainNo, coach, numPassengers, fare, "Confirmed", passengerList);
            bookings.add(booking);
            System.out.println("Ticket Booked! PNR: " + booking.pnr + ", Fare: ₹" + fare);
        } else {
            System.out.println("Insufficient balance! Please recharge your wallet.");
        }
    }

    static void checkPNRStatus() {
        System.out.print("Enter PNR Number: ");
        int pnr = sc.nextInt();
        for (Booking booking : bookings) {
            if (booking.pnr == pnr) {
                System.out.println("PNR: " + booking.pnr + ", User: " + booking.username + ", Status: " + booking.status);
                System.out.println("Passengers: " + booking.passengers);
                return;
            }
        }
        System.out.println("PNR not found.");
    }

    static void walletRecharge() {
        System.out.print("Enter username: ");
        sc.nextLine();
        String username = sc.nextLine();
        System.out.print("Enter Amount: ₹");
        double amount = sc.nextDouble();
        userWallets.put(username, userWallets.get(username) + amount);
        System.out.println("Wallet recharged successfully! New Balance: ₹" + userWallets.get(username));
    }
}
