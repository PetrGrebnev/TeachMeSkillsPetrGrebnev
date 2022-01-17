package lesson4;
import java.util.Scanner;

public class Task1 {

    static int age;

    public static void main(String[] args) {
        Scanner inAge = new Scanner(System.in);
        System.out.print("Возраст: ");
        age = inAge.nextInt();
        getGroup();
    }

    public static void getGroup () {
        if (7 <= age && age <= 13){
            System.out.println("Группа 1");
        } else if (14 <= age && age <= 18){
            System.out.println("Группа 2");
        } else if (19 <= age && age <= 65){
            System.out.println("Группа 3");
        } else System.out.println(-1);
    }
}