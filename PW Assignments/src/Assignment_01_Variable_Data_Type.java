public class Assignment_01_Variable_Data_Type {
    public static void main(String[] args) {
        // Q1 - Take 2 integer values in two variables x and y and print their product.
        int x = 2, y = 4;
        System.out.println(x * y);
        // Q2 - Print the ASCII value of character ‘U’.
        char u = 'U';
        System.out.println((int)u);
        //Q3 - Write a Java program to take the length and breadth of a rectangle and print its area.
        int length = 7, breadth = 4;
        System.out.println(length*breadth);
        // Q4 - Write a Java program to calculate the cube of a number.
        int num = 4;
        System.out.println(num*num*num);
        // Q5 - Write a Java program to swap two numbers with the help of a third variable.
        int num1 = 10;
        int num2 = 20;
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1+" "+num2);
    }
}