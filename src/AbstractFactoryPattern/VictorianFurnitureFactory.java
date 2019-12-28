package AbstractFactoryPattern;

public class VictorianFurnitureFactory implements IFurnitureFactory {

    @Override
    public IChair createChair() {
        return new VictorianChair();
    }

    @Override
    public ICoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
