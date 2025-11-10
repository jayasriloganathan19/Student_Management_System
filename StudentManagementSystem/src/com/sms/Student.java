package com.sms;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String course;

    public Student(int id, String name, int age, String gender, String course) {
        this.id = id; this.name = name; this.age = age; this.gender = gender; this.course = course;
    }

    public Student(String name, int age, String gender, String course) {
        this.name = name; this.age = age; this.gender = gender; this.course = course;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getCourse() { return course; }
}
