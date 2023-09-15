// Create a program that checks if a character is a vowel or consonant.

import java.util.Scanner;

public class vowel {
    /**
     
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the char");

        char ch = sc.next().charAt(0);

        if(ch=='a'|| ch == 'e'||ch=='i'|| ch == 'o'||ch=='u' ||ch == 'A'||ch=='E'||ch=='I'|| ch == 'O'||ch=='U' ){
            System.out.println("The entered Character is vowel");
        }
        else{
            System.out.println("The Entered char is consonant");
        }
    }
}
