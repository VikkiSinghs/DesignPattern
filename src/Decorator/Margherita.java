package Decorator;

public class Margherita implements Pizza {
    public String getDescription(){
        return "Margherita Pizza";
    }
    public double cost(){
        return 1.33;
    }
}
