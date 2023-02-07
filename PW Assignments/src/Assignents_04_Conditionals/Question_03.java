package Assignents_04_Conditionals;

import java.util.Scanner;

/*
 Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and  Profit or Loss.
 */
public class Question_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost Price : ");
        int cP = sc.nextInt();
        System.out.print("Enter the sell Price : ");
        int sP = sc.nextInt();
        sc.close();

        if (sP > cP)
            System.out.println("Profit : " + (sP - cP));
        else
            System.out.println("Loss : " + (cP - sP));
    }

}
