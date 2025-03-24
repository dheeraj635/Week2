import java.util.Scanner;

public class AreaOfCircle { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: "); 
        double radius = sc.nextDouble();
        sc.close();

        double result = Circles.Area(radius);
        System.out.println("Area of circle: " + result); 
    }
}

class Circles {
    public static double Area(double radius) {
        return Math.PI * radius * radius;
    }
}
