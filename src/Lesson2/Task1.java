package Lesson2;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner newByte = new Scanner(System.in);
        System.out.print("Введите число Byte: ");
        int bytik = newByte.nextInt();
        Scanner newInt = new Scanner(System.in);
        System.out.print("Введите число Int: ");
        int integer = newInt.nextInt();
        Scanner newShort = new Scanner(System.in);
        System.out.print("Введите число Short: ");
        int shortik = newShort.nextInt();

        int bigNumber = 0;
        int averageNumber = 0;
        int smallNumber = 0;

        if (bytik==integer && bytik==shortik) {System.out.println("Все числа равны");
        bigNumber = integer; averageNumber = integer; smallNumber = integer;}
        else if (integer>shortik && shortik>bytik){bigNumber = integer; averageNumber = shortik; smallNumber = bytik;}
        else if (integer>bytik && bytik>shortik){bigNumber = integer; averageNumber = bytik; smallNumber = shortik;}
        else if (integer<shortik && integer>bytik){bigNumber = shortik; averageNumber = integer; smallNumber = bytik;}
        else if (shortik>bytik && bytik>integer){bigNumber = shortik; averageNumber = bytik; smallNumber = integer;}
        else if (bytik>integer && integer>shortik){bigNumber = bytik; averageNumber = integer; smallNumber = shortik;}
        else if (bytik>shortik && shortik>integer){bigNumber = bytik; averageNumber = shortik; smallNumber = integer;}
        else if (integer==shortik && shortik>bytik){bigNumber = integer; averageNumber = shortik; smallNumber = bytik;}
        else if (integer==bytik && bytik>shortik){bigNumber = integer; averageNumber = bytik; smallNumber = shortik;}
        else if (shortik==bytik && bytik>integer){bigNumber = shortik; averageNumber = bytik; smallNumber = integer;}
        else if (shortik<bytik && integer==shortik){bigNumber = bytik; averageNumber = shortik; smallNumber = integer;}
        else if (integer==bytik && bytik<shortik){bigNumber = shortik; averageNumber = bytik; smallNumber = integer;}
        else if (shortik==bytik && bytik<integer){bigNumber = integer; averageNumber = bytik; smallNumber = shortik;}

        System.out.println("Наибольшое число: " + bigNumber);
        System.out.println("Среднее число: " + averageNumber);
        System.out.println("Наименьшее число: " + smallNumber);
    }

}
