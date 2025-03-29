package com.example.OskNie.Models;

public class Car {
    private String Manufacturer;
    private String Model;

    public Car(String manufacturer, String model) {
        Manufacturer = manufacturer;
        Model = model;
    }

    public Car() {
        this.Manufacturer = "";
        this.Model = "";
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }
}
