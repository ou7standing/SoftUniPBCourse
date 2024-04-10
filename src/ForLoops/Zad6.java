package ForLoops;

import java.util.Scanner;

public class Zad6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Поканени сте от академията да напишете софтуер, който да пресмята точките за актьор/актриса. Академията ще ви даде първоначални точки за актьора.
//        След това всеки оценяващ ще дава своята оценка. Точките, които актьора получава се формират от: дължината на името на оценяващия умножено по точките, които дава делено на две.
//Ако резултатът в някой момент надхвърли 1250.5 програмата трябва да прекъсне и да се отпечата, че дадения актьор е получил номинация.
//Вход
//•	Име на актьора - текст
//•	Точки от академията - реално число в интервала [2.0... 450.5]
//•	Брой оценяващи n - цяло число в интервала[1… 20]
//На следващите n-на брой реда:
//o	Име на оценяващия - текст
//o	Точки от оценяващия - реално число в интервала [1.0... 50.0]
//Изход
//Да се отпечата на конзолата един ред:
//•	Ако точките са над 1250.5:
//"Congratulations, {име на актьора} got a nominee for leading role with {точки}!"
//•	Ако точките не са достатъчни:
//	"Sorry, {име на актьора} you need {нужни точки} more!"
//Резултатът да се форматирана до първата цифра след десетичния знак!

        String ime = scanner.nextLine();
        double tochki = Double.parseDouble(scanner.nextLine());
        int broiOcenqvashti = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < broiOcenqvashti; i++) {

            String ocenqvasht = scanner.nextLine();
            double tochkiOcenqvasht = Double.parseDouble(scanner.nextLine());

            tochki = tochki + (ocenqvasht.length() * tochkiOcenqvasht) / 2;

            if (tochki > 1250.5) {
                System.out.printf("Congratulations, " + ime + " got a nominee for leading role with " + "%.1f" + "!", tochki);
                return;
            }
        }

        System.out.printf("Sorry, " + ime + " you need " + "%.1f" + " more!", 1250.5-tochki);



    }


}
