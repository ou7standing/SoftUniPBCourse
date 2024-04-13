package FirstStepsInProgramming;

import java.util.Scanner;

public class YardGreening {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double m2 = scanner.nextDouble();

        System.out.println("The final price is: " + (m2*7.61 - m2*7.61*0.18) + " lv.");

        System.out.println("The discount is: " + m2*7.61*0.18 + " lv.");





    }









}
