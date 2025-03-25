package day8;

public class Vehicle {
    String ownerName;
    String vehicleType;

    public static double registrationFee = 10000.00;

    public Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails(){
        System.out.println("Owner Name : "+ownerName);
        System.out.println("Vehicle Type : "+vehicleType);
        System.out.println("Registration Fee : "+registrationFee);
    }
    
    public static void updateRegistrationFee(double newFee){
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Dheeraj", "two wheeler");
        Vehicle v2 = new Vehicle("Achyuth", "two wheeler");

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(20000);

        System.out.println();
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}
