package PoSlojniProverki;

import java.util.Scanner;

public class OperaciiChisla6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        String operator = scanner.next();

//От конзолата се прочитат 3 реда, въведени от потребителя:
//•	N1 – цяло число в интервала [0...40 000]
//•	N2 – цяло число в интервала [0...40 000]
//•	Оператор – един символ измеду: "+", "-", "*", "/", "%"


        //Напишете програма, която чете две цели числа (N1 и N2) и оператор, с който да се извърши дадена математическа операция с тях.
        // Възможните операции са: Събиране (+), Изваждане (-), Умножение (*), Деление (/) и Деление с остатък (%).
        // При събиране, изваждане и умножение на конзолата трябва да се отпечата резултатът и дали той е четен или нечетен.
        // При обикновеното деление – резултатът. При модулното деление – остатъка. Трябва да се има предвид, че делителят може да е равен на 0(нула),
        // а на нула не се дели. В този случай трябва да се отпечата специално съобщениe.

//        Изход
//        Да се отпечата на конзолата един ред:
//•	Ако операцията е събиране, изваждане или умножение:
//        o	 "{N1} {оператор} {N2} = {резултат} – {even/odd}"
//•	Ако операцията е деление:
//        o	"{N1} / {N2} = {резултат}" – резултатът е форматиран до вторият знак след дес.запетая
//•	Ако операцията е деление с остатък:
//        o	"{N1} % {N2} = {остатък}"
//•	В случай на деление с 0 (нула):
//        o	"Cannot divide {N1} by zero"



        double sum = 0;
        String evenOdd;

        if (n2==0){
            System.out.println("Cannot divide " + n1 + " by zero");
            return;
        }

        switch (operator) {

            case ("+"):
                sum = n1 + n2;
                if ((n1 + n2) % 2 == 0) {
                    evenOdd = "even";
                } else {
                    evenOdd = "odd";
                }
                System.out.println(n1 + " " + operator + " " + n2 + " = " + (int)sum + " - " + evenOdd);
                break;


            case ("-"):
                sum = n1 - n2;

                if ((n1 - n2) % 2 == 0) {
                    evenOdd = "even";
                } else {
                    evenOdd = "odd";
                }
                System.out.println(n1 + " " + operator + " " + n2 + " = " + (int)sum + " - " + evenOdd);
                break;

            case ("*"):
                sum = n1 * n2;

                if ((n1 * n2) % 2 == 0) {
                    evenOdd = "even";
                } else {
                    evenOdd = "odd";
                }
                System.out.println(n1 + " " + operator + " " + n2 + " = " + (int)sum + " - " + evenOdd);
                break;

            case ("/"):
                sum = (double) n1 / n2;
                System.out.printf(n1 + " / " + n2 + " = " + "%.2f", sum);
                break;

            case ("%"):
                sum = n1%n2;
                System.out.println(n1 + " % " + n2 + " = " +(int)sum);
                break;

        }


    }


}
