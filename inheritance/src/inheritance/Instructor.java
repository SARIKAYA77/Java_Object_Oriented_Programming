package inheritance;

public class Instructor extends User{

    public double RatingOrt = 4.4;
    public String Student_Amount;
    String  course_name;

    public Instructor(int id, String name_surname, String password, String email,String course_name) {
        super(id, name_surname, password, email);

    }


    public String getStudentAmount() {
        return Student_Amount;
    }

    public double getRatingOrt() {
        return RatingOrt;
    }




}