package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int secretNum = 40;
        boolean finished = false;

        while(finished == false){
            System.out.println("Please guess a number 1-100.");
            int guess = input.nextInt();
            input.nextLine();

            if(guess == secretNum){
                System.out.println("You are correct! 40 was the secret number.");
                finished = true;
            }

            else{

                if(guess > secretNum){
                    System.out.println("Nope. Your guess is too high.");
                }

                else{
                    System.out.println("Incorrect. Your guess is too low.");
                }
            }
        }



            }
        }