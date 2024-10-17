import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creates an instance of the scanner and Student classes
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        //Prompts the user to input the student details
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Enter student ID: ");
        int ID = sc.nextInt();

        //Stores the student details by invoking the setDetails() method
        s.setDetails(name,ID);

        //Prompts the user to enter the marks for the five units
        double[] marks = new double[5];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for unit " + (i+1) + ": ");
            marks[i] = sc.nextDouble();
        }

        //Stores the marks for student by invoking the setMarks method
        s.setMarks(marks);

        //Displays the information for the student
        System.out.println("Student ID: " + s.name);
        System.out.println("Student Name: " + s.ID);
        System.out.println("Student Average: " + s.calculateAverage());
        System.out.println("Your final grade is: " + s.assignGrade());
    }
}
