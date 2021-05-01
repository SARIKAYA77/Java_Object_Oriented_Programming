package inheritance;

public class StudentManager extends UserManager{

    public void Register_Course(Student student,Instructor instructor) {
        System.out.println(student.name_surname+" student named:"+instructor.course_name + "enrolled in the course named" );
    }


    public void Student_Rating(Student student,Instructor instructor) {
        System.out.println(student.name_surname+" student named:"+"user gave 4.7 points this course"+instructor.course_name);
    }

    public void Student_Comment(Student student,Instructor instructor) {
        System.out.println(student.name_surname+" student named:"+"made a very nice comment on the instructor named"+instructor.name_surname);
    }

    public void Student_Course_Count(Student student) {
        System.out.println(student.name_surname+" student named:"+"number of registered courses"+student.course_count_registered);
    }
}