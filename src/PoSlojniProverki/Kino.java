package PoSlojniProverki;

import java.util.Scanner;

public class Kino {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        В една кинозала столовете са наредени в правоъгълна форма в r реда и c колони. Има три вида прожекции с билети на различни цени:
//•	Premiere – премиерна прожекция, на цена 12.00 лева.
//•	Normal – стандартна прожекция, на цена 7.50 лева.
//•	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.
//                Напишете програма, която чете тип прожекция (стринг), брой редове и брой колони в залата (цели числа), въведени от потребителя,
//                и изчислява общите приходи от билети при пълна зала.
//                Резултатът да се отпечата във формат като в примерите по-долу, с 2 знака след десетичната точка.


        String projekciq = scanner.nextLine();
        int redove = scanner.nextInt();
        int koloni = scanner.nextInt();

        double pechalba = switch (projekciq) {
            case ("Premiere") -> redove * koloni * 12.0;
            case ("Normal") -> redove * koloni * 7.5;
            case ("Discount") -> redove * koloni * 5;
            default -> 0;
        };


        System.out.printf("%.2f" + "%n" + "leva", pechalba );


    }


}
