package Decorator;

public class Olives extends PizzaDecorator{
    public Olives(Pizza pizza){
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    public double cost() {
        return pizza.cost() + 1.66;
    }
}

