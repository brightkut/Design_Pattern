package PracticeFactory;

public class ChocolateFactory extends FoodFactory {


    @Override
    public Cook createFood() {
        return new Chocolate();
    }


}
