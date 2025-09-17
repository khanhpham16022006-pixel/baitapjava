import java.util.Scanner;

class Student {
    private String rollNumber;
    private String name;
    private int age;
    private double grade;
    public Student(String rollNumber, String name, int age, double grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void display() {
        System.out.println("===== Student Information =====");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Grade      : " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
 
            System.out.print("Enter RollNumber (0xxx): ");
            String roll = sc.nextLine();
            if (!roll.matches("0\\d{3}")) {
                throw new Exception("Invalid RollNumber! Must be in format 0xxx.");
            }

            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            if (!name.matches("[A-Z][a-zA-Z ]*")) {
                throw new Exception("Invalid Name! First letter must be uppercase.");
            }

            System.out.print("Enter Age: ");
            int age = Integer.parseInt(sc.nextLine());
            if (age < 18 || age > 35) {
                throw new Exception("Invalid Age! Must be between 18 and 35.");
            }

            System.out.print("Enter Grade: ");
            double grade = Double.parseDouble(sc.nextLine());
            if (grade < 1 || grade > 10) {
                throw new Exception("Invalid Grade! Must be between 1 and 10.");
            }

            Student st = new Student(roll, name, age, grade);
            st.display();

        } catch (NumberFormatException e) {
            System.out.println("Error: Age and Grade must be numeric values!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
