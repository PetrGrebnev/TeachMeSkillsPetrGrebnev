package Lesson3.computer;

public class Cpu {
    double clockFrequency;
    int coreCount;
    int cashSize;

    public Cpu (double clockFrequency, int coreCount, int cashSize){
        this.clockFrequency = clockFrequency;
        this.coreCount = coreCount;
        this.cashSize = cashSize;
    }

    @Override
    public String toString() {
        return "Процессор " + "\n" +
                "Тактовая частота: " + clockFrequency + "\n" +
                "Колисчество ядер: " + coreCount + "\n" +
                "Объем кэша: " + cashSize;
    }
}
