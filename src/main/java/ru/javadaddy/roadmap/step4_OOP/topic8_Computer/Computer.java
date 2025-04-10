package ru.javadaddy.roadmap.step4_OOP.topic8_Computer;

public class Computer {
    private String brand;
    private String model;
    private String ram;

    public Computer(String brand, String model, String ram) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String displaySpecs() {
        return "Brand: " + "[" + brand + "]" +
                ", Model: " + "[" + model + "]" +
                ", RAM: " + "[" + ram + "]" + " GB";
    }
}
