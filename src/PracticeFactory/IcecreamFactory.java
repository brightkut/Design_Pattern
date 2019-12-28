package PracticeFactory;

public class IcecreamFactory extends FoodFactory {

    @Override
    public Cook createFood() {
        return new Icecream();
    }
}
