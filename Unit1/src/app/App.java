package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi! Please input any number");
        int num1 = input.nextInt();
        input.nextLine();
        System.out.println("Please enter a higher number. I will print out all of the even numbers between the two you input.");
        int num2 = input.nextInt();
        input.nextLine();

        while (num1 < num2 -2){
                if(num1 % 2 == 0){
                    num1 = num1 +2;
                    
            System.out.println(num1);
                    }

            else{
                num1 = num1 +1;
                System.out.println(num1);
            }
        }
        System.out.println("That's it! Press run to play again."); 
            }
        }