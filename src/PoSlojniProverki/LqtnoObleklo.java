package PoSlojniProverki;

import java.util.Scanner;

public class LqtnoObleklo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//Лято е с много променливо време и Виктор има нужда от вашата помощ. Напишете програма която спрямо времето от
// денонощието и градусите да препоръча на Виктор какви дрехи да си облече. Вашия приятел има различни планове за
// всеки етап от деня, които изискват и различен външен вид, тях може да видите от таблицата.
//От конзолата се четат точно два реда:
//•	Градусите - цяло число в интервала [10…42]
//•	Текст, време от денонощието - с възможности - "Morning", "Afternoon", "Evening"


        int gradus = scanner.nextInt();
        String vremeotDen = scanner.next();


        String outfit = "abc";
        String shoes = "abc";


        if (vremeotDen.equals("Morning")) {
            if (gradus <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (gradus <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (gradus >= 25) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        } else if (vremeotDen.equals("Afternoon")) {
            if (gradus <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (gradus <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (gradus >= 25) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }

        } else if (vremeotDen.equals("Evening")) {
            if (gradus <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (gradus <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (gradus >= 25) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }


        }


        System.out.println("It's " + gradus + " degrees, get your " + outfit + " and " + shoes + ".");
    }

}
