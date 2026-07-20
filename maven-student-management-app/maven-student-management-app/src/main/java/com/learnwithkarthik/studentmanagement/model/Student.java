package com.learnwithkarthik.studentmanagement.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class Student {

    private Long id;

    @NotBlank(message = "Student name is required")
    private String name;

    @Email(message = "Enter a valid email address")
    @NotBlank(message = "Student email is required")
    private String email;

    @NotBlank(message = "Course name is required")
    private String course;

    @Positive(message = "Age must be greater than zero")
    private int age;

    public Student() {
    }

    public Student(Long id, String name, String email, String course, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
