package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {

    @Test
    void getUsername() {
        Lecturer lecturer = new Lecturer("Seamus", 66, "19/08/1966", 123123);
        assertEquals(lecturer.getUsername(), "Seamus66");
    }
}