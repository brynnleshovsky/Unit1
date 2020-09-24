package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
   Scanner input = new Scanner(System.in);

   System.out.println("Please enter your first name.");
   String name  = input.nextLine();

   System.out.println("Hello, " + name);
   System.out.println("Please enter your last name.");
   String lastName = input.nextLine();
   System.out.println("Nice to meet you, " + name + " " + lastName);
   System.out.println("Please enter your age , " + name);
   String age = input.nextLine();
   System.out.println("thanks for sharing.");
   System.out.println("Now, what grade are you in?");
   String grade = input.nextLine();
   System.out.println("Great! We are almost done, " + name);
   System.out.println("One last thing, what is your favorite color?");
   String favColor = input.nextLine(); 
   System.out.println("Alright " + name + " " + lastName + "," + " you are " +  age + ", in grade " + grade + ", and your favorite color is " + favColor + ".");
    }
}