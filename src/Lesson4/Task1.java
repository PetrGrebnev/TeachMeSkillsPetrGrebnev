package Lesson4;
import java.util.Scanner;

public class Task1 {

    static int age;

    public static void main(String[] args) {
        Scanner inAge = new Scanner(System.in);
        System.out.print("Возраст: ");
        age = inAge.nextInt();
        System.out.println(getGroup());
    }

    public static int getGroup () {
        int group;
        if (7 <= age && age <= 13){
            group = 1;
        } else if (14 <= age && age <= 18){
            group = 2;
        } else if (19 <= age && age <= 65){
            group = 3;
        } else group = -1;
        return group;
    }
}
