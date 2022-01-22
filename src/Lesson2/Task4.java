package Lesson2;

public class Task4 {

    public static void main(String[] args) {

        int a = 0b11001101;  // 205;
        int b = 0b10101011; // 171;
        System.out.println("Значение b = " + a);
        System.out.println("Значение c = " + b);
        int c1 = a + b;
        System.out.println("Сложение : c1 = " + c1);
        int c2 = a - b;
        System.out.println("Вычитание : c2 = " + c2);
        int c3 = a * b;
        System.out.println("Умножение : c3 = " + c3);
        double c4 = a / b;
        System.out.println("Деление : c4 = " + c4);
        double c5 = a % b;
        System.out.println("Получение остатка : c5 = " + c5);
        int c6 = ++a;
        System.out.println("Префиксный инкремент : c6 =" + c6 + " ; " + "a = " + a);
        int c7 = b++;
        System.out.println("Постфиксный инкремент : c7 =" + c7 + " ; " + "b = " + b);
        int c8 = --a;
        System.out.println("Префиксный декремент : c8 =" + c8 + " ; " + "a = " + a);
        int c9 = b--;
        System.out.println("Постфиксный декремент : c9 =" + c9 + " ; " + "b = " + b);
        boolean c10 = a == b;
        System.out.println("Равентсов \"a\" и \"bc\" : c10 = " + c10);
        boolean c11 = a != b;
        System.out.println("Неравентсов \"a\" и \"b\" : c11 = " + c11);
        boolean c12 = a < b;
        System.out.println("\"a\" меньше \"b\" : c12 = " + c12);
        boolean c13 = a > b;
        System.out.println("\"a\" больше \"b\" : c13 = " + c13);
        boolean c14 = a <= b;
        System.out.println("\"a\" меньше или равено \"b\" : c14 = " + c14);
        boolean c15 = a >= b;
        System.out.println("\"a\" больше или равно  \"b\" : c15 = " + c15);
        boolean c16 = (a==b) | (a > b);
        System.out.println("Сравнение \"a | b\" : c16 = " + c16);
        boolean c17 = a >= b;
        System.out.println("Сравнение \"a & b\" : c17 = " + c17);
        boolean e = false;
        boolean f = true;
        boolean с18= f != e ;
        System.out.println("Логическое НЕ \"e\" : с18 = " + с18);
        boolean с19 = e ^ f;
        System.out.println("Сравнение \"e ^ f\" : с19 = " + с19);
        boolean с20 = e || f;
        System.out.println("Сравнение \"e || f\" : с20 = " + с20);
        boolean с21 = e && f;
        System.out.println("Сравнение e && f : : с21 = " + с21);
        int с22 = b;
        System.out.println("Присвоение с22 числа b : с22 = " + с22);
        int c23 = a +=b;
        System.out.println("Присвоение суммы \"a и b\" : c23 = " + c23);
        int c24 = a -= b;
        System.out.println("Присвоение разности \"a и b\"  : c24 = " + c24);
        int c25 = a *= b;
        System.out.println("Присвонение произведения \"a и b\" : c21 = " + c25);
        int c26 = a /= b;
        System.out.println("Присвонение результата деления \"a и b\" : c21 = " + c26);
        int c27 = a %= b;
        System.out.println("Присвонение остатка \"a и b\" : c27 = " + c27);
        int c28 = a &= b;
        System.out.println("Присвонение значение \"a &= b\" : c28 = " + c28);
        int c29 = a |= b;
        System.out.println("Присвонение значение \"a |= b\" : c29 = " + c29);
        int d = 0b101101;
        int c30 = d ^= b;
        System.out.println("Присвонение значение \"a ^= b\" : c30 = " + c30);
        int c31 = d <<= 1;
        System.out.println("Присвонение значение \"<<= b\" : c31 = " + c31);
        int c32 = d >>= 1;
        System.out.println("Присвонение значение \">>= a\" : c32 = " + c32);
        int c33 = d >>>= 1;
        System.out.println("Присвонение значение \">>>= b\" : c33 = " + c33);
    }




}
