package lesson5;

import java.io.*;
import java.util.Arrays;

/**
 *  Сделать программу считывающую числа с файла, умножающую их на 10 и записвыающую в другой файл
 */

public class ReaderWrite {

    static String numIntFile;
    static int [] numbers;

    public static void main(String[] args){
        reader();
        transferToInt();
        writer();
    }

    public static void reader (){
        try(FileInputStream fileInput = new FileInputStream
                ("C:/Users/Petr/IdeaProjects/TeachMeSkillsPetrGrebnev/src/lesson5/read")) {
            int i;
            numIntFile = "";
            while ((i = fileInput.read()) != -1) {
                numIntFile = numIntFile + (char) i;
            }
        }
        catch (IOException e){
            System.out.println("Файл чтения отсутсвтует");
        }
    }

    public static void transferToInt(){
        String[] numberString = numIntFile.split(" ");
        numbers = new int[10];
        int counter = 0;
        for (String number : numberString){
            numbers[counter++] = Integer.parseInt(number)*10;
        }
    }

    public static void writer () {
        try (FileOutputStream fileOutput = new FileOutputStream
                ("C:/Users/Petr/IdeaProjects/TeachMeSkillsPetrGrebnev/src/lesson5/write")) {
            String numOutFile = Arrays.toString(numbers);
            fileOutput.write(numOutFile.getBytes());
        }
        catch (IOException e){
            System.out.println("Файл записи не найден");
        }
    }
}
