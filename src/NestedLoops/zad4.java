package NestedLoops;

import java.util.Scanner;

public class zad4 {
    //Курсът "Train the trainers" е към края си и финалното оценяване наближава. Вашата задача е да помогнете на журито което ще оценява презентациите,
    // като напишете програма в която да изчислява средната оценка от представянето на всяка една презентация от даден студент, а накрая средният успех от всички тях.
    //От конзолата на първият ред се прочита броят на хората в журито n - цяло число в интервала [1…20]
    //    //След това на отделен ред се прочита името на презентацията - текст
    //    //За всяка една презентация на нов ред се четат n - на брой оценки - реално число в интервала [2.00…6.00]
    //    //След изчисляване на средната оценка за конкретна презентация, на конзолата се печата
    //    // "{името на презентацията} - {средна оценка}."
    //    //След получаване на команда "Finish" на конзолата се печата "Student's final assessment is {среден успех от всички презентации}." и програмата приключва.
    //Всички оценки трябва да бъдат форматирани до втория знак след десетичната запетая.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juriBroi = Integer.parseInt(scanner.nextLine());
        String presName = scanner.nextLine();
        double countOcenki = 0;
        double sumOcenki = 0;

        while (!presName.equals("Finish")) {
            double totalOcenka = 0;
            countOcenki++;


            for (int i = 0; i < juriBroi; i++) {
                double o = Double.parseDouble(scanner.nextLine());
                totalOcenka += o;
            }

            sumOcenki += totalOcenka / juriBroi;
            System.out.printf(presName + " - " + "%.2f." + "\n", totalOcenka / juriBroi);
            presName = scanner.nextLine();

        }

        System.out.printf("Student's final assessment is " + "%.2f." , sumOcenki/countOcenki);

    }


}
