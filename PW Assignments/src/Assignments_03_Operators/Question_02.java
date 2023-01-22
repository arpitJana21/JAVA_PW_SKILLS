package Assignments_03_Operators;

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        // Q2 - Swap two numbers without the use of third variable.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter The Second Number : ");
        int num2 = sc.nextInt();
        System.out.println("After Swaping : ");
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1);
        System.out.println(num2);
        sc.close();
    }
}
