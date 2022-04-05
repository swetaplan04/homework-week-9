package week9;
/* 2. Re write the student mark sheet programme using if else and while loop.*/
import java.util.Scanner;

public class Program_2 {

    String name, result;
    String grade = null;
    int maths, science, english, rollno;
    float total, percentage;

    public static void main(String[] args) {
        Program_2 p = new Program_2();
        p.studentDetails();
        p.calculation();;
        p.logic();
        p.marksheet();

    }
    public void studentDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");
        name = scanner.nextLine();
        System.out.println("Enter student roll no: ");
        rollno = scanner.nextInt();


        System.out.println("Enter marks for maths: ");
        maths = scanner.nextInt();
        while (maths > 100 || maths < 0){
            System.out.println("Invalid input,Maths marks should be between 0 to 100");
            maths = scanner.nextInt();
        }
        System.out.println("Enter marks for science: ");
        science= scanner.nextInt();
        while (science > 100 || science < 0){
            System.out.println("Invalid input,science marks should be between 0 to 100");
            science = scanner.nextInt();


        }
        System.out.println("Enter marks for English: ");
        english= scanner.nextInt();
        while (english > 100 || english < 0){
            System.out.println("Invalid input,english marks should be between 0 to 100");
            english = scanner.nextInt();

        }

    }
    public void calculation(){
        total = maths + science + english;
        percentage = ((total * 100) /300 );
    }
    public void logic(){

        if (percentage >= 35) {
            result = "pass";

        } else {
            result = "fail";

        }
        if (percentage >= 80) {
            grade = "A+";
            System.out.println("Grade :" + grade);
        } else if (percentage >= 60 && percentage < 80) {
            grade = "A";
            System.out.println("Grade : " + grade);

        } else if (percentage >= 50 && percentage < 60) {
            grade = "B";
            System.out.println("Grade : " + grade);

        } else if (percentage >= 35 && percentage < 50) {
            grade = "C";
            System.out.println("Grade : " + grade);
        } else {
            grade = "No grade";
        }}
    public void marksheet(){


        System.out.println("  ___________ ");
        System.out.println(" |           Mark Sheet           |");
        System.out.println(" |____________|");
        System.out.println(" |   Name         :    " + name + "     |"); // sonali
        System.out.println(" |   Roll No:     " + rollno + "              |"); //34
        System.out.println(" |___________ |");
        System.out.println(" |   Subjects     :         Marks |");
        System.out.println(" |___________ |");
        System.out.println(" |   Math         :      " + maths + "       |"); // 78
        System.out.println(" |   Science:   " + science + "                |"); //67
        System.out.println(" |   English:   " + english + "                |"); // 89
        System.out.println(" |____________|");
        System.out.println(" |   Total        :      " + total + "      |");
        System.out.println(" |____________|");
        System.out.println(" |   Percentage    :   " + percentage + "       |");
        System.out.println(" |   Result        :     " + result + "     |");
        System.out.println(" |   Grade         :      " + grade + "       |"); //A
        System.out.println(" |____________|");
    }
}
