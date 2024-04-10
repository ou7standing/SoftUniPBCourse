package PoSlojniProverki;

import java.util.Scanner;

public class SkiPochivka {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dniPrestoi = Integer.parseInt(scanner.nextLine());
//        String dummy = scanner.nextLine();
String vidPomeshtenie = scanner.nextLine();
        String ocenka = scanner.nextLine();


        //Входът се чете от конзолата и се състои от три реда:
        //•	Първи ред - дни за престой - цяло число в интервала [0...365]
        //•	Втори ред - вид помещение - "room for one person", "apartment" или "president apartment"
        //•	Трети ред - оценка - "positive"  или "negative"

//        Атанас решава да прекара отпуската си в Банско и да кара ски. Преди да отиде обаче, трябва да резервира хотел и да изчисли колко ще му струва престоя.
//        Налични са следните видове помещения, със следните цени за престой:
//	"room for one person" – 18.00 лв за нощувка
//	"apartment" – 25.00 лв за нощувка
//	"president apartment" – 35.00 лв за нощувка
//Според броят на дните, в които ще остане в хотела (пример: 11 дни = 10 нощувки) и видът на помещението, което ще избере, той може да ползва различно намаление.
//Намаленията са както следва:

//След престоя, оценката на Атанас за услугите на хотела може да е позитивна (positive) или негативна (negative) .
// Ако оценката му е позитивна, към цената с вече приспаднатото намаление Атанас добавя 25% от нея. Ако оценката му е негативна приспада от цената 10%.

//        Изход
//        На конзолата трябва да се отпечата един ред:
//•	Цената за престоят му в хотела, форматирана до втория знак след десетичната запетая.

        double cena = 0;

        switch (vidPomeshtenie) {
            case ("room for one person"):
                cena = (dniPrestoi - 1) * 18.0;


                break;

            case ("apartment"):
                cena = (dniPrestoi - 1) * 25.0;

                if (dniPrestoi < 10) {
                    cena *= 0.7;
                } else if (dniPrestoi <= 15) {
                    cena *= 0.65;
                } else {
                    cena *= 0.5;
                }


                break;

            case ("president apartment"):

                cena = (dniPrestoi - 1) * 35.0;

                if (dniPrestoi < 10) {
                    cena *= 0.9;
                } else if (dniPrestoi <= 15) {
                    cena *= 0.85;
                } else {
                    cena *= 0.8;
                }
                break;


        }


        if (ocenka.equals("positive")) {
            cena *=1.25;
        } else if (ocenka.equals("negative")){
            cena *=0.9;
        }

        System.out.printf("%.2f", cena);

    }

}
