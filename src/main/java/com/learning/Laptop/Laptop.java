package com.learning.Laptop;

public class Laptop implements Computer {
    private int ram;
    private String model;
    private int price;
    public Laptop(){
    }

    public Laptop(int ram, String model, int price) {
        this.ram = ram;
        this.model = model;
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        System.out.println("setter called for ram");
        this.ram = ram;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        System.out.println("setter called for model");
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("setter called for price");
        this.price = (int)price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void compile() {
        System.out.println("compiling using laptop");
    }
}
