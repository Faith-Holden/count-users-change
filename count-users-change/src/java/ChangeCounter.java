package java;

import textio.TextIO;

public class ChangeCounter {
    public static void main(String[]args){
        System.out.println("Hi, I'll help you count your change. First, how many quarters do you have?");
        int quarters = TextIO.getlnInt();//gets number of quarters
        System.out.println("Great! How many dimes do you have?");
        int dimes = TextIO.getlnInt();//gets number of nickles
        System.out.println("Wonderful! Now, how many nickles do you have?");
        int nickles = TextIO.getlnInt();//gets number of nickles
        System.out.println("Awesome! Last question: How many pennies do you have?");
        int pennies = TextIO.getlnInt();//gets number of pennies
        double moneyTotal;//money amount of all coins totalled, expressed in dollars
        moneyTotal = (.25*quarters)+(.10*dimes)+(.05*nickles)+(.01*pennies);
        System.out.println("Ok, I've added your quarters, dimes, nickles and pennies. You have $"+moneyTotal+".");

    }
}
