public  class CourseManager {
    BaseCourseManager students;

    public void addCourse (String description) {
        System.out.println(description + " course registration has been completed successfully");

    }
    public void get_detail () {
        students.isCourseOver();

    }


}