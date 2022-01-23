package sti.depinj.facit.domain;

public class Student {

    private String givenName;

    private String surname;

    public Student(String givenName, String surname) {
        this.givenName = givenName;
        this.surname = surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
