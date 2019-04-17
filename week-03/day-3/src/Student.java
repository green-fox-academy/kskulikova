//Student
//learn()
//question(teacher) -> calls the teachers answer method

public class Student {

    void learn() {
        System.out.println("I'm learning something useful!");
    }

    private void question(Teacher teacher) {
        teacher.answer();
    }

    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();

        student.question(teacher);
        teacher.teach(student);
    }
}

