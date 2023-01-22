package Assignments_02_Input_Taking;

import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {

        // Q3 - If the marks of Robert in three subjects are entered through keyboard
        // (each out of 100),
        // write a program to calculate his total marks and percentage marks.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 3 Subjects :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        double total_marks = num1 + num2 + num3;
        double percentage = (total_marks / 300.00) * 100;
        System.out.println("Total Marks " + total_marks);
        System.out.println("Percentage is " + String.format("%.1f", percentage) + " %");
        sc.close();

    }
}
