package StrategyPattern;

public class knight implements CharacterType{
    sword swingSword = new sword();
    shield shield = new shield();
    dodge dodge = new dodge();
    magic castMagic = new magic();
    @Override
    public String attack() {
        String output = new String();
        output += "Knight " + swingSword.attack();
        return output;
    }

    @Override
    public String defend() {
        String output = new String();
        output += "Knight " + shield.defend() + "\n";
        output += "Knight " + dodge.defend() + "\n";
        output += "Knight " + castMagic.defend() + "\n";
        return output;
    }
}