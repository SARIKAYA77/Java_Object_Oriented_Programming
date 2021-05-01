package inheritance;

public class Main {

    public static void main(String[] args) {
        User user = new User(01, "emily clark", "458468", "emily@gmail.com");
        UserManager userManager = new UserManager();
        userManager.UserEmail(user);
        userManager.UserPassword(user);



        Instructor instructor = new Instructor(1, "jack wilson", "123456", "jack@gmail.com", "Java");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.Instructor_Student_Count(instructor);
        instructorManager.Instructor_Rating_Ort(instructor);

        Student student= new Student(01, "emily clark", "458468", "emily@gmail.com", 2);

        StudentManager studentManager = new StudentManager();
        studentManager.Student_Rating(student,instructor);
        studentManager.Student_Comment(student,instructor);
        studentManager.Student_Course_Count(student);
        studentManager.Register_Course(student,instructor);



        }
    }



