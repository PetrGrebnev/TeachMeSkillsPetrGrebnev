package Lesson3;

import java.util.Scanner;
import Lesson3.computer.Computer;
import Lesson3.computer.Cpu;
import Lesson3.computer.Ram;
import Lesson3.computer.Hdd;

public class Main {
    public static int getRandomDiceNumber(){
        return (int) (Math.random()*2);
    }

    public static void main(String[] args) {
        int activation;
        int confirmation;
        boolean enabled = false;
        // Создание первого компьютера
        Computer hpComputer = new Computer("Dekstop", 7634.53, "HP", "g500", 25);
        Ram hpRam = new Ram(4, "DDR3");
        Cpu hpCpu = new Cpu(3.7, 8,64);
        Hdd hpHdd = new Hdd("Hdd", 1000, "Asus");
        System.out.println(hpComputer + "\n" + hpRam + "\n" + hpCpu + "\n" + hpHdd);
        // Создание второго компьютера
        Computer asusComputer = new Computer("Laptop", 11999.99, "Asus", "gtr34", 10);
        Ram asusRam = new Ram(8, "DDR4");
        Cpu asusCpu = new Cpu(3.5, 4,128);
        Hdd asusHdd = new Hdd("Sdd", 512, "Hp");
        System.out.println(asusComputer + "\n" + asusRam + "\n" + asusCpu + "\n" + asusHdd);

        System.out.println();
        System.out.println("Сравнение по бренду: " + asusComputer.equals(hpComputer));
        System.out.println(hpComputer.hashCode());
        System.out.println(asusComputer.hashCode());
        System.out.println();

        int WorkingCount = hpComputer.maxWorkingCount;
        //Цикл включения выключения
        while ( WorkingCount>0) {
            if (enabled != true) {
                System.out.println("Включите компьютер");
                Scanner newActivation = new Scanner(System.in);
                System.out.print("Введите 1 или 0 для запуска компьютера ");
                activation = newActivation.nextInt();
                if (activation >= 2 || activation <= -1 )System.out.println("Введенно не верное значение");
                else {
                    confirmation = getRandomDiceNumber();
                    if (activation == confirmation) {
                        WorkingCount -= 1;
                        System.out.println("Компьютер запускается");
                        System.out.println("Оставшиеся количество запусков " + WorkingCount);
                        enabled = true;
                    } else {
                        WorkingCount = 0;
                        System.out.println("Бдууууууум - БААААХ");
                        System.out.println("Оставшиеся количество запусков " + WorkingCount);
                    }
                }
            }
            else {
                System.out.println("Выключите Компьютер");
                Scanner newActivation = new Scanner(System.in);
                System.out.print("Введите 1 или 0 для выключения компьютера ");
                activation = newActivation.nextInt();
                if (activation >= 2 || activation <= -1 )System.out.println("Введенно не верное значение");
                else {
                    confirmation = getRandomDiceNumber();
                    if (activation == confirmation) {
                        System.out.println("Компьютер выключается");
                        System.out.println("Оставшиеся количество запусков " + WorkingCount);
                        enabled = false;
                    } else {
                        WorkingCount = 0;
                        System.out.println("Бдууууууум - БААААХ");
                        System.out.println("Оставшиеся количество запусков " + WorkingCount);
                    }
                }
            }
        }
    }
}
