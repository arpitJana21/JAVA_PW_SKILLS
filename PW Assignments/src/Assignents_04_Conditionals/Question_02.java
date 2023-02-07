package Assignents_04_Conditionals;

import java.util.Scanner;
/*
 Write a program to print absolute value of a number entered by the user.
 */

public class Question_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (Negative / Positive) : ");
        int num = sc.nextInt();
        sc.close();
        if (num > 0)
            System.out.println("Absolute value of the Number is : " + num);
        else
            System.out.println("Absolute value of the Number is : " + (-num));
    }

}
