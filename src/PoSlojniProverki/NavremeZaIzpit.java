package PoSlojniProverki;

import java.util.Scanner;

public class NavremeZaIzpit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chasIzpit = Integer.parseInt(scanner.nextLine());
        int minutaIzpit = Integer.parseInt(scanner.nextLine());
        int chasPristigane = Integer.parseInt(scanner.nextLine());
        int minutaPristigane = Integer.parseInt(scanner.nextLine());
        int deltaChas = 0;
        int deltaMinuti = 0;


//        Студент трябва да отиде на изпит в определен час. Той идва в изпитната зала в даден час на пристигане.
//        Счита се, че студентът е дошъл навреме, ако е пристигнал в часа на изпита или до половин час преди това.
//        Ако е пристигнал по-рано повече от 30 минути, той е подранил. Ако е дошъл след часа на изпита, той е закъснял.
//        Напишете програма, която прочита време на изпит и време на пристигане и отпечатва дали студентът е дошъл навреме,
//        дали е подранил или е закъснял и с колко часа или минути е подранил или закъснял.
//Изход
//На първият ред отпечатайте:
//•	"Late", ако студентът пристига по-късно от часа на изпита.
//•	"On time", ако студентът пристига точно в часа на изпита или до 30 минути по-рано.
//•	"Early", ако студентът пристига повече от 30 минути преди часа на изпита.
//Ако студентът пристига с поне минута разлика от часа на изпита, отпечатайте на следващия ред:
//•	"mm minutes before the start" за идване по-рано с по-малко от час.
//•	"hh:mm hours before the start" за подраняване с 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:05.
//•	 "mm minutes after the start" за закъснение под час.
//•	"hh:mm hours after the start" за закъснение от 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:03.

        int delta = ((((chasIzpit * 60) + minutaIzpit)) - (((chasPristigane * 60)) + minutaPristigane));

        if (delta < 0) {
            System.out.println("Late");
            if (delta < -60) {
                deltaChas = (-1)*delta / 60;
                deltaMinuti = (-1)*delta % 60;
                if (deltaMinuti < 10) {
                    System.out.printf(deltaChas + ":0" + "%.2f" + " hours after the start", deltaMinuti);
                } else {
                    System.out.printf(deltaChas + ":" + deltaMinuti + " hours after the start");
                }

            } else {

            }


        } else if (delta <= 30) {
            System.out.println("On time");
        } else {
            System.out.println("Early");
        }


    }

}

//        if (chasPristigane < chasIzpit) {
//            if ((minutaIzpit+60) - (minutaPristigane+60) {
//
//            }
//        }