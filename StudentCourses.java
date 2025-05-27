package program2;

public class StudentCourses {
  String[] semester1 = { "Math", "English", "Physics" };
  int[] marks1 = { 85, 78, 90 };

  String[] semester2 = { "Chemistry", "Biology", "Computer" };
  int[] marks2 = { 88, 92, 95 };

  public void displayCourses() {
    System.out.println("Semester 1:");
    for (int i = 0; i < semester1.length; i++) {
      System.out.println(semester1[i] + ": " + marks1[i]);
    }

    System.out.println("Semester 2:");
    for (int i = 0; i < semester2.length; i++) {
      System.out.println(semester2[i] + ": " + marks2[i]);
    }
  }

  public static void main(String[] args) {
    Student student = new Student("Rahul", "2004-06-15");
    student.displayDetails();

    StudentCourses courses = new StudentCourses();
    courses.displayCourses();
  }
}
