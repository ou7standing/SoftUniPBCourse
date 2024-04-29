package NestedLoops;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//Напишете програма, която чете от конзолата две шестцифрени цели числа в диапазона от 100000 до 300000. Винаги първото въведено число ще бъде по малко от второто.
// На конзолата да се отпечатат на 1 ред разделени с интервал всички числа, които се намират между двете, прочетени от конзолата числа и отговарят на следното условие:
//•	сумата от цифрите на четни и нечетни позиции да са равни. Ако няма числа, отговарящи на условието на конзолата не се извежда резултат.

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
//        boolean bingo = false;


        for (int i = n1; i <= n2; i++) {

            int number = i;
            int sum1 = 0;
            int sum2 = 0;


            for (int j = 0; j <= 5; j++) {
                int lastdigit = number % 10;
                number = number / 10;


                if (j % 2 == 0) {
                    sum1 += lastdigit;
                } else {
                    sum2 += lastdigit;
                }
            }


            if (sum1 == sum2) {
                System.out.print(i + " ");
            }
//
//            sum1 = number % 10;
//            number = number / 10;
//
//            sum2 = number % 10;
//            number = number / 10;
//
//            sum1 += number % 10;
//            number = number / 10;
//
//            sum2 += number % 10;
//            number = number / 10;
//
//            sum1 += number % 10;
//            number = number / 10;
//
//            sum2 += number % 10;
//            number = number / 10;

//
//
//            sum1 += i % 1000;
//            sum1 += i % 10;
//
//
//            sum2 = i % 10000;
//            sum2 += i % 100;


//            if (bingo = true) {
//                System.out.println(i + " ");
//            }


        }


    }
}



