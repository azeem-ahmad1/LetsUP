import java.util.Scanner;

public class Two_point_distance {

    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the  value of x1 coordinate"); //
            double x1 = scanner.nextDouble();
            System.out.println("Enter the  value of x2 coordinate");
            double x2 = scanner.nextDouble();
            System.out.println("Enter the  value of y1 coordinate");
            double y1 = scanner.nextDouble();
            System.out.println("Enter the  value of y2  coordinate");
            double y2 = scanner.nextDouble();
            //        distance between two points using formula d=sqrt((x2-x1)^2+(y2-y1)^2)
            double X = x2-x1;
            double Y = y2-y1;
              Double distance= Math.sqrt(X*X+Y*Y);
      System.out.println( distance);
        }

    }
}
