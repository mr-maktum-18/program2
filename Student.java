package program2;

public class Student {
  String name;
  String dob;

  public Student(String name, String dob) {
    this.name = name;
    this.dob = dob;
  }

  public void displayDetails() {
    String[] parts;
    int birthYear = 0;

    if (dob.charAt(2) == '-') {
      parts = dob.split("-");
      birthYear = Integer.parseInt(parts[2]);
    } else if (dob.charAt(4) == '-') {
      parts = dob.split("-");
      birthYear = Integer.parseInt(parts[0]);
    }

    int currentYear = 2025;
    int age = currentYear - birthYear;

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }

  public static void main(String[] args) {
    Student student1 = new Student("Amit Kumar", "2004-07-12");
    student1.displayDetails();

    Student student2 = new Student("Priya Singh", "15-08-2003");
    student2.displayDetails();
  }
}
