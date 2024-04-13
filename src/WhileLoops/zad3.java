package WhileLoops;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        Джеси е решила да събира пари за екскурзия и иска от вас да ѝ помогнете да разбере дали ще успее да събере необходимата сума.
//        Тя спестява или харчи част от парите си всеки ден. Ако иска да похарчи повече от наличните си пари, то тя ще похарчи всичките и ще ѝ останат 0 лева.
//Вход
//От конзолата се четат:
//•	Пари нужни за екскурзията - реално число в интервала [1.00…25000.00]
//•	Налични пари - реално число в интервала [0.00...25000.00]
//След това многократно се четат по два реда:
//•	Вид действие - текст с възможности "spend" и "save"
//•	Сумата, която ще спести/похарчи - реално число в интервала [0.01…25000.00]
//Изход
//Програмата трябва да приключи при следните случаи:
//•	Ако 5 последователни дни Джеси само харчи, на конзолата да се изпише:
//o	"You can't save the money."
//o	"{Общ брой изминали дни}"
//•	Ако Джеси събере парите за почивката на конзолата се изписва:
//o	"You saved the money for {общ брой изминали дни} days."

        double fundsNeeded = Double.parseDouble(scanner.nextLine());
        double currentFunds = Double.parseDouble(scanner.nextLine());

        String action = scanner.nextLine();
        double sumHarchene = Double.parseDouble(scanner.nextLine());

        int dni = 0;
        int harch = 0;

        while (currentFunds < fundsNeeded) {
            dni++;
            if (action.equals("save")) {
                harch = 0;
                currentFunds = currentFunds + sumHarchene;
            } else {
                harch++;
                currentFunds = currentFunds - sumHarchene;
                if (currentFunds < 0) {
                    currentFunds = 0;
                }
            }

            if (harch >= 5) {
                System.out.println("You can't save the money.");
                System.out.println(dni);
                return;
            }

            if (currentFunds >= fundsNeeded) {
                System.out.println("You saved the money for " + dni + " days.");
                return;
            }


            action = scanner.nextLine();
            sumHarchene = Double.parseDouble(scanner.nextLine());


        }

//        System.out.println("You saved the money for " +dni + " days.");


    }

}
