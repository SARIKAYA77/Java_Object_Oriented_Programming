package gamer.entities;

import java.util.Date;

import gamer.service.Entity;

public class Gamer implements Entity {

    private int id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String nationalityId;
    private String mail;
    private String password;




    public Gamer() {
        super();
    }




    public Gamer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId, String mail,
                 String password) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
        this.mail = mail;
        this.password = password;
    }




    public int getId() {
        return id;
    }




    public void setId(int id) {
        this.id = id;
    }




    public String getFirstName() {
        return firstName;
    }




    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }




    public String getLastName() {
        return lastName;
    }




    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




    public Date getDateOfBirth() {
        return dateOfBirth;
    }




    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }




    public String getNationalityId() {
        return nationalityId;
    }




    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }




    public String getMail() {
        return mail;
    }




    public void setMail(String mail) {
        this.mail = mail;
    }




    public String getPassword() {
        return password;
    }




    public void setPassword(String password) {
        this.password = password;
    }






}