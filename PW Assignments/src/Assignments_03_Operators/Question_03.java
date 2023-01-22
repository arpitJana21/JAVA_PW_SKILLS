package Assignments_03_Operators;

import java.util.Scanner;

public class Question_03 {
    // Q3 - Write a program to calculate the sum of the digits of a 3-digit number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
