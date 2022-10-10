package org.example;

import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class CourseProgramme {
    String courseName;
    List<Module> modules = new ArrayList<>();
    List<Student> enrolledStudents = new ArrayList<>();
    LocalDate startDate;
    LocalDate endDate;

    public CourseProgramme(String courseName, LocalDate startDate, LocalDate endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public List<Student> getStudents() {
        return enrolledStudents;
    }

    public void addModule(Module mod) {
        modules.add(mod);
    }

    public List<Module> getModules() {
        return modules;
    }
}
