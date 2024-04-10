package ForLoops;

import java.util.Scanner;

public class zad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Лили вече е на N години. За всеки свой рожден ден тя получава подарък.
//•	За нечетните рождени дни (1, 3, 5...n) получава играчки.
//•	За четните рождени дни (2, 4, 6...n) получава пари.
//За втория рожден ден получава 10.00 лв, като сумата се увеличава с 10.00 лв., за всеки следващ четен рожден ден (2 -> 10, 4 -> 20, 6 -> 30...и т.н.).
//// През годините Лили тайно е спестявала парите. Братът на Лили, в годините, които тя получава пари, взима по 1.00 лев от тях.
// Лили продала играчките получени през годините, всяка за P лева и добавила сумата към спестените пари. С парите искала да си купи пералня за X лева.
// Напишете програма, която да пресмята, колко пари е събрала и дали ѝ стигат да си купи пералня.

//Изход
//Да се отпечата на конзолата един ред:
//•	Ако парите на Лили са достатъчни:
//o	"Yes! {N}" - където N е остатъка пари след покупката
//•	Ако парите не са достатъчни:
//o	"No! {М}" - където M е сумата, която не достига
//Числата N и M трябва да за форматирани до вторият знак след десетичната запетая.

        int vuzrastLili = Integer.parseInt(scanner.nextLine());
        double cenaPeralnq = Double.parseDouble(scanner.nextLine());
        int cenaIgrachka = Integer.parseInt(scanner.nextLine());


        double sum = 0;

        for (int i = 1; i <= vuzrastLili; i++) {

            if (i % 2 == 0) {
                sum += (double) i /2 * 10 - 1.0;
            }

        }

        sum +=  Math.ceil((double) vuzrastLili /2) * cenaIgrachka;

        if (sum >= cenaPeralnq) {
            System.out.printf("Yes! " + "%.2f" , sum-cenaPeralnq);
        } else {
            System.out.printf("No! " + "%.2f", cenaPeralnq-sum);
        }

    }
}
