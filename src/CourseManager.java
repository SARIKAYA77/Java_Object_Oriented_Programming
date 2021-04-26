import java.util.concurrent.ThreadLocalRandom;
public  class CourseManager {
    BaseCourseManager students;
    int min = 50;
    int maks = 100;
    int rand= ThreadLocalRandom.current().nextInt(min, maks + 1);
    public void addCourse (String description) {
        System.out.println(description + " course registration has been completed successfully");

    }
    public void get_detail (String description) {
        {
            if(description=="Programlamaya giriş ve python kursu :"){
                System.out.println(description+ " course started success rate %0");
            }
            else if(description=="Java ve React ile yazılım geliştirme :")
                System.out.println(description + "success rate " + rand);
            else{
                System.out.println(description + " this course has expired");
            }
        }

    }


}


    //public void Add(Course course) {
      //  System.out.println(course.name + ": Added");
   // }

   // public void Update(Course course) {
    //    System.out.println(course.id + "Updated");
    //}