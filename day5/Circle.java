package day8;

import java.util.Scanner;

public class Circle {
        
    double radius;
    
    public Circle(){
        this.radius=5.5;
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Radius : "+c1.radius);

        Scanner sc = new Scanner(System.in);
        double radius1 = sc.nextDouble();
        Circle c2 = new Circle(radius1);
        System.out.println("Radius : "+c2.radius);

        sc.close();
    }
}
