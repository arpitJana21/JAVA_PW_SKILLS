package Assignments_02_Input_Taking;

import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str1 = sc.next();
            String str2 = sc.next();
            System.out.println(str1 + str2);
        }
        sc.close();
    }
}
