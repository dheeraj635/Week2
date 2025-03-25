package day8;

public class Course {
    String courseName;
    double duration;
    double fee;

    public static String instituteName = "VIT";

    public Course(String courseName, double duration, double fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    
    }

    public void displayCourseDetails(){
        System.out.println("Institute Name : "+instituteName);
        System.out.println("Cousre Name : "+courseName);
        System.out.println("Duration : "+duration);
        System.out.println("Fee : "+fee);
    }

    public static void updateInstituteName(String newname){
        instituteName = newname;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 2, 20000);
        Course c2 = new Course("Python", 2, 15000);
        
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();

        Course.updateInstituteName("SRM");

        System.out.println();
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}
