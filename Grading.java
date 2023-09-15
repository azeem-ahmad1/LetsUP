// Write a program to calculate the grade for a given mark based on a grading scale.

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner Marks = new Scanner(System.in);
        System.out.println("enter the math marks");
        int Math = Marks.nextInt();
        System.out.println("enter the Urdu marks");
        int Urdu = Marks.nextInt();
        System.out.println("enter the English marks");
        int English = Marks.nextInt();
        System.out.println("enter the chemistry marks");
        int chemistry = Marks.nextInt();
        System.out.println("enter the physics marks");
        int physics = Marks.nextInt();
        String grade1, grade2, grade3, grade4, grade5;
        if (Math >= 90) {
            grade1 = "A";
        } else if (Math >= 80) {
            grade1 = "B+";
        } else if (Math >= 70) {
            grade1 = "c+";
        } else if (Math >= 60) {
            grade1 = "C";
        } else if (Math >= 50) {
            grade1 = "D+";
        } else if (Math >= 43) {
            grade1 = "D";
        } else {
            grade1 = "F";
        }
        if (Urdu >= 90) {
            grade2 = "A";
        } else if (Urdu >= 80) {
            grade2 = "B+";
        } else if (Urdu >= 70) {
            grade2 = "c+";
        } else if (Urdu >= 60) {
            grade2 = "C";
        } else if (Urdu >= 50) {
            grade2 = "D+";
        } else if (Urdu >= 43) {
            grade2 = "D";
        } else {
            grade2 = "F";
        }
        if (English >= 90) {
            grade3 = "A";
        } else if (English >= 80) {
            grade3 = "B+";
        } else if (English >= 70) {
            grade3 = "c+";
        } else if (English >= 60) {
            grade3 = "C";
        } else if (English >= 50) {
            grade3 = "D+";
        } else if (English >= 43) {
            grade3 = "D";
        } else {
            grade3 = "F";
        }
        if (physics >= 90) {
            grade4 = "A";
        } else if (physics >= 80) {
            grade4 = "B+";
        } else if (physics >= 70) {
            grade4 = "c+";
        } else if (physics >= 60) {
            grade4 = "C";
        } else if (physics >= 50) {
            grade4 = "D+";
        } else if (physics >= 43) {
            grade4 = "D";
        } else {
            grade4 = "F";
        }
        if (chemistry >= 90) {
            grade5 = "A";
        } else if (chemistry >= 80) {
            grade5 = "B+";
        } else if (chemistry >= 70) {
            grade5 = "c+";
        } else if (chemistry >= 60) {
            grade5 = "C";
        } else if (chemistry >= 50) {
            grade5 = "D+";
        } else if (chemistry >= 43) {
            grade5 = "D";
        } else {
            grade5 = "F";

        }
        double averageMark = (Math + Urdu + English + chemistry + physics) / 5.0;
        String TotalGrade;

        if (averageMark >= 90) {
            TotalGrade = "A";
        } else if (averageMark >= 80) {
            TotalGrade = "B+";
        } else if (averageMark >= 70) {
            TotalGrade = "c+";
        } else if (averageMark >= 60) {
            TotalGrade = "C";
        } else if (averageMark >= 50) {
            TotalGrade = "D+";
        } else if (averageMark >= 43) {
            TotalGrade = "D";
        } else {
            TotalGrade = "F";

        }
        System.out.println("The Math grade" + grade1);
        System.out.println("The Urdu grade" + grade2);
        System.out.println("The english grade" + grade3);
        System.out.println("The chemistry grade" + grade4);
        System.out.println("The Physics grade" + grade5);
        System.out.println("The over all subject grade" + TotalGrade);

    }
}
