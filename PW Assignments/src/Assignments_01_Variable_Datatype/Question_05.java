package Assignments_01_Variable_Datatype;

public class Question_05 {
    public static void main(String[] args) {
        // Q5 - Write a Java program to swap two numbers with the help of a third variable.
        int num1 = 10;
        int num2 = 20;
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1+" "+num2);
    }
}
