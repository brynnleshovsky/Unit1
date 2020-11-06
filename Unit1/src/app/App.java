package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        multiply(2,4,1,6);
         }
         public static void greaterOrLess10(int number){
        if (number <= 10){
            System.out.println(number + " is less than ten.");
        }
        else{
            System.out.println(number + " is greater than 10.");
        }
         }
         public static void multiply(int num1, int num2, int num3, int num4){
             System.out.println(num1 * num2 * num3 * num4);
         }
        }
        