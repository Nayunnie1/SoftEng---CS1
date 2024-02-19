package StrategyPattern;

public class archer implements CharacterType{
    arrow shoot = new arrow();
    shield shieldUp = new shield();
    @Override
    public String attack() {
        String output = new String();
        output += "Archer" + shoot.attack();
        return output;
    }

    @Override
    public String defend() {
        String output = new String();
        output += "Archer" + shieldUp.defend();
        return output;
    }
}