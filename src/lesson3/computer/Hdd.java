package lesson3.computer;

public class Hdd {
    String type;
    int capacity;
    String brand;
    public Hdd (String type, int capacity, String brand){
        this.type = type;
        this.capacity = capacity;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Основная память" + "\n"+
                "Тип: " + type + "\n" +
                "Объем памяти: " + capacity + "\n" +
                "Бренд: " + brand;
    }
}

