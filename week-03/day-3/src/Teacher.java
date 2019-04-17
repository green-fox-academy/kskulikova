//Teacher
//teach(student) -> calls the students learn method
//answer()

class Teacher {

    void teach(Student student){
        student.learn();
    }

    void answer(){
        System.out.println("The best answer to your question would be the one you find yourself");
    }
}
