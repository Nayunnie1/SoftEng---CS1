package StrategyPattern;

public class shield implements defenseStrat{
    @Override
    public String defend() {
        String output = new String();
        output += " Defended with a shield!";
        return output;
    }
}