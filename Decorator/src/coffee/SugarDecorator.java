package coffee;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " ,with Sugar";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 10.0;
    }
}