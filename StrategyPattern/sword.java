package StrategyPattern;

public class sword implements attackStrat{
    @Override
    public String attack() {
        String output = new String();
        output += " Attacks with a sword!";
        return output;
    }
}