package org.example;

import java.util.ArrayList;
import java.util.List;

public class Module {
    String name, id;
    List<Student> students = new ArrayList<>();
    List<CourseProgramme> courses = new ArrayList<>();
    Lecturer lecturer;

    public Module(String name, String id, Lecturer lecturer) {
        this.name = name;
        this.id = id;
        this.lecturer = lecturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public void addCourses(CourseProgramme course) {
        courses.add(course);
    }
    public List<CourseProgramme> getCourses() {
        return courses;
    }

    public void addStudent(Student std) {
        students.add(std);
    }
    public List<Student> getStudents() {
        return students;
    }
}
