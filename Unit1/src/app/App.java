package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int score = 0;

        System.out.println("Welcome to your quiz. Before we start, any string answers must have the first letter capitalized to be counted correct. Let's begin.");



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

        System.out.println("Question 6: true or false? My favorite subject is math");
        boolean favSub = input.nextBoolean();
        input.nextLine();
        boolean favSubA = false;

        if(favSub == favSubA){
            System.out.println("Correct.");
            score = score + 1;
        }

        System.out.println("Question 7: What is my first pet's name?");
        String firstPet = input.nextLine();
        String firstPetA = "Earl";

        if(firstPet.equals(firstPetA)){
            System.out.println("Correct.");
            score = score + 1;
        }

        else{
            System.out.println("incorrect");
        }

        System.out.println("Question 8: What smell do I hate most?");
        String hateSmell = input.nextLine();
        String hateSmellA ="Pickles";

        if(hateSmell.equals(hateSmellA)){
            System.out.println("Correct.");
            score = score + 1;
        }

        else{
            System.out.println("Incorrect.");
        }

        System.out.println("Question 9: True or False? I like the Ocean");
        boolean ocean = input.nextBoolean();
        boolean oceanA = false;

        if(ocean == oceanA){
            System.out.println("Correct.");
            score = score + 1;
        }

        else{
            System.out.println("Incorrect.");
        }

        System.out.println("Question 10: True or False? I can't think of another question");
        boolean thinkQ = input.nextBoolean();
        boolean thinkQA = true;

        if(thinkQ == thinkQA){
            System.out.println("Correct.");
            score = score + 1;
        }

        else{
            System.out.println("Incorrect.");
        }


        System.out.println("Well done. You score is " + score + "/10");

     }
    }


