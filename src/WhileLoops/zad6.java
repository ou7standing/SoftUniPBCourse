package WhileLoops;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Поканени сте на 30-ти рожден ден, на който рожденикът черпи с огромна торта. Той обаче не знае колко парчета могат да си вземат гостите от нея.
// Вашата задача е да напишете програма, която изчислява броя на парчетата, които гостите са взели, преди тя да свърши. Ще получите размерите на
// тортата в сантиметри (широчина и дължина – цели числа в интервала [1...1000]) и след това на всеки ред, до получаване на командата "STOP" или
// докато не свърши тортата, броят на парчетата, които гостите вземат от нея. Парчетата са квадратни с размер  1 см .
//Да се отпечата на конзолата един от следните редове:
//•	"{брой парчета} pieces are left." - ако стигнете до STOP и има останали парчета торта.
//•	"No more cake left! You need {брой недостигащи парчета} pieces more."

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();


        int area = a * b;

        while (!input.equals("STOP")) {

            area = area - Integer.parseInt(input);

            if (area < 0 ) {
                System.out.println("No more cake left! You need " + Math.abs(area) + " pieces more.");
                return;
//            continue;
            }


            input = scanner.nextLine();


        }


        System.out.println(area + " pieces are left.");


    }


}
