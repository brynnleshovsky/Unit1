package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int score = 0;



        System.out.println("Question 1: how many siblings do I have?");
        int sibs = input.nextInt();
        input.nextLine();
        int sibsA = 1;

        if (sibs == sibsA){
            System.out.println("Correct.");
            score = score +1;
        }

        else{
            System.out.println("incorrect");
        }

        System.out.println("Question two: What is my favorite food?");
        String food = input.nextLine();
        String foodA = "Peanuts";

        if (food.equals(foodA)){
            System.out.println("Correct.");
            score = score +1;
        }

        else {
            System.out.println("Incorect");
        }

        System.out.println("Question 3: What is my favorite beverage?");
        String favBev = input.nextLine();
        String favBevA = "Water";

        if (favBev.equals(favBevA)){
            System.out.println("Correct.");
            score = score +1;
        }

        else{

            System.out.println("Incorrect");
        }

        System.out.println("Question 4: What is my favorite dog breed?");
        String favDog = input.nextLine();
        String favDogA = "Samoyed";

        if (favDog.equals(favDogA)){
            System.out.println("Correct.");
             score = score +1;
        }

        else{
            System.out.println("Incorrect.");
        }
        
        System.out.println("Question five: What is my favorite season?");
        String favSeas = input.nextLine();
        String favSeasA = "Fall";

        if (favSeas.equals(favSeasA)){
            System.out.println("Correct.");
             score = score +1;
        }

        else{
            System.out.println("Incorrect");
        }
        System.out.println("Well done. You score is " + score + "/5");

     }
}

