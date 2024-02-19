package StrategyPattern;

public class MainApp {
    public static void main (String[] args){
        character knight = new character(new knight());
        character wizard = new character(new wizard());
        character archer = new character(new archer());

        
        System.out.println(knight.attack());
        System.out.print(knight.defend());
        System.out.println();

        
        System.out.println(wizard.attack());
        System.out.println(wizard.defend());
        System.out.println();

        
        System.out.println(archer.attack());
        System.out.println(archer.defend());
    }
}