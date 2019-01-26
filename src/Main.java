import com.sun.jmx.snmp.internal.SnmpSubSystem;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //1
        System.out.println("Введите имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Привет," + name);

        //2
       for (int i = args.length-1; i >=0 ; i--) {
           System.out.println(args[i]);
       }

        //3 с переносом
       System.out.println("Введите число");
       Random rnd = new Random();
       Scanner number = new Scanner(System.in);
       int quan = number.nextInt();
       for (int i = 0; i < quan; i++) {
           int random = rnd.nextInt(100);
           System.out.println(random);
       }

        //3 без переноса
       System.out.println("Введите число");
       Random rnd1 = new Random();
       Scanner number1 = new Scanner(System.in);
       int quan1 = number1.nextInt();
       for (int i = 0; i < quan1; i++) {
           int random = rnd1.nextInt(100);
           System.out.print(random + " ");
       }

        //4
       System.out.println("Введите пароль");
       Scanner scan = new Scanner(System.in);
       String password = scan.nextLine();
       String sample = "пароль";
       if (password.equals(sample)){
           System.out.println("Пароли совпадают");
       }
       else {
           System.out.println("Пароли не совпадают");
       }

        //5
       int sum = 0;
       for (int i = 0; i < args.length ; i++) {
           sum += Integer.parseInt(args[i]);
     }
       System.out.println(sum);

        //6
        Scanner newNumb = new Scanner(System.in);
        int [] x = new int[10];
        for (int i = 0; i < 3; i++) {
            String s = newNumb.nextLine();
            int m = Integer.parseInt(s);
            x [i] = m;
        }

        // четные
        System.out.print("Четные числа: ");
        for (int i = 0; i < 3; i++) {
            if (x[i]%2 ==0) {
                System.out.print(x[i] + " ");
            }
        }
        System.out.println();

        // нечетные
        System.out.print("Нечетные числа: ");
        for (int i = 0; i < 3; i++) {
            if (x[i] % 2 != 0) {
                System.out.print(x[i] + " ");
            }
        }
        System.out.println();

        //наибольшее и наименьшее
        int min = x[0];
        int max = 0;
        for (int i = 0; i < 3; i++) {
            if (x[i] > max) {
                max = x[i];
            } else if (x[i] < min) {
                min = x[i];
            }
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число:" + min);

        //Числа, которые делятся на 3 или на 9
        System.out.print("Числа, которые делятся на 3 или на 9: ");
        for (int i = 0; i < 3; i++) {
            if (x[i] % 3 == 0 || x[i] % 9 == 0) {
                System.out.print(x[i]);
            }
        }
        System.out.println();

        //Числа, которые делятся на 5 и на 7.
        System.out.print("Числа, которые делятся на 5 и на 7: ");
        for (int i = 0; i < 3; i++) {
            if (x[i] % 5 == 0 && x[i] % 7 == 0) {
                System.out.print(x[i]);
            }
        }
        System.out.println();

        //Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
        System.out.print("Все трехзначные числа, в десятичной записи которых нет одинаковых цифр: ");
        String c = " ";
        for (int i = 0; i < 3; i++) {
            if (x[i] >= 100 && x[i] <= 999) {
                c = String.valueOf(x[i]);
                char [] chars = c.toCharArray();
                if (chars[0] != chars[1] && chars[0] != chars[2] && chars[1] != chars[2]) {
                    System.out.print(c + " ");
                }
            }
        }
        System.out.println();

        //«Счастливые» числа.
        System.out.print("«Счастливые» числа: ");
        String cent = " ";
        for (int i = 0; i < 3; i++) {
            if (x[i] >= 1000 && x[i] <= 9999) {
                cent = String.valueOf(x[i]);
                char [] chars = cent.toCharArray();
                if ( (chars[0] + chars[1]) == (chars[2] + chars[3]) ) {
                    System.out.print(cent + " ");
                }
            }
        }

    }
}
