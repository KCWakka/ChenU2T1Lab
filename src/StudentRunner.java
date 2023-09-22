public class StudentRunner {
    public static void main(String [] args) {
        Student student1= new Student("Bob", 17, 69, 3.1 );
        student1.introduce();
        student1.printStudentInfo();

        Student student2 = new Student("Jen", 18, 58, 4.0);
        student2.printCatInfo();
        student2.introduce();
    }
}
