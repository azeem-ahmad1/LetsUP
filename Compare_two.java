// Write a program that compares two numbers and outputs. the larger one
import java.util.Scanner;
public class Compare_two {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int max=0;
        System.out.println("Enter the first and second number");
        int num1= input.nextInt();
        int num2= input.nextInt();
        if(num1>num2){
           System.out.println("The Lagger number is "+num1);

    }
     else if(num2>num1 ){
           System.out.println("The Lagger number is "+num2);

}
else{
    System.out.println("Both are equal ");
}
input.close();


    }}
