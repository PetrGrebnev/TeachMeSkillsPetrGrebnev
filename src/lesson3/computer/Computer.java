package lesson3.computer;

import java.util.Objects;
import java.util.Scanner;

public class Computer {
    String type;
    double cost;
    String brand;
    String model;
    public int maxWorkingCount;
    Ram ram;
    Cpu cpu;
    Hdd hdd;
    static Scanner scanner = new Scanner(System.in);

    public Computer(String type, double cost, String brand, String model, int maxWorkingCount,
                    Ram ram, Cpu cpu, Hdd hdd) {
        this.type = type;
        this.cost = cost;
        this.brand = brand;
        this.model = model;
        this.maxWorkingCount = maxWorkingCount;
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return brand.equals(computer.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand);
    }

    @Override
    public String toString() {
        return "Компьютер " + "\n" +
                "Тип: " + type +"\n"+
                "Цена: "  + cost + "\n" +
                "Бренд: " + brand + "\n" +
                "Модель: " + model + "\n" +
                "Количество включение: " + maxWorkingCount + "\n" +
                ram + "\n" + cpu + "\n" + hdd;
    }

    public static int getRandomDiceNumber(){
        return (int) (Math.random()*2);
    }

    public static void onOff(int workingCount) {
        boolean enabled = false;
        int activation;
        int deactivation;
        int confirmation;
        //Цикл включения выключения
        while (workingCount > 0) {
            if (enabled != true) {
                System.out.println("Включите компьютер");
                System.out.print("Введите 1 или 0 для запуска компьютера ");
                activation = scanner.nextInt();
                if (activation >= 2 || activation <= -1) System.out.println("Введенно не верное значение");
                else {
                    confirmation = getRandomDiceNumber();
                    if (activation == confirmation) {
                        --workingCount;
                        System.out.println("Компьютер запускается");
                        System.out.println("Оставшиеся количество запусков " + workingCount);
                        enabled = true;
                    } else {
                        workingCount = 0;
                        System.out.println("Бдууууууум - БААААХ");
                        System.out.println("Оставшиеся количество запусков " + workingCount);
                    }
                }
            } else {
                System.out.println("Выключите Компьютер");
                System.out.print("Введите 1 или 0 для выключения компьютера ");
                deactivation = scanner.nextInt();
                if (deactivation >= 2 || deactivation <= -1) System.out.println("Введенно не верное значение");
                else {
                    confirmation = getRandomDiceNumber();
                    if (deactivation == confirmation) {
                        System.out.println("Компьютер выключается");
                        enabled = false;
                    } else {
                        workingCount = 0;
                        System.out.println("Бдууууууум - БААААХ");
                        System.out.println("Оставшиеся количество запусков " + workingCount);
                    }
                }
            }
        }
    }
}
