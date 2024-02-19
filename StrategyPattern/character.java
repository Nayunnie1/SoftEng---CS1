package StrategyPattern;

public class character {
    private  CharacterType charType;

    public character(CharacterType charType){
        this.charType = charType;
    }
    public String attack(){
        return charType.attack();
    }
    public String defend(){
        return charType.defend();
    }
}