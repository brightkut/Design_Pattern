package PracticeFactory;

public class Main {
    public static void main(String[] args) {
        FoodFactory f = new ChocolateFactory();
        FoodFactory f2 = new IcecreamFactory();

        f.createFood().cookFood();
        f2.createFood().cookFood();


    }
}
