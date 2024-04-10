package ForLoops;

import java.util.ArrayList;
import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Да се напише програма, която чете n-на брой цели числа, въведени от потребителя,и проверява
//        дали сред тях съществува число, което е равно на сумата на всички останали.
//•	Ако има такъв елемент печата "Yes" и на нов ред "Sum = "  + неговата стойност
//•	Ако няма такъв елемент печата "No" и на нов ред "Diff = " + разликата между най-големия елемент и сумата на останалите (по абсолютна стойност)

        int n = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        ArrayList<Double> chisla = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());
            chisla.add((double) currentNumber);
            sum += currentNumber;

//            for (int j = 0; j < n; j++) {
//
//                if (currentNumber == sum) {
//                    System.out.println("Yes");
//                    System.out.println("Sum = " + sum);
//                } else {
//                    System.out.println("No");
//                    System.out.println("Diff = " + "tr se izchisli");
//                }
//            }


        }

        double bingo = Integer.MIN_VALUE;

        for (double a : chisla) {
            if (a > bingo) {
                bingo = a;
            }
        }

        double delta = Math.abs(bingo - (sum-bingo));



        if (chisla.contains(sum / 2)) {
            System.out.println("Yes");
            System.out.printf("Sum = " + "%.0f" , (sum / 2));
        } else {
            System.out.println("No");
            System.out.printf("Diff = " + "%.0f", delta);
        }


    }
}
