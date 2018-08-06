package com.polygalov.restful.model;

public class Employee {

    private String number;
    private String name;
    private String position;

    public Employee() {
    }

    public Employee(String number, String name, String position) {
        this.number = number;
        this.name = name;
        this.position = position;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
