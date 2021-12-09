package Lesson2;
import java.util.Scanner;
public class Task3 {
  //  3)	ввести с клавиатуры 2 числа (Scanner)  и присвоить их двум переменнм (weght, hight). Нарисовать фигуру из буквы О размером weght x hight
  public static void main(String[] args) {
      Scanner inputWidth = new Scanner(System.in);
      System.out.print("Введите ширину: ");
      int width = inputWidth.nextInt();
      Scanner inputHeight = new Scanner(System.in);
      System.out.print("Введите высоту: ");
      int height = inputHeight.nextInt();
      for (int j=1; j<=height;j++) {
          for (int i = 1; i <= width; i++) {
              System.out.print('O');
          }
          System.out.println("");
      }
  }
}
