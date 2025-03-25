package day8;

import java.util.Scanner;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    public CarRental(String customerName, String carModel, int rentalDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String customerName1 = sc.nextLine();
        String carModel1 = sc.nextLine();
        int rentalDays1 = sc.nextInt();

        CarRental car = new CarRental(customerName1, carModel1, rentalDays1);

        System.out.println("Customer Name : "+car.customerName);;
        System.out.println("Car Model : "+car.carModel);
        System.out.println("Rental Days : "+car.rentalDays);
        //int total = (car.rentalDays)*150;
        System.out.println("Total Cost for "+car.rentalDays+" days are "+(car.rentalDays)*150);
       // System.out.println("Total Cost for "+car.rentalDays+" days are "+total);
    }
}