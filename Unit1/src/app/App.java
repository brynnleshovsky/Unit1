package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to roulette. You will start with 100 $1 chips");
        int chips = 100;
         System.out.println("Hi and welcome to roulette.");
         System.out.println("Would you like to bet inside or outside?");
         String inOrOut = input.nextLine();
         String in = "inside";
         String out = "outside";
         int remainingBets = 10;
         String yes = "yes";
         String no = "no";
         boolean looping = true;
         String red = "red";
         String black = "black";
         String odd= "odd";
         String even = "even";


         if (inOrOut.equals(in)){
             System.out.println("Enter the number you would like to bet on.");
             int betNum = input.nextInt();
             input.nextLine();
             System.out.println("And how much would you like to bet?");
             int betMon = input.nextInt();
             input.nextLine();
             System.out.println("Okay. You will bet $" + betMon + " on " + betNum + ".");
             remainingBets = remainingBets -1;
         }

             else{
                 System.out.println("would you like to bet even, odd, black, or red?");
                 String outBet = input.nextLine();
                 if (outBet.equals(red)){}
                 if (outBet.equals(black)){}
                 if (outBet.equals(odd)){}
                 if (outBet.equals(even)){}

             }
         
         while (looping == true){
         System.out.println("Would you like to make another bet? You have " + remainingBets + " left.");
         String secondBet = input.nextLine();
         if (secondBet.equals(yes)){
             System.out.println("check");
         }
         else if (secondBet.equals(no)){
             looping = false;
             System.out.println("Betting is now complete.");
         }
        }

       
        }
            }
        