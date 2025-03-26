public class EmployeesRecords {
    
    public static class Employee {

        public int EmployeeID;
        protected String department;
        private double Salary;

        public Employee(int EmployeeID, String department, double Salary){
            this.EmployeeID = EmployeeID;
            this.department = department;
            this.Salary = Salary;

        }

        public double getSalary(){
            return Salary;
        }

        public void setSalary(double Salary){
            this.Salary = Salary;
        }

        public void displayEmployee(){
            System.out.println("Employee id : "+EmployeeID);
            System.out.println("department : "+department);
            System.out.println("Salary : "+Salary);
        }
    }

    public static class Manager extends Employee{
        
        private String EmployeeName;
        
        public Manager(int EmployeeID, String department, double Salary, String EmployeeName){
            super(EmployeeID, department, Salary);
            this.EmployeeName = EmployeeName;
        }

        public void displayManager(){
            System.out.println("Employee id : "+EmployeeID);
            System.out.println("Employee Name : "+EmployeeName);
            System.out.println("department : "+department);
            System.out.println("Salary : "+getSalary());
            
        }
    }

    public static void main(String[] args) {
        
        Employee emp = new Employee(4, "Developer", 50000);

        emp.displayEmployee();
        System.out.println();

        emp.setSalary(60000);
        emp.displayEmployee();
        System.out.println();

        Manager man = new Manager(4, "Developer", 60000, "Dheeraj");
        man.displayManager();
    }
}
