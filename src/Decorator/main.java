package Decorator;

public class main {
    public static void main(String[] args){
        Pizza pizza=new Margherita();
        System.out.println(pizza.getDescription() + " $" + pizza.cost());
        pizza = new Cheese(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());
        pizza = new Olives(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());
    }
}
