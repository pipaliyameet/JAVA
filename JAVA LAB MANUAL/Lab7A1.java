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
    double spi;

    public Student(int idNumber , int numberOfSubjectsRegistered){
        this.idNumber = idNumber;
        this.numberOfSubjectsRegistered = numberOfSubjectsRegistered;
        subjectCode = new int[numberOfSubjectsRegistered];
        subjectCredits = new int[numberOfSubjectsRegistered];
        gradeObtained = new String[numberOfSubjectsRegistered];
    }

    public void print(){
        System.out.println("Student id number is = "+this.idNumber);
        System.out.println("total number of subject is = "+this.numberOfSubjectsRegistered);
        System.out.println("subject code is = "+this.subjectCode);
    }

    //subject(1)mark
    public double spiCalculate(){
        return 0;
    }
}

public class Lab7A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of student : ");
        int n = sc.nextInt();

        Student[] a = new Student[n];

        for(int i=0 ; i<n ;i++){
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
                a[i].print();
            }
        }
        for(int i=0 ; i<n ; i++){

        }
        sc.close();
    }
}
