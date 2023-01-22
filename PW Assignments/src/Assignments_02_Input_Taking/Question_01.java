package Assignments_02_Input_Taking;

import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {

        // Q1 - Input name, roll number and field of interest from user and print in the
        // format below :
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = sc.nextLine();
        System.out.print("Enter your Roll No : ");
        short roll_no = sc.nextShort();
        sc.nextLine();
        System.out.print("Enter your field of Interest : ");
        String interest = sc.nextLine();
        System.out.println("Name : " + name);
        System.out.println("Roll number is : " + roll_no);
        System.out.println("Field of interest : " + interest);
        sc.close();
    }
}
