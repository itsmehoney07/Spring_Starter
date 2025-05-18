package com.learning.Alien;

import com.learning.Laptop.Computer;
import com.learning.Laptop.Laptop;
import java.beans.ConstructorProperties;
public class Alien {
    private int aid;
    private Computer computer;

    @ConstructorProperties({"aid","computer"})
    public Alien(int aid, Computer computer) {
        this.aid = aid;
        this.computer = computer;
    }

    public Alien(){}

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public Computer getCom() {
        return computer;
    }

    public void setLap(Computer computer) {
        this.computer = computer;
    }

    public void code(){
        System.out.println("coding");
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", computer=" + computer +
                '}';
    }
}
