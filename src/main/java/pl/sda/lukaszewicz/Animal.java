package pl.sda.lukaszewicz;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static java.time.LocalTime.now;

abstract class Animal {
    private int weight;
    private LocalDateTime eatingTime;
    String name;

    public String getName() {
        return name;
    }

    public Animal() {
        eatingTime = LocalDateTime.now();
    }

    public LocalDateTime getEatingTime() {
        return eatingTime;
    }

    public int getWeight() {
        return weight;
    }

    public Animal(int weight, String name) {
        this.weight = weight;
        this.name = name;
        this.eatingTime = LocalDateTime.now();
    }

    public void eat() throws Exception {
        this.eatingTime = LocalDateTime.now();
    }

    public boolean isAlive() {
        LocalDateTime tenDaysBefore = LocalDateTime.now().minus(10, ChronoUnit.DAYS);
        return getEatingTime().isAfter(tenDaysBefore);
    }

    void display() {
//        System.out.println("Jestem nieźdźwiedziem: " + getClass().getSimpleName()+
//        "waze: " + getWeight() + "mam na imie: " + getName());
        System.out.println(getName() + ", " + "ważę: " + getWeight() + " kg");
    }


}
