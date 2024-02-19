package StrategyPattern;

public class wizard implements CharacterType{
    spell castSpell = new spell();
    magic createMagic = new magic();
    @Override
    public String attack() {
        String output = new String();
        output += "Wizard " + castSpell.attack();
        return output;
    }

    @Override
    public String defend() {
        String output = new String();
        output += "Wizard " + createMagic.defend();
        return output;
    }
}