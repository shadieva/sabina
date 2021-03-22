package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "main_1")
public class Main {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullname;
    private String faculty;
    private String gender;
    private int credits;

    public Main() {
    }

    public Main(String fullname, String faculty, String gender, int credits) {
        this.id = id;
        this.fullname = fullname;
        this.faculty = faculty;
        this.gender = gender;
        this.credits = credits;
    }

    public Long getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getGender() {
        return gender;
    }

    public int getCredits() {
        return credits;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

}
