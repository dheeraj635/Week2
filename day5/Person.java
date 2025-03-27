import java.util.Scanner;

public class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Person(Person p1){
        this.name=p1.name;
        this.age=p1.age;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name1 = sc.nextLine();
        int age1 = sc.nextInt();
        Person p1 = new Person(name1,age1);
        Person p2 = new Person(p1);

        System.out.println("name : "+p1.name);
        System.out.println("Age : "+p1.age);
        System.out.println("Name : "+p2.name);
        System.out.println("Age : "+p2.age);
        sc.close();
    }
}