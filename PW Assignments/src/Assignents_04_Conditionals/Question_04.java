package Assignents_04_Conditionals;

import java.util.Scanner;

/*
 Write a program to print positive number entered by the user, if user enters a negative number, it is skipped.
*/
public class Question_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        if (num < 0)
            System.out.println("Number is negative and is skipped !");

        else
            System.out.println("Number is positive ");
    }

}
