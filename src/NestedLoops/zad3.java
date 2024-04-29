package NestedLoops;

import java.util.Scanner;

public class zad3 {
//    Напишете програма, която чете от конзолата цели числа в диапазона, докато не се получи команда "stop".
//    Да се намери сумата на всички въведени прости и сумата на всички въведени непрости числа. Тъй като по дефиниция от математиката отрицателните числа
////    не могат да бъдат прости, ако на входа се подаде отрицателно число да се изведе следното съобщение "Number is negative.". В този случай въведено число
////    се игнорира и не се прибавя към нито една от двете суми, а програмата продължава своето изпълнение, очаквайки въвеждане на следващо число.
//На изхода да се отпечатат на два реда двете намерени суми в следния формат:
//•	"Sum of all prime numbers is: {prime numbers sum}"
//•	"Sum of all non prime numbers is: {nonprime numbers sum}"

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumPrime = 0;
        int sumNonPrime = 0;
        int bingo = -1;
        boolean flag = false;

        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                flag = true;
            }

            if (flag == true) {
                flag = false;
                continue;
            }

            flag = false;

            for (int i = 2; i < number; i++) {
                bingo = number % i;
                if (bingo == 0) {
                    sumNonPrime += number;
                    flag = true;
                    break;

                }
            }
            if (flag == false) {
                sumPrime += number;
            }

            flag = false;

            input = scanner.nextLine();


        }

        System.out.println("Sum of all prime numbers is: " +sumPrime);
        System.out.println("Sum of all non prime numbers is: " + sumNonPrime);


    }


}
