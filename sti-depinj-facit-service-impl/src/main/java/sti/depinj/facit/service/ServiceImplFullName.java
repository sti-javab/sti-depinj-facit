package sti.depinj.facit.service;

import sti.depinj.facit.domain.Student;

import java.util.Arrays;
import java.util.List;

public class ServiceImplFullName implements FacitService{

    private List<Student> students = Arrays.asList(
            new Student("Nasir", "Tedros"),
            new Student("Oskar", "Wadin"),
            new Student("Luliya", "Masfun")
    );

    @Override
    public List<String> getStudents() {
        return Arrays.asList(
                students.get(0).getGivenName() + " " + students.get(0).getSurName(),
                students.get(1).getGivenName() + " " + students.get(1).getSurName(),
                students.get(2).getGivenName() + " " + students.get(2).getSurName()
        );
    }
}
