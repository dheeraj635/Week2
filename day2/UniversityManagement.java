public class UniversityManagement {

    
    static class Student {
        public int rollNumber;        
        protected String name;         
        private double CGPA;           

        
        public Student(int rollNumber, String name, double CGPA) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.CGPA = CGPA;
        }

      
        public double getCGPA() {
            return CGPA;
        }

     
        public void setCGPA(double CGPA) {
            if(CGPA >= 0.0 && CGPA <= 10.0) {
                this.CGPA = CGPA;
            } else {
                System.out.println("Invalid CGPA! Must be between 0.0 and 10.0");
            }
        }

        
        public void displayStudent() {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name       : " + name);
            System.out.println("CGPA       : " + CGPA);
        }
    }

    
    static class PostgraduateStudent extends Student {
        private String researchTopic;

        public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
            super(rollNumber, name, CGPA);
            this.researchTopic = researchTopic;
        }

        public void displayPostgradDetails() {
            System.out.println("Postgraduate Student Details:");
            System.out.println("Name           : " + name); 
            System.out.println("Research Topic : " + researchTopic);
            System.out.println("CGPA           : " + getCGPA()); 
        }
    }

    
    public static void main(String[] args) {
        
        Student s1 = new Student(101, "Alice", 8.5);
        System.out.println("=== Undergraduate Student ===");
        s1.displayStudent();

        System.out.println();

        PostgraduateStudent pg = new PostgraduateStudent(202, "Bob", 9.2, "AI in Healthcare");
        System.out.println("=== Postgraduate Student ===");
        pg.displayPostgradDetails();

        System.out.println("\nUpdating Bob's CGPA to 9.5...");
        pg.setCGPA(9.5);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}
