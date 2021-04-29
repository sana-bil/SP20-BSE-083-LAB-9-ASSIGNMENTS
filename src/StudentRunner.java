public class StudentRunner {
    public static void main(String[] args) {
        Student student= new PhdStudent();
        student.takeExam();
        Student student1= new GradStudent();
        student1.takeExam();
    }
}
