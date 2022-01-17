package lesson2;
import java.util.Scanner;

/**
 * создать 3 числа типа int, short, byte. Вывести на экран макс значение, мин значение и среднее
 */

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число Byte: ");
        int bytik = scanner.nextInt();
        System.out.print("Введите число Int: ");
        int integer = scanner.nextInt();
        System.out.print("Введите число Short: ");
        int shortik = scanner.nextInt();
        threeMaxMinAverage(bytik, integer, shortik);
    }
     public static void threeMaxMinAverage(int a, int b, int c){
         int firstСouple = maxTwoNumber(a, b);
         int secondCouple = maxTwoNumber(a, c);
         int bigNumber = maxTwoNumber(firstСouple,secondCouple);
         System.out.println("Наибольшое число: " + bigNumber);
         firstСouple = minTwoNumber(a,b);
         secondCouple = minTwoNumber(a,c);
         int smallNumber = minTwoNumber(firstСouple,secondCouple);
         System.out.println("Наименьшее число: " + smallNumber);
         firstСouple = maxTwoNumber(a,b);
         secondCouple = maxTwoNumber(c,b);
         int thirdCouple = maxTwoNumber(a,c);
         firstСouple = minTwoNumber(firstСouple,secondCouple);
         secondCouple = minTwoNumber(thirdCouple,secondCouple);
         int averangeNumber = minTwoNumber(firstСouple,secondCouple);
         System.out.println("Среднее число: " + averangeNumber);
     }

    public static int maxTwoNumber (int a, int b){
        if (a > b){
            return a;
        } else return b;
    }

    public static int minTwoNumber (int a, int b){
        if (a < b){
            return a;
        } else return b;
    }
}
