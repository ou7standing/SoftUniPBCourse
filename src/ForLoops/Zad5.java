package ForLoops;

import java.util.Scanner;

public class Zad5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Според отворения сайт в таба се налагат следните глоби:
//•	"Facebook" -> 150 лв.
//•	"Instagram" -> 100 лв.
//•	"Reddit" -> 50 лв.
//От конзолата се четат два реда:
//•	Брой отворени табове в браузъра n - цяло число в интервала [1...10]
//•	Заплата - число в интервала [500...1500]
//След това n – на брой пъти се чете име на уебсайт – текст
//Изход
//•	Ако по време на проверката заплатата стане по-малка или равна на 0 лева, на конзолата се изписва
//"You have lost your salary." и програмата приключва.
//•	В противен случай след проверката на конзолата се изписва остатъкът от заплатата (да се изпише като цяло число).


        int n = Integer.parseInt(scanner.nextLine());
        int zaplata = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {

            String site = scanner.nextLine();

            switch (site) {

                case "Facebook":
                    zaplata -= 150;
                    if (zaplata <= 0) {
                        System.out.println("You have lost your salary.");
                        return;
                    }
                    break;

                case "Instagram":
                    zaplata -= 100;
                    if (zaplata <= 0) {
                        System.out.println("You have lost your salary.");
                        return;
                    }
                    break;


                case "Reddit":
                    zaplata -= 50;
                    if (zaplata <= 0) {
                        System.out.println("You have lost your salary.");
                        return;
                    }
                    break;

//                default:
//                    break;



            }
        }
        if (zaplata > 0) {
            System.out.println(zaplata);
        }

    }

}
