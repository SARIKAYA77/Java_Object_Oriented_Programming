package inheritance;

public class Student extends User {
    int course_count_registered;

    public Student(int id, String name_surname, String password, String email,int course_count_registered) {
        super(id, name_surname, password, email);
    }


    public int getCourse_count_registered() {
        return course_count_registered;
    }


}