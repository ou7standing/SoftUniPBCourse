package WhileLoops;

import java.util.Scanner;

public class zad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Габи иска да започне здравословен начин на живот и си е поставила за цел да върви 10 000 стъпки всеки ден. Някои дни обаче е много уморена от работа и ще иска
//        да се прибере преди да постигне целта си. Напишете програма, която чете от конзолата по колко стъпки изминава тя всеки път като излиза през деня и когато постигне
//        целта си да се изписва "Goal reached! Good job!"  и колко стъпки повече е извървяла "{разликата между стъпките} steps over the goal!".
//Ако иска да се прибере преди това, тя ще въведе командата "Going home" и ще въведе стъпките, които е извървяла докато се прибира. След което, ако не е
// успяла да постигне целта си, на конзолата трябва да се изпише: "{разликата между стъпките} more steps to reach goal."

        String input = scanner.nextLine();
        int sum = 0;


        while (!input.equals("Going home")) {
            sum = sum + Integer.parseInt(input);

            if (sum >= 10000) {
                System.out.print("Goal reached! Good job!" + "\n" + (sum - 10000) + " steps over the goal!");
                return;
            }


            input = scanner.nextLine();

        }

        if (input.equals("Going home")) {

            input = scanner.nextLine();
            sum = sum + Integer.parseInt(input);

            if (sum < 10000) {
                System.out.println((10000 - sum) + " more steps to reach goal.");
            } else {
                System.out.println("Goal reached! Good job!" + "\n" + (sum - 10000) + " steps over the goal!");
            }


        }

//        System.out.println(sum);

    }


}
