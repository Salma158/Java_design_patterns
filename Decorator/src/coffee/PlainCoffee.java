package coffee;

public class PlainCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "this is a very tasty coffee";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}
