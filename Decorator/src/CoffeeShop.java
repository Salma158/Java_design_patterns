import coffee.Coffee;
import coffee.MilkDecorator;
import coffee.PlainCoffee;
import coffee.SugarDecorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee coffee = new PlainCoffee();
        System.out.println(coffee.getDescription() + " costs $" + coffee.getCost());

        Coffee milkCoffee = new MilkDecorator(new PlainCoffee());
        System.out.println(milkCoffee.getDescription() + " costs $" + milkCoffee.getCost());

        Coffee milkAndSugarCoffee = new SugarDecorator(new MilkDecorator(new PlainCoffee()));
        System.out.println(milkAndSugarCoffee.getDescription() + " costs $" + milkAndSugarCoffee.getCost());

        //notes :
        // decorator enhance behaviour of existing object dynamically
        // wraps the object within itself and provides the same interface as wrapped objects
        // alternative approach to subclassing for extending functionality of existing classes
        // you can mix decorators to achieve various combinations of functionalities.
    }
}