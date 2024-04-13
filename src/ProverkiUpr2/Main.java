package ProverkiUpr2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        По време на обедната почивка искате да изгледате епизод от своя любим сериал. Вашата задача е да напишете програма, с която ще разберете дали имате достатъчно време да изгледате епизода.
//        По време на почивката отделяте време за обяд и време за отдих. Времето за обяд ще бъде 1/8 от времето за почивка, а времето за отдих ще бъде 1/4 от времето за почивка.
//Вход
//От конзолата се четат 3 реда:
//1.	Име на сериал – текст
//2.	Продължителност на епизод  – цяло число в диапазона [10… 90]
//3.	Продължителност на почивката  – цяло число в диапазона [10… 120]
//Изход
//На конзолата да се изпише един ред:
//•	Ако времето е достатъчно да изгледате епизода:
//"You have enough time to watch {име на сериал} and left with {останало време} minutes free time."
//•	Ако времето не Ви е достатъчно:
//"You don't have enough time to watch {име на сериал}, you need {нужно време} more minutes."
//Времето да се закръгли до най-близкото цяло число нагоре.

        String serial = scanner.nextLine();
        int epizodProdalj = scanner.nextInt();
        int pochivkaProdalj = scanner.nextInt();

        double nalichnoVreme = (double) 5/8* (pochivkaProdalj*1.0);

        double delta = Math.abs(nalichnoVreme - epizodProdalj);

        int neededDelta = (int) Math.ceil(delta);

        if (nalichnoVreme >= epizodProdalj) {
            System.out.println("You have enough time to watch " + serial + " and left with " + neededDelta + " minutes free time.");
        } else {
            System.out.println("You don't have enough time to watch " + serial + ", you need " + neededDelta + " more minutes.");
        }


    }

}


// zad 1 int s1 = scanner.nextInt();
//
//        int s2 = scanner.nextInt();
//
//        int s3 = scanner.nextInt();
//
//        int total = s1 + s2 + s3;
//
//        int ostatuk = total % 60;
//
//        if (ostatuk < 10) {
//            System.out.println(total / 60 + ":0" + ostatuk);
//        } else {
//            System.out.println(total / 60 + ":" + ostatuk);


//zad2
//int chislo = scanner.nextInt();
//
//        double tochki;
//
//        if (chislo <= 100) {
//            tochki = 5;
//        } else if (chislo <= 1000) {
//            tochki = chislo / 5.0;
//        } else {
//            tochki = chislo / 10.0;
//        }
//
//        if (chislo % 2 == 0) {
//            tochki = tochki + 1.0;
//        }
//
//        if (((chislo - 5)%10 == 0) && (chislo != 5)) {
//            tochki =+ 2;
//        }
//
//
//        System.out.println(tochki);
//        System.out.println(chislo+tochki);

//zad 3
//        int hours = scanner.nextInt();
//        int minutes = scanner.nextInt();
//
//        if (hours == 23) {
//            if (minutes >= 55) {
//                System.out.println(0 + ":" + (minutes + 15)%60 );
//            } else if (minutes >= 45) {
//                System.out.println(0 + ":0" + (minutes + 15)%60);
//            } else {
//                System.out.println(hours + ":" + (minutes + 15));
//            }
//            return;
//        }
//
//        if (minutes >= 55) {
//            System.out.println(hours+1 + ":" + (minutes + 15)%60);
//        } else if (minutes >= 45) {
//            System.out.println(hours+1 + ":0" + (minutes + 15)%60);
//        }else {
//            System.out.println(hours + ":" + (minutes+15));
//        }

//zad4
//        double cenaEks = scanner.nextDouble();
//        int broiPuzzles = scanner.nextInt();
//        int broiKukli = scanner.nextInt();
//        int broiMecheta = scanner.nextInt();
//        int broiMinioni = scanner.nextInt();
//        int broiKamioni = scanner.nextInt();
//
//        double turnover = broiPuzzles * 2.6 + broiKukli * 3.0 + broiMecheta * 4.1 + broiMinioni * 8.2 + broiKamioni * 2.0;
//
//        if (50 <= broiKamioni + broiKukli + broiMecheta + broiMinioni + broiPuzzles) {
//            turnover = turnover * 0.75;
//        }
//
//        double pechalba = turnover * 0.9;
//
//        double delta = pechalba - cenaEks;
//
//
//
//        if (pechalba >= cenaEks) {
//            System.out.printf("Yes! " +  "%.2f"    + " lv left." , delta);
//        } else {
//            System.out.printf("Not enough money! " + "%.2f" +  " lv needed.",delta*-1);
//        }

//zad5
//
//double budged = scanner.nextDouble();
//int statistiBroi = scanner.nextInt();
//double cenaoblekloStatist = scanner.nextDouble();
//
//double dekor = budged * 0.1;
//        if (statistiBroi > 150) {
//cenaoblekloStatist = cenaoblekloStatist * 0.9;
//        }
//
//double delta = budged - dekor - (statistiBroi * cenaoblekloStatist);
//
//        if (budged < dekor + (statistiBroi * cenaoblekloStatist)) {
//        System.out.println("Not enough money!");
//            System.out.printf("Wingard needs " + "%.2f" + " leva more.", delta * -1);
//        } else {
//                System.out.println("Action!");
//            System.out.printf("Wingard starts filming with " + "%.2f" + " leva left.", delta);
//        }

//zad7
////
//double record = scanner.nextDouble();
//double razstoqnie = scanner.nextDouble();
//double sekundiPerMeter = scanner.nextDouble();
//
//
//double ivanTime = razstoqnie * sekundiPerMeter;
//
//
////        ivanTime = ivanTime + (razstoqnie / 15) * 12.5;
//
//ivanTime = ivanTime + Math.floor(razstoqnie / 15) * 12.5;
//
//double nedostig = ivanTime - record;
//
//        if (ivanTime < record) {
//        System.out.printf("Yes, he succeeded! The new world record is " + "%.2f" + " seconds.", ivanTime);
//        } else {
//                System.out.printf("No, he failed! He was " + "%.2f" + " seconds slower.", nedostig);
//        }

//zad8
//double budget = scanner.nextDouble();
//int videoK = scanner.nextInt();
//int procesori = scanner.nextInt();
//int ram = scanner.nextInt();
//
//double smetka = videoK * 250 + procesori * videoK*250 * 0.35 + ram * videoK*250 * 0.1;
//
//        if (videoK > procesori) {
//smetka = smetka * 0.85;
//        }
//
//        if ( smetka <= budget ) {
//        System.out.printf("You have " + "%.2f" + " leva left!", budget-smetka);
//        } else {
//                System.out.printf("Not enough money! You need " + "%.2f" + " leva more!",smetka-budget);
//        }


