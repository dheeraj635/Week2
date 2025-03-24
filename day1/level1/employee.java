import java.util.Scanner;
public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int id = sc.nextInt();
        double salary = sc.nextDouble();
        Employee emp = new Employee();
        emp.details(name, id, salary);
    }
}
class Employee{
    public static void details(String name, int id,double salary){
        System.out.println("Employee Name : "+name);
        System.out.println("Employee id : "+id);
        System.out.println("Employee salary : "+salary);
    }
}
