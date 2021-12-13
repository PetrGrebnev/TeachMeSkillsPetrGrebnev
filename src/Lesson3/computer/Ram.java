package Lesson3.computer;

public class Ram {
    int capacity;
    String type;

    public Ram (int capacity, String type){
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Оперативная память " + "\n" +
                "Объем: " + capacity + "\n" +
                "Тип: " + type;
    }

}
