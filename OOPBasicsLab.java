
import java.util.Scanner;

public class OOPBasicsLab {

    static class Student {

        String name;
        int age;
        double grade;

        public Student(String n, int a, double g) {
            name = n;
            age = a;
            grade = g;
        }

        public void displayInfo() {
            System.out.println("\nStudent Information:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
        }
    }

    static class StudentEncapsulated {

        private String name;
        private int age;
        private double grade;

        public StudentEncapsulated(String n, int a, double g) {
            name = n;
            age = a;
            grade = g;
        }

        public void setName(String n) {
            name = n;
        }

        public void setAge(int a) {
            age = a;
        }

        public void setGrade(double g) {
            grade = g;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getGrade() {
            return grade;
        }

        public void displayInfo() {
            System.out.println("\nStudent Information (Encapsulated):");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
        }
    }

    static class Vehicle {

        String brand;
        String model;
        double speed;

        public Vehicle(String b, String m, double s) {
            brand = b;
            model = m;
            speed = s;
        }

        public void accelerate(double increment) {
            speed += increment;
        }

        public void displayStatus() {
            System.out.println("\nVehicle Status:");
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Speed: " + speed + " km/h");
        }
    }

    static class BankAccount {

        String accountHolder;
        double balance;

        public BankAccount(String h, double b) {
            accountHolder = h;
            balance = b;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        }

        public void displayBalance() {
            System.out.println("Balance: " + balance);
        }
    }

    static class Circle {

        double radius;

        public Circle(double r) {
            radius = r;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getCircumference() {
            return 2 * Math.PI * radius;
        }

        public void displayDetails() {
            System.out.println("\nCircle Details:");
            System.out.println("Radius: " + radius);
            System.out.println("Area: " + getArea());
            System.out.println("Circumference: " + getCircumference());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ACTIVITY 1");
        Student s1 = new Student("Bulbasaur", 21, 3.0);
        Student s2 = new Student("Boy tapang", 67, 5.0);
        s1.displayInfo();
        s2.displayInfo();
        System.out.println("");

        
        
        System.out.println("ACTIVITY 2");
        StudentEncapsulated s3 = new StudentEncapsulated("Bulbasaur", 21, 3.0);
        s3.displayInfo();
        s3.setGrade(1.0);
        System.out.println("Updated grade for " + s3.getName() + ": " + s3.getGrade());
        System.out.println("");
        
        
        
        System.out.println("ACTIVITY 3");
        Vehicle car = new Vehicle("Toyota", "Supra", 60.0);
        Vehicle motorcycle = new Vehicle("Kawasaki", "Ninja", 40.0);
        car.displayStatus();
        car.accelerate(100);
        car.displayStatus();
        motorcycle.displayStatus();
        motorcycle.accelerate(70);
        motorcycle.displayStatus();
        System.out.println("");
        
        
        
        System.out.println("ACTIVITY 4");
        BankAccount acc = new BankAccount("Joe Papi", 2500);
        acc.displayBalance();
        acc.deposit(500.0);
        acc.withdraw(200.0);
        acc.displayBalance();
        System.out.println("");
        
        
        
        System.out.println("ACTIVITY 5");
        Circle c1 = new Circle(10.0);
        Circle c2 = new Circle(12.5);
        c1.displayDetails();
        c2.displayDetails();
        System.out.println("");
        
        
        
        input.close();
    }
}
