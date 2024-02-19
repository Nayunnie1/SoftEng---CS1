package StrategyPattern;

public class magic implements defenseStrat{
    @Override
    public String defend() {
        String output = new String();
        output += " Using magic barrier for defense!";
        return output;
    }
}