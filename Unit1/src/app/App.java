package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Dog dog1 = new Dog();
        dog1.name = "Buddy";
        dog1.age = 5;
        dog1.breed = "Bulldog";
        System.out.println("Our first dog is named " + dog1.name + "." + " " + dog1.name + " is a " + dog1.age + " year old " + dog1.breed + ".");
        Dog dog2 = new Dog();
        dog2.name = "Fluffy";
        dog2.age = 1;
        dog2.breed = "Pug";
        System.out.println("Our second dog is named " + dog2.name + ". " + dog2.name + " is a " + dog2.age + " year old " + dog2.breed + ".");
        Dog dog3 = new Dog();
        dog3.name = "Mr. Cuddles";
        dog3.age = 12;
        dog3.breed = "Australian Shepherd";
        System.out.println("Our third dog is named " + dog3.name + ". " + dog3.name + " is a " + dog3.age + " year old " + dog3.breed + ".");

        }
    }
        