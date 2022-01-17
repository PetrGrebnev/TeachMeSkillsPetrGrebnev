package lesson4;

public class Task2 {
    /**
     *задача выводит на экран минимальное число из 4 {14, 11, 10, 15}
     *getMinFromFour - из 4 чисел
     *getMinFromTwo - из 2 чисел
     **/
    public static void main(String[] args) {
        int minFromFour = getMinFromFour(14, 11, 10, 15);
        System.out.println(minFromFour);
    }

    public static int getMinFromFour(int a, int b, int c, int d) {
        int firstPairResult = getMinFromTwo(a, b);
        // int secondPairResult = getMinFromTwo(d, b); просиходит сравнение только 3х элементов из 4х
        int secondPairResult = getMinFromTwo(d, c);

        return getMinFromTwo(firstPairResult, secondPairResult);
    }

    public static int getMinFromTwo(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
}