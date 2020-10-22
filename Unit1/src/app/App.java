package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int freezing = 32;
        System.out.println("What is the current temp?");
        int temp = input.nextInt();
        input.nextLine();

        if(temp <= freezing){
            System.out.println("It is freezing.");
        }

        else{
            System.out.println("It is above freezing.");
        }
            }
        }