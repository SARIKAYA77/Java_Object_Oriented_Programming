
import java.util.*;
import java.util.concurrent.TimeUnit;
public class main {

    public static void main(String[] args) throws InterruptedException {
        Course courses = new Course();

        Scanner input = new Scanner(System.in);
        System.out.print("Which course you want to enroll in, java angular or python : ");
        String msg = input.nextLine(); //String değeri burda alıyoruz
        System.out.println("Checking the status of the course you want: "+msg);
        TimeUnit.SECONDS.sleep(5);
        courses.is_published = true;
        if(msg.contains("java")){
            courses.setId(1);
            courses.set_description("Java ve React ile yazılım geliştirme");
            System.out.println(courses.get__is_published(courses.is_published));
            System.out.print("You can enroll in this course : " );
            CourseManager courseManager = new CourseManager();
            courseManager.students = new Students();
            courseManager.get_detail();
            System.out.println(courses.get__is_published(courses.is_published));

            System.exit(0);}

        if(msg.contains("python")){
            courses.setId(2);
            courses.set_description("Programlamaya giriş ve python kursu");
            CourseManager courseManager = new CourseManager();
            courseManager.addCourse(courses.description);

            System.out.println(courses.get__is_published(courses.is_published=false));
            System.out.print("Registration for this course has expired");
            System.exit(0);
            }

        if(msg.contains("angular")) {
            courses.setId(3);
            courses.set_description("C# ve angular kursu");
            System.out.println(courses.get__is_published(courses.is_published = false));
            System.out.print("Registration for this course has expired");
            System.exit(0);
        }






    }
}
