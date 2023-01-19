package Assignments_02_Input_Taking;

import java.util.Scanner;

public class Question_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i<tc; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            ans.append(sum).append("\n");
        }
        System.out.println(ans);
    }
}
