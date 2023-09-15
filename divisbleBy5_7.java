// Write a code to check if a number is divisible by both 5 and 7.
import java.util.Scanner;

public class divisbleBy5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");

        int num = sc.nextInt();
if(num%5==0 && num%7==0){
    System.out.println("the number is devisable by 5 and 7 "+num);
}
else{
    System.out.println("the number is not devisable by 5 and 7");
}
    }
}