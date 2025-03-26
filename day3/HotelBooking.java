package day8;

import java.util.Scanner;

public class HotelBooking {
    String guestName;
    String roomtype;
    int nights;
    public HotelBooking(){
        this.guestName = null;
        this.roomtype = null;
        this.nights=0;
    }
    public HotelBooking(String guestName, String roomtype, int nights){
        this.guestName =  guestName;
        this.roomtype = roomtype;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking h2){
        this.guestName = h2.guestName;
        this.roomtype = h2.roomtype;
        this.nights = h2.nights;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String guestname1 = sc.nextLine();
        String roomtype1 = sc.nextLine();
        int nights1 = sc.nextInt();

        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking(guestname1, roomtype1, nights1);
        HotelBooking h3 = new HotelBooking(h2);

        System.out.println("Guest name : "+h1.guestName);
        System.out.println("Room type : "+h1.roomtype);;
        System.out.println("No of Nights : "+h1.nights);

        System.out.println("Guest name : "+h2.guestName);
        System.out.println("Room type : "+h2.roomtype);;
        System.out.println("No of Nights : "+h2.nights);

        System.out.println("Guest name : "+h3.guestName);
        System.out.println("Room type : "+h3.roomtype);;
        System.out.println("No of Nights : "+h3.nights);

        sc.close();
    }
}
