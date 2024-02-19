package StrategyPattern;

public class arrow implements attackStrat{
    @Override
    public String attack() {
        String output = new String();
        output += " Shots an arrow!";
        return output;
    }
}