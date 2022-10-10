package org.example;

import org.joda.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseProgrammeTest {

    CourseProgramme course1;
    Lecturer lecturer;
    Module module;
    Student student;

    @BeforeEach
    public void setup() {
        course1 = new CourseProgramme("Computer Science", new LocalDate(2022, 11, 22), new LocalDate(2023, 04, 11));

        lecturer = new Lecturer("Jason", 45, "12/05/1970", 123123);
        module = new Module("CT222", "3234234", lecturer);

        student = new Student("jordan", 21, "11/04/2001", 19989, course1);
    }

    @Test
    public void addModule() {
        lecturer.addModule(module);
        assertEquals(lecturer.getModules().get(0).getId(), module.getId());
        assertEquals(lecturer.getModules().size(), 1);
    }

    @Test
    public void getCourseName() {
        assertEquals(course1.getCourseName(), "Computer Science");
    }

    @Test
    public void addStudent() {
        course1.addStudent(student);
        assertEquals(course1.getStudents().size(), 1);
    }
}