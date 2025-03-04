// Declare a class called Student having following data members:id_no, 
// no_of_subjects_registered, subject_code, subject_credits, grade_obtained
//  and spi.Define constructor and calculate_spi methods. Define main to 
// instantiate an array for objects of class student to process data of 
// n students to be given as command line arguments.
import java.util.Scanner;
class Student{
    int idNumber;
    int numberOfSubjectsRegistered;
    int[] subjectCode;
    int[] subjectCredits;
    String[] gradeObtained;
    double sumOfCradite = 0;
    double sumOfTotalCradite = 0;
    double spi;

    public Student(int idNumber , int numberOfSubjectsRegistered){
        this.idNumber = idNumber;
        this.numberOfSubjectsRegistered = numberOfSubjectsRegistered;
        subjectCode = new int[numberOfSubjectsRegistered];
        this.subjectCredits = new int[numberOfSubjectsRegistered];
        gradeObtained = new String[numberOfSubjectsRegistered];
        
        for(int i=0 ; i<this.numberOfSubjectsRegistered ; i++){
            sumOfTotalCradite += this.subjectCredits[i];
            if(this.gradeObtained.equals("A")){
                sumOfCradite+= (9*this.subjectCredits[i]);
            }
            else if(this.gradeObtained.equals("B")){
                sumOfCradite+= (8*this.subjectCredits[i]);
            }
            else if(this.gradeObtained.equals("C")){
                sumOfCradite+= (7*this.subjectCredits[i]);
            }
            else if(this.gradeObtained.equals("D")){
                sumOfCradite+= (6*this.subjectCredits[i]);
            }
            else if(this.gradeObtained.equals("E")){
                sumOfCradite+= (5*this.subjectCredits[i]);
            }
            else if(this.gradeObtained.equals("F")){
                sumOfCradite+= (4*this.subjectCredits[i]);
            }
        }
    }

    public void print(){
        System.out.println("Student id number is = "+this.idNumber);
        System.out.println("total number of subject is = "+this.numberOfSubjectsRegistered);
    }

    public double spiCalculate(){
        
        return this.sumOfCradite/this.sumOfTotalCradite;
    }
}

public class Lab7A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of student : ");
        int numberOfStudent = sc.nextInt();

        Student[] a = new Student[numberOfStudent];

        for(int i=0 ; i<numberOfStudent ;i++){

            System.out.print("Enter a student no "+(i+1)+" id number : ");
            int id =sc.nextInt();
            System.out.print("Enter a number of subject : ");
            int numberOfSubjects = sc.nextInt();
            a[i]= new Student(id , numberOfSubjects);

            for(int j=0 ; j<numberOfSubjects ; j++){
                sc.nextLine();
                System.out.print("Enter a grade obtained of subject no "+(j+1)+" : ");  
                a[i].gradeObtained[j]  = sc.nextLine();
                System.out.print("Enter a subject code of subject no "+(j+1)+": ");
                a[i].subjectCode[j]    = sc.nextInt();
                System.out.print("Enter a subject credit of subject no "+(j+1)+": ");
                a[i].subjectCredits[j] = sc.nextInt();
            }
            System.out.print("spi of student number "+ (i+1) +" is = "+a[i].spiCalculate());
        }
        sc.close();
    }
}
