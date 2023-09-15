// Write a program to check if a number is positive or negative.

import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int Number = sc.nextInt();
         if(Number<=0 ){
            System.out.println("the number is negative");

         } else{
            System.out.println("number is positive");
         }
    }
}
