package ForLoops;

import java.util.Scanner;

public class zad3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//Дадени са n цели числа в интервала [1…1000]. От тях някакъв процент p1 са под 200, друг процент p2 са от 200 до 399, друг процент p3 са от 400 до 599,
// друг процент p4 са от 600 до 799 и останалите p5 процента са от 800 нагоре. Да се напише програма, която изчислява и отпечатва процентите p1, p2, p3, p4 и p5.

        double ot0do200 = 0;
        double ot200do400 = 0;
        double ot400do600 = 0;
        double ot600do800 = 0;
        double ot800nagore = 0;


        int broiChisla = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < broiChisla; i++) {

            int chislo = scanner.nextInt();

            if (chislo < 200) {
                ot0do200 += 1;
            } else if (chislo < 400) {
                ot200do400 += 1;
            } else if (chislo < 600) {
                ot400do600 += 1;
            } else if (chislo < 800) {
                ot600do800 += 1;
            } else {
                ot800nagore += 1;
            }

        }
///Да се отпечата на конзолата хистограмата – 5 реда, всеки от които съдържа число между 0% и 100%, с точност две цифри след десетичната точка, например 25.00%, 66.67%, 57.14%.

        System.out.printf("%.2f%" + "%" + "\n", 100*ot0do200 / broiChisla);
        System.out.printf("%.2f%" + "%" + "%n", 100*ot200do400 / broiChisla);
        System.out.printf("%.2f%" + "%" + "%n", 100*ot400do600 / broiChisla);
        System.out.printf("%.2f%" + "%" + "%n", 100*ot600do800 / broiChisla);
        System.out.printf("%.2f%" + "%" + "%n", 100*ot800nagore / broiChisla);


    }


}
