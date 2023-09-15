// Implement a code that determines if a person is eligible to vote based on their age.
import java.util.Scanner;
public class Vote {
    static int  eligible=18;
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.println("Enter your age ");
       int age= sc.nextInt();
       if (age>eligible) {
System.out.println("You are eligible for voting");
       } 
       else if (age==eligible){
        System.out.println("you can vote if You Have voter card");
       }
       else{
        System.out.println("Sorry you cannot vote yet, come back after "+(eligible-age)+" years.");
       }
       sc.close();
    }
}
