package StrategyPattern;

public class spell implements attackStrat {
    @Override
    public String attack() {
        String output = new String();
        output += " Enchanting a spell";
        return output;
    }
}