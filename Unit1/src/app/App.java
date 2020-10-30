package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String line[] = {"Diddy", "Daisy", "Yoshi", "Toad", "Wario","DK", "Luigi", "Peach", "Mario", "Waluigi"};
        System.out.println(line[4]);
        System.out.println(line[0]);
        line[4]= "Bowser";
        System.out.println(line[4]);
        int numOfPeepsInLine = line.length;
        for (int i = 0; i < line.length; i++){
            System.out.println(i);
        }
        
            }
        }
        