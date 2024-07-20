package coffee;

public class PlainCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "this is a simple coffee without any additional flavours, sweeteners or milk";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}
