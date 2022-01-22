package lesson2;
import java.util.Scanner;

/**
 * ввести с клавиатуры 2 числа (Scanner)  и присвоить их двум переменнм (weght, hight).
 * Нарисовать фигуру из буквы О размером weght x hight
 */

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ширину: ");
        int width = scanner.nextInt();
        System.out.print("Введите высоту: ");
        int height = scanner.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print('O');
            }
            System.out.println("");
        }
    }
}
