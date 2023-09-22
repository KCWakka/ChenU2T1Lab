public class Student {
    private String name;

    private int age;

    private double height

    private double gpa;

    public Student(String studentName, int studentAge, double studentHeight, double studentGPA) {
        name = studentName;
        age = studentAge;
        height = studentHeight;
        gpa = studentGPA;
    }

    public void introduce() {
        System.out.print("Hello my name is " + name);
        if (height >= 67.2) {
            System.out.println(" and I am a tall student.");
        } else {
            System.out.println(" and I am a short student.");
        }
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " inches");
        System.out.println("Student's gpa: " + gpa);
    }
}