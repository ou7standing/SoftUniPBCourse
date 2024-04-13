package PoSlojniProverki;

import java.util.Scanner;

public class NovDom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//        цвете	         Роза	Далия	Лале	Нарцис	Гладиола
//Цена на брой в лева	5	   3.80	   2.80	     3	      2.50
//Съществуват следните отстъпки:
//•	Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
//•	Ако Нели купи повече от 90  Далии - 15% отстъпка от крайната цена
//•	Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
//•	Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
//•	Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%

//        От конзолата се четат 3 реда:
//•	Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
//•	Брой цветя - цяло число в интервала [10…1000]
//•	Бюджет - цяло число в интервала [50…2500]


        String cvetq = scanner.nextLine();
        int broiCvetq = scanner.nextInt();
        int budged = scanner.nextInt();


        double sum = 0;

        switch (cvetq) {
            case ("Roses"):
                sum = broiCvetq * 5.0;
                if (broiCvetq > 80) {
                    sum = sum * 0.9;
                }
                break;

            case ("Dahlias"):
                sum = broiCvetq * 3.8;
                if (broiCvetq > 90) {
                    sum = sum * 0.85;
                }
                break;

            case ("Tulips"):
                sum = broiCvetq * 2.8;
                if (broiCvetq > 80) {
                    sum = sum * 0.85;
                }
                break;

            case ("Narcissus"):
                sum = broiCvetq * 3.0;
                if (broiCvetq < 120) {
                    sum = sum * 1.15;
                }
                break;

            case ("Gladiolus"):
                sum = broiCvetq * 2.5;
                if (broiCvetq < 80) {
                    sum = sum * 1.2;
                }
                break;

        }


        //•	Ако бюджета им е достатъчен - "Hey, you have a great garden with {броя цвета} {вид цветя} and {останалата сума} leva left."
        //•	Ако бюджета им е НЕ достатъчен - "Not enough money, you need {нужната сума} leva more."


        if ((budged - sum) >= 0) {
            System.out.printf("Hey, you have a great garden with " + broiCvetq +" "+ cvetq + " and " + "%.2f" + " leva left.", (budged - sum));
        } else {
            System.out.printf("Not enough money, you need " + "%.2f" + " leva more." , (budged-sum)*-1.0);
        }


    }


}
