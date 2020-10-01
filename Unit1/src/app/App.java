package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);


        System.out.println("Question 1: how many siblings do I have?");
        int sibs = input.nextInt();
        int sibsA = 1;

        if (sibs == sibsA){
            System.out.println("Correct.");
        }

        else{
            System.out.println("incorrect");
        }

     }
}

