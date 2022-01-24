package lesson6;

import java.io.*;
import java.util.ArrayList;

/**
 * Из файла, в котором записаны числа (в диапозоне байт) считывать все значения до тех пор,
 * пока не считает значение «-1» включительно, и вывести на экран сумму всех значений.
 * Использовать метод “int read()”
 */

public class MethodRead {

    public static void main(String[] args) {
        summator();
    }

    public static String reader () {
        try (FileInputStream fileInput = new FileInputStream
                ("C:/Users/Petr/IdeaProjects/Testing/src/lesson6/numbers")) {
            int byteValue;
            StringBuilder numIntFile = new StringBuilder();
            while ((byteValue = fileInput.read()) != -1) {
                if (numIntFile.indexOf("-1") != -1) break;
                numIntFile.append((char) byteValue);
            }
            System.out.println(numIntFile);
            return numIntFile.toString();
        } catch (IOException e) {
            return "Файл чтения отсутсвтует";
        }
    }

    public static void summator () {
        String [] numberArray = reader().split(" ");
        ArrayList <Integer> numbers = new ArrayList<>();
        for (String number : numberArray){
            numbers.add(Integer.parseInt(number));
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}