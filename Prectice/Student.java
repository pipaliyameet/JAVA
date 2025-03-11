import java .util.Scanner;
class StudentMark{
    int id_no;
    int no_of_subjects_registered; 
    int[] subjectCode; 
    double[] subjectCredits; 
    int[] gradeObtained;

    StudentMark(int id_no , int numberOfSubjectsRegistered){
        this.id_no=id_no;
        this.no_of_subjects_registered=numberOfSubjectsRegistered;
        subjectCode = new int[numberOfSubjectsRegistered];
        this.subjectCredits = new double[numberOfSubjectsRegistered];
        gradeObtained = new int[numberOfSubjectsRegistered];
    }
}
public class Student {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a student number : ");
        int n = sc.nextInt();
        StudentMark[] array = new StudentMark[n];

        for(int i=0 ; i<n ; i++){

            System.out.print("Enter a student no "+(i+1)+" id number : ");
            int id =sc.nextInt();
            System.out.print("Enter a number of subject : ");
            int numberOfSubjects = sc.nextInt();
            array[i]= new StudentMark(id , numberOfSubjects);

            for(int j=0 ; j<numberOfSubjects ; j++){
                // sc.nextLine();
                System.out.print("Enter a grade obtained of subject no "+(j+1)+" : ");  
                array[i].gradeObtained[j]  = sc.nextInt();
                System.out.print("Enter a subject code of subject no "+(j+1)+": ");
                array[i].subjectCode[j]    = sc.nextInt();
                System.out.print("Enter a subject credit of subject no "+(j+1)+": ");
                array[i].subjectCredits[j] = sc.nextInt();
            }
        }

    }
}
