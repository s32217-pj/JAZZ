package com.example.OskNie.Data;

public class Human {
    private String Name, Surname;

    public Human() {
        this.Name = "";
        this.Surname = "";
    }

    public Human(String name, String surname) {
        Name = name;
        Surname = surname;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
