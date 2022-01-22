package lesson2;
/**
 * 2)	создать 10 переменных, 5 проинициализоровать сразу, 5 в ходе выполнения программы,
 * причем вторые 5 иниц из первых 5. (*, /, -, %), также использовать все числовые типы
 */

public class Task2 {

    public static void main(String[] args) {
        byte byt = 115;
        short shorts = 21365;
        int intgs = 51321;
        long longes = 2478634798451325487L;
        double doublik = 25.4;
        System.out.println("Данные переменные типов:\n1.byte = "+ byt +
                "\n2.short = " + shorts + "\n3.int = " + intgs +
                "\n4.long = " + longes + "\n5.double = " + doublik);

        int intSumbByte = byt + intgs;
        System.out.println("Сложение int и byte = " + intSumbByte);
        int shortMinusByte = shorts - byt;
        System.out.println("Вычитание short и byte = " + shortMinusByte);
        long longMultiInt = intgs * longes;
        System.out.println("Умножение long и int = " + longMultiInt);
        double doubleDivisionShort = shorts / doublik;
        System.out.println("Деление double и short = " + doubleDivisionShort);
        long longRemainsShort = longes%shorts;
        System.out.println("Остаток от деления типа long и short = " + longRemainsShort);
    }
}
