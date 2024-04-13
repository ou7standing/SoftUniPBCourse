package WhileLoops;

import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//Ани отива до родния си град след много дълъг период извън страната. Прибирайки се вкъщи, тя вижда старата библиотека на баба си и си спомня за любимата си книга.
// Помогнете на Ани, като напишете програма, в която тя въвежда търсената от нея книга (текст). Докато Ани не намери любимата си книга или не провери всички книги в библиотеката,
// програмата трябва да чете всеки път на нов ред името на всяка следваща книга (текст), която тя проверява. Книгите в библиотеката са свършили щом получите текст "No More Books".
//•	Ако не открие търсената книгата да се отпечата на два реда:
//o	"The book you search is not here!"
//o	"You checked {брой} books."
//•	Ако открие книгата си се отпечатва един ред:
//o	"You checked {брой} books and found it."

        String bookNeeded = scanner.nextLine();
        String newBook = scanner.nextLine();
        boolean isFound = false;
        int n = -1;

        while (!newBook.equals("No More Books")) {
            n++;
            if (newBook.equals(bookNeeded)) {
                System.out.println("You checked " + n + " books and found it.");
                isFound = true;
                break;
            }
            newBook = scanner.nextLine();
        }

        if (isFound == false) {
            n++;
            System.out.println("The book you search is not here!" + "\n" + "You checked " + n + " books." );
        }

    }

}
