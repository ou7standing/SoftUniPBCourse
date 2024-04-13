package ForLoops;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);

//Напишете програма, която отпечатва числата в диапазона от 1 до 1000, които завършват на 7.

        for (int i = 0; i <= 1000; i++) {

            if (((i + 3) % 10) == 0) {
                System.out.println(i);
            }


        }


    }


}
