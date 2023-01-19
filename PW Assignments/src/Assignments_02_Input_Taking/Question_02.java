package Assignments_02_Input_Taking;
import java.util.Scanner;
public class Question_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      Q2 - Input two different string and print them in same line.
        String str_1 = sc.nextLine();
        String str_2 = sc.nextLine();
        System.out.println(str_1+str_2);
    }
}
