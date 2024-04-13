package ForLoops;

import java.util.Scanner;

public class Zad7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//7. Трекинг мания
//Катерачи от цяла България се събират на групи и набелязват следващите върхове за изкачване. Според размера на групата, катерачите ще изкачват различни върхове.
//•	Група до 5 човека включително – изкачват Мусала
//•	Група от 6 до 12 човека включително – изкачват Монблан
//•	Група от 13 до 25 човека включително – изкачват Килиманджаро
//•	Група от 26 до 40 човека включително –  изкачват К2
//•	Група от 41 (включително) или повече човека – изкачват Еверест
//Да се напише програма, която изчислява процента на катерачите изкачващи всеки връх.
//Вход
//От конзолата се четат поредица от числа, всяко на отделен ред:
//////•	На първия ред – броя на групите от катерачи – цяло число в интервала [1...1000]
//////•	За всяка една група на отделен ред – броя на хората в групата – цяло число в интервала [1...1000]
//Изход
//Да се отпечатат на конзолата 5 реда, всеки от които съдържа процент между 0.00% и 100.00% с точност до втората цифра след десетичната запетая.
//•	Първи ред - процентът изкачващи Мусала
//•	Втори ред – процентът изкачващи Монблан
//•	Трети ред – процентът изкачващи Килиманджаро
//•	Четвърти ред – процентът изкачващи К2
//•	Пети ред – процентът изкачващи Еверест

        int grupiKaterachi = Integer.parseInt(scanner.nextLine());
        double musala = 0;
        double monblan = 0;
        double kilimandjaro = 0;
        double k2 = 0;
        double everest = 0;

        double totalKaterachi = 0;

        for (int i = 0; i < grupiKaterachi; i++) {

            int katerachiPerGroup = Integer.parseInt(scanner.nextLine());

            totalKaterachi += katerachiPerGroup;

            if (katerachiPerGroup <= 5) {
                musala += katerachiPerGroup;
            } else if (katerachiPerGroup <= 12) {
                monblan += katerachiPerGroup;
            } else if (katerachiPerGroup <= 25) {
                kilimandjaro += katerachiPerGroup;
            } else if (katerachiPerGroup <= 40) {
                k2 += katerachiPerGroup;
            } else {
                everest += katerachiPerGroup;
            }
        }

        System.out.printf("%.2f%" + "%" + "\n", (musala / totalKaterachi) * 100);
        System.out.printf("%.2f%" + "%" + "\n", (monblan / totalKaterachi) * 100);
        System.out.printf("%.2f%" + "%" + "\n", (kilimandjaro / totalKaterachi) * 100);
        System.out.printf("%.2f%" + "%" + "\n", (k2 / totalKaterachi) * 100);
        System.out.printf("%.2f%" + "% "+ "\n", (everest / totalKaterachi) * 100);

    }

}

