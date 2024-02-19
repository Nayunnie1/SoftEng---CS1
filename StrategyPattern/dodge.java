package StrategyPattern;

public class dodge implements defenseStrat{
    @Override
    public String defend() {
        String output = new String();
        output += " Dodged attack!";
        return output;
    }
}