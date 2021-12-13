package Lesson3.computer;

import java.util.Objects;

public class Computer {
    String type;
    double cost;
    String brand;
    String model;
    public int maxWorkingCount;


    public Computer(String type, double cost, String brand, String model, int maxWorkingCount) {
        this.type=type;
        this.cost=cost;
        this.brand=brand;
        this.model=model;
        this.maxWorkingCount=maxWorkingCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return brand == computer.brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, cost, brand, model, maxWorkingCount);
    }

    @Override
    public String toString() {
        return "Компьютер " + "\n" +
                "Тип: " + type +"\n"+
                "Цена: "  + cost + "\n" +
                "Бренд: " + brand + "\n" +
                "Модель: " + model + "\n" +
                "Количество включение: " + maxWorkingCount;
    }
}

