package lesson4;

/**
 * Создайте набор пар арабское – римское O, I, V, X, M
 * Напишите метод по переводу арабских чисел от 0 до 100 в римские используя данную мапу.
 */

import java.util.HashMap;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        numberTranslation();
    }

    public static int inputNumber(){
        Scanner inArabNumber = new Scanner(System.in);
        System.out.print("Арабское число: ");
        return inArabNumber.nextInt();
    }

    public static HashMap arabRoman(){
        HashMap <Integer, String> arabAndRoman = new HashMap<>();
        arabAndRoman.put(0, "O");
        arabAndRoman.put(1, "I");
        arabAndRoman.put(4, "IV");
        arabAndRoman.put(5, "V");
        arabAndRoman.put(9, "IX");
        arabAndRoman.put(10, "X");
        arabAndRoman.put(40, "XL");
        arabAndRoman.put(50, "L");
        arabAndRoman.put(90, "XC");
        arabAndRoman.put(100, "C");
        return arabAndRoman;
    }

    public static void numberTranslation() {
        int i = inputNumber();
        StringBuilder romanNum = new StringBuilder();
        if (i == 0) {
            romanNum.append(arabRoman().get(0));
        } else{
            while (i != 0) {
                if (i < 100) {
                    if (i < 90) {
                        if (i < 50) {
                            if (i < 40) {
                                if (i < 10) {
                                    if (i < 9) {
                                        if (i < 5) {
                                            if (i < 4) {
                                                romanNum.append(arabRoman().get(1));
                                                i--;
                                            } else {
                                                i = i - 4;
                                                romanNum.append(arabRoman().get(4));
                                            }
                                        } else {
                                            i = i - 5;
                                            romanNum.append(arabRoman().get(5));
                                        }
                                    } else {
                                        i = i - 9;
                                        romanNum.append(arabRoman().get(9));
                                    }
                                } else {
                                    i = i - 10;
                                    romanNum.append(arabRoman().get(10));
                                }
                            } else {
                                i = i - 40;
                                romanNum.append(arabRoman().get(40));
                            }
                        } else {
                            i = i - 50;
                            romanNum.append(arabRoman().get(50));
                        }
                    } else {
                        i = i - 90;
                        romanNum.append(arabRoman().get(90));
                    }
                } else {
                    i = i - 100;
                    romanNum.append(arabRoman().get(100));
                }
            }
        }
        System.out.println("Римская цифра: " + romanNum);
    }
}
