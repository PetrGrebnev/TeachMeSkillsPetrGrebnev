package lesson3;

import java.util.Objects;
import lesson3.computer.*;


/**
 * Main должен создавать компьютеры и работать с ними.
 * Методы:
 * 1)	включить, при включении может произойти сбой, при вызове метода
 * рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если
 * угадали комп включается, если нет сгорает. Если комп сгорел, при попытке
 * включить нужно выдать сообщение что ему конец
 * 2)	выключить (аналогично включению)
 * Написать проверки, которые разум вам подскажет нужно провести при включении выключении.
 * Желательно каждую новую проверку в новом методе.
 */

public class Main {

    private static Object computer;

    public static void main(String[] args) {
        Computer onPc = new Computer("Dekstop", 435.99, "HP", "gtr34", 100,
                new Ram(4, "DDR4"), new Cpu(3.45, 8, 12),
                new Hdd("SSD", 525, "ASUS"));
        System.out.println(onPc);
        Computer twoPc = new Computer("Laptop", 999.99, "HP", "G500", 50,
                new Ram(16,"DDR5"), new Cpu(4.5, 8,24),
                new Hdd("SSD", 1024, "HP"));
        System.out.println(twoPc);
        System.out.println(Objects.equals(computer, onPc == twoPc));
        Computer.onOff(onPc.maxWorkingCount);
    }
}
