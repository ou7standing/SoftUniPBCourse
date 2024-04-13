package WhileLoops;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Напишете програма, в която Марин решава задачи от изпити, докато не получи съобщение "Enough" от лектора си. При всяка решена задача, той получава оценка.
//      Програмата трябва да приключи прочитането на данни при команда "Enough" или ако Марин получи определеният брой незадоволителни оценки.
//Незадоволителна е всяка оценка, която е по-малка или равна на 4.
//Вход
//•	На първи ред - брой незадоволителни оценки - цяло число в интервала [1…5]
//•	След това многократно се четат по два реда:
//o	Име на задача - текст
//o	Оценка - цяло число в интервала [2…6]
//Изход
//•	Ако Марин стигне до командата "Enough", отпечатайте на 3 реда:
//o	"Average score: {средна оценка}"
//o	"Number of problems: {броя на всички задачи}"
//o	"Last problem: {името на последната задача}"
//•	Ако получи определения брой незадоволителни оценки:
//o	"You need a break, {брой незадоволителни оценки} poor grades."
//Средната оценка да бъде форматирана до втория знак след десетичната запетая.

        int loshiOcenkiLimit = Integer.parseInt(scanner.nextLine());

        String imeZadacha = scanner.nextLine();
        int ocenka = Integer.parseInt(scanner.nextLine());

        int totalCountOcenki = 0;
        double totalValueOcenki = 0;
        int loshiOcenki = 0;
        String bingoZadacha = "Bingozadacha";




        while (!imeZadacha.equals("Enough")) {
            totalCountOcenki++;
            totalValueOcenki = totalValueOcenki + ocenka;
            if (ocenka <= 4) {
                loshiOcenki++;
            }

            if (loshiOcenki >= loshiOcenkiLimit) {
                System.out.println("You need a break, " + loshiOcenki + " poor grades.");
                break;
            }

            imeZadacha = scanner.nextLine();
            if (!imeZadacha.equals("Enough")) {
                bingoZadacha = imeZadacha;

            }

            if (imeZadacha.equals("Enough")) {
                break;
            } else {
                ocenka = Integer.parseInt(scanner.nextLine());
            }

        }

        if (loshiOcenki < loshiOcenkiLimit) {
            System.out.printf("Average score: " + "%.2f", totalValueOcenki / totalCountOcenki);
            System.out.println("\n" + "Number of problems: " + totalCountOcenki);
            System.out.println("Last problem: " + bingoZadacha);
        }


    }

}
