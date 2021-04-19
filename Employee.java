package com.tts;

import java.time.LocalDate;

public class Employee {
    public enum JobTitle {Accountant, Cashier, Manager, Driver}

    private String firstName;
    private String lastName;
    private String jobTitle;
    private int age;
    private LocalDate startDate;
    private int id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(checkJobTitle(jobTitle)) {
            this.jobTitle = jobTitle;
        }
        else {
            this.jobTitle="Not-Assigned";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName, String jobTitle, LocalDate startDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
    }

    public String getFullName() {
        String fullName = this.firstName + " " + this.lastName;
        return fullName;
    }

    public boolean checkJobTitle(String jobTitle) {
        boolean found = false;
        for (JobTitle i : JobTitle.values()) {
            if (i.toString().equalsIgnoreCase(jobTitle)) {
                found = true;
            } else {
                found = false;
            }

        }
        return found;
    }
}