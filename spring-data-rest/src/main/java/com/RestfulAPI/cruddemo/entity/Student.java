package com.RestfulAPI.cruddemo.entity;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name="student")
public class Student {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "stud_id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="mobile")
    private BigInteger mobile;

    // define constructors
    public Student() {

    }

    public Student(String firstName, String lastName, String email, BigInteger mobile) {
        this.firstName = firstName;
        this.lastName=lastName;
        this.email=email;
        this.mobile=mobile;
    }

    // define getters and setters


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigInteger getMobile() {
        return mobile;
    }

    public void setMobile(BigInteger mobile) {
        this.mobile = mobile;
    }

    // define toString method


    @Override
    public String toString() {
        return "Student{" +
                "email='" + email + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
