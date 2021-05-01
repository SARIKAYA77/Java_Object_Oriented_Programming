package inheritance;

public class InstructorManager extends UserManager{

    public void Instructor_Student_Count(Instructor instructor) {
        System.out.println("student count totally:"+instructor.getStudentAmount());
    }



    public void Instructor_Rating_Ort(Instructor instructor) {
        System.out.println("Instructor rating ort:"+instructor.getRatingOrt());
    }
}
