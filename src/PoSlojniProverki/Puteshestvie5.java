package PoSlojniProverki;

import java.util.Scanner;

public class Puteshestvie5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budged = scanner.nextDouble();
        String season = scanner.next();
        String destination;
        String stay;
        double poharchenaSuma;

//Странно, но повечето хора си плануват от рано почивката. Млад програмист разполага с определен бюджет и свободно време в даден сезон.
// Напишете програма, която да приема на входа бюджета и сезона, а на изхода да изкарва, къде ще почива програмиста и колко ще похарчи.
//Бюджета определя дестинацията, а сезона определя колко от бюджета ще изхарчи. Ако е лято ще почива на къмпинг, а зимата в хотел.
//// Ако е в Европа, независимо от сезона ще почива в хотел. Всеки къмпинг или хотел, според дестинацията, има собствена цена която отговаря
// на даден процент от бюджета:
//•	При 100лв. или по-малко – някъде в България
//o	Лято – 30% от бюджета
//o	Зима – 70% от бюджета
//•	При 1000лв. или по малко – някъде на Балканите
//o	Лято – 40% от бюджета
//o	Зима – 80% от бюджета
//•	При повече от 1000лв. – някъде из Европа
//o	При пътуване из Европа, независимо от сезона ще похарчи 90% от бюджета.
//: "summer" или "winter"
        //На конзолата трябва да се отпечатат два реда.
        //•	Първи ред – "Somewhere in {дестинация}" измежду "Bulgaria", "Balkans" и "Europe"
        //•	Втори ред – "{Вид почивка} – {Похарчена сума}"
        //o	Почивката може да е между "Camp" и "Hotel"
        //o	Сумата трябва да е закръглена с точност до вторият знак след десетичната запетая

        if (budged <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                poharchenaSuma = budged * 0.3;
                stay = "Camp";
            } else {
                poharchenaSuma = budged * 0.7;
                stay = "Hotel";
            }


        } else if (budged <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                poharchenaSuma = budged * 0.4;
                stay = "Camp";
            } else {
                poharchenaSuma = budged * 0.8;
                stay = "Hotel";
            }


        } else {
            destination = "Europe";
            stay = "Hotel";
            poharchenaSuma = budged * 0.9;

        }

        System.out.println("Somewhere in " + destination);

        System.out.printf( stay + " - " + "%.2f" , poharchenaSuma);


    }

}
