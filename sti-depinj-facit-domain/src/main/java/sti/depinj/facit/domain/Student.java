package sti.depinj.facit.domain;

public class Student {

    private String givenName;

    private String surName;

    public Student(String givenName, String surName) {
        this.givenName = givenName;
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
