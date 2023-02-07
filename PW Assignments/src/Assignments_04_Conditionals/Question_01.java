package Assignments_04_Conditionals;

import java.util.Scanner;

/*
Write a program which takes the values of length and breadth from user and check if it is a square or not.
 */
public class Question_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length :");
        int length = sc.nextInt();
        System.out.println("Enter breadth :");
        int breadth = sc.nextInt();
        sc.close();
        if (length == breadth)
            System.out.println("It is Square");
        else
            System.out.println("It is Rectangle");
    }
}
