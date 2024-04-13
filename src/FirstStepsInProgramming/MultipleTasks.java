package FirstStepsInProgramming;

import java.util.Scanner;

public class MultipleTasks {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

String a = scanner.nextLine();

String b = scanner.nextLine();;

        System.out.println(a ==b );


    }
}


//zad 2
//         double ugul = Double.parseDouble(scanner.nextLine());
//
//        System.out.println(ugul*180/Math.PI);


//zad 3
//double deposit = Double.parseDouble(scanner.nextLine());
//
//int srok = Integer.parseInt(scanner.nextLine());
//
//double lihvenProcent = Double.parseDouble(scanner.nextLine());
//
//double suma = deposit + srok *((deposit*lihvenProcent/100)/12);
//
//        System.out.println(suma );


//zad4
//int broiStranici = Integer.parseInt(scanner.nextLine());
//int straniciPerHour = Integer.parseInt(scanner.nextLine());
//int broiDni = Integer.parseInt(scanner.nextLine());
//
//int chasoveNaDen = (broiStranici/straniciPerHour)/broiDni;
//
//        System.out.println(chasoveNaDen);

//zad5
//int himikali = Integer.parseInt(scanner.nextLine());
//int markeri = Integer.parseInt(scanner.nextLine());
//        int preparat = Integer.parseInt(scanner.nextLine());
//                int namalenie = Integer.parseInt(scanner.nextLine());
//
//
//double otgBezots = himikali*5.8 + markeri*7.2 + preparat*1.2 ;
//
//        System.out.println(otgBezots - (otgBezots*namalenie/100));
// moish da q vidish zaradi 3tata desetichna zapetaq w otgowora

//zad6
//        int nailonM2 = Integer.parseInt(scanner.nextLine());
//        int boqLitri = Integer.parseInt(scanner.nextLine());
//        int razreditel = Integer.parseInt(scanner.nextLine());
//        int chasowe = Integer.parseInt(scanner.nextLine());
//
//
//        double totalCostNoWork = (nailonM2 * 1.5 + 2 * 1.5) + boqLitri * 14.5 * 1.1 + 0.4 + 5 * razreditel;
//
//
//        System.out.println(totalCostNoWork + totalCostNoWork * chasowe * 0.3);


//zad7
//        int pile = Integer.parseInt(scanner.nextLine());
//        int riba = Integer.parseInt(scanner.nextLine());
//        int veggie = Integer.parseInt(scanner.nextLine());
//
//        double total = pile * 10.35 + riba * 12.4 + veggie * 8.15;
//
//        System.out.println(total * 1.2 + 2.5);

//zad8
//        int taksaGod = Integer.parseInt(scanner.nextLine());
//
//        double kecove = taksaGod*0.6;
//        double ekip = kecove*0.8;
//        double topka = ekip*0.25;
//        double akses = topka*0.2;
//
//        System.out.println(taksaGod + kecove+ekip+topka+akses);


//zad10
////int a = Integer.parseInt(scanner.nextLine());
//int b = Integer.parseInt(scanner.nextLine());
//int c = Integer.parseInt(scanner.nextLine());
//double procent = Double.parseDouble(scanner.nextLine());
//
//int obshtaVmest = a * b * c;
//
//double litri = obshtaVmest/1000.0;
//
//        System.out.println(litri - litri*(procent/100)            );
