package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);


        System.out.println("Hello! Are you ready to learn about dogs?");
        System.out.println("Please enter a number 1-5 to get your first fact.");
        int inputNum = input.nextInt();

        String fact1 = "A dog's sense of smell is 50 times stronger than a humans!";
        String fact2 = "Fun fact: Three dogs survived the sinking of the titanic... first class perks.";
        String fact3 = "Around 30% of dalmations are deaf in one ear due to a gene mutation";
        String fact4 = "A dog's nose print is unique to only that dog, much like human finger prints.";
        String fact5 = "45% of American dogs sleep in their owner's bed each night";

        if(inputNum == 1){
            System.out.println(fact1);
        }
    

        if(inputNum == 2){
            System.out.println(fact2);
        }

        if(inputNum == 3){
            System.out.println(fact3);
        }

        if(inputNum == 4){
            System.out.println(fact4);
        }

        if(inputNum == 5){
            System.out.println(fact5);
        }

        else{
            System.out.println("Error. You have enetred a number that is not between 1 and 5. Please restart and try again.");
        }

        System.out.println("Hopefully you learned something new from your first fact, onto round 2.");
        System.out.println("Please enter a different number 1-5 for a new fact.");
        int roundTwo = input.nextInt();

         if(roundTwo == 1){
            System.out.println(fact1);
        }
    

        if(roundTwo == 2){
            System.out.println(fact2);
        }

        if(roundTwo == 3){
            System.out.println(fact3);
        }

        if(roundTwo == 4){
            System.out.println(fact4);
        }

        if(roundTwo == 5){
            System.out.println(fact5);
        }

        else{
            System.out.println("Error. You have enetred a number that is not between 1 and 5. Please restart and try again.");
        }


        System.out.println("Round 3:");
        System.out.println("Please enter a different number 1-5 for a new fact.");
        int roundThree = input.nextInt();

        if(roundThree == 1){
            System.out.println(fact1);
        }
    

        if(roundThree == 2){
            System.out.println(fact2);
        }

        if(roundThree == 3){
            System.out.println(fact3);
        }

        if(roundThree == 4){
            System.out.println(fact4);
        }

        if(roundThree == 5){
            System.out.println(fact5);
        }

        else{
            System.out.println("Error. You have enetred a number that is not between 1 and 5. Please restart and try again.");
        }


         System.out.println("Round 4:");
        System.out.println("Please enter a different number 1-5 for a new fact.");
        int roundFour = input.nextInt();
        if(roundFour == 1){
            System.out.println(fact1);
        }
    

        if(roundFour == 2){
            System.out.println(fact2);
        }

        if(roundFour == 3){
            System.out.println(fact3);
        }

        if(roundFour == 4){
            System.out.println(fact4);
        }

        if(roundFour == 5){
            System.out.println(fact5);

        }

        else{
            System.out.println("Error. You have enetred a number that is not between 1 and 5. Please restart and try again.");
        }

        System.out.println("Last but not least, Round 5:");
        System.out.println("Please enter a different number 1-5 for a new fact.");
        int roundFive = input.nextInt();

        if(roundFive == 1){
            System.out.println(fact1);
        }
    

        if(roundFive == 2){
            System.out.println(fact2);
        }

        if(roundFive == 3){
            System.out.println(fact3);
        }

        if(roundFive == 4){
            System.out.println(fact4);
        }

        if(roundFive == 5){
            System.out.println(fact5);
        }
        else{
            System.out.println("Error. You have enetred a number that is not between 1 and 5. Please restart and try again.");
        }

        System.out.println("Thank you so much for listening to some (hopefully) interesting dog facts.");
        System.out.println("Bonus fact: the world's oldest dog lived to 29 years old!");
        System.out.println("That is all I have for you. Have a great day :)");





     }
    }


