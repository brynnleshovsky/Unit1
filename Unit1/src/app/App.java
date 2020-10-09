package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int secretNum = 40;
        int guess;
        boolean answer = false;


        while (!answer) {
            System.out.println("Please guess a number.");
            guess = input.nextInt();

            if (guess == secretNum){
                answer = true;
                System.out.println("You guessed correctly!");
            }
            else if (guess < secretNum){
                System.out.println("guess higher!");
            }

                else if (guess > secretNum){
                    System.out.println("Guess lower!");
                }
        }
            }
        }