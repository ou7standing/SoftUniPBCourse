package NestedLoops;

import java.util.Scanner;

class NestedLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int numCounter = 1;

        for (int i = 1; i <= n; i++) {


            for (int j = 1; j <= i; j++) {
                System.out.print(numCounter + " ");
                numCounter++;

                if (numCounter == n+1) {
                    return;
                }

//                if(i==j){
//                    break;
//                }

            }

            System.out.println();

        }

    }


}
