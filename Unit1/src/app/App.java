package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Challenge 1: Print all numbers 1-1000 in as few lines as possible... starting NOW:");

        for(int challenge1 = 1; challenge1<= 1000; challenge1 ++){
          System.out.println(challenge1);  
        }

        System.out.println("Great! Challenge One is complete.");
        System.out.println("Challenge 2: The secret Message. Enter the passcode to see the top secret information. Don't Guess too many times or else you may never know what the secret is...");
        System.out.println("Enter the passcode.");
        String attempt = input.nextLine();
        String passcode = "Jelly Belly jelly beans";
        String secret = "Jelly Belly jelly beans are actually really gross, why did you guess that passcode?";

        if(attempt.equals(passcode)){
            System.out.println("Correct! The secret is that " + secret + ". Anyway, you did it! have a great rest of your day.");
        }

        else{
            System.out.println("Error! The password you have entered is incorrect. You have two more attempts.");
            System.out.println("Please enter the correct passcode.");
            String attempt2 = input.nextLine();
            if(attempt2.equals(passcode)){
                System.out.println("Correct! The secret is that " + secret + ". Anyway, you did it! have a great rest of your day.");
            }

            else{
                System.out.println("Error! Failed attempt 2. You have one more attempt.");
                System.out.println("Please enter the correct passcode.");
                String attempt3 = input.nextLine();
                 if(attempt3.equals(passcode)){
                    System.out.println("Correct! the secret is that " + secret + ". Anyway, you did it! have a great rest of your day.");
                
            }
            else{
                System.out.println("Error! You have failed 3 times. Due to security of the top secret message, I will have to end the program. Good Bye.");
            }


     }
    }
}
}


