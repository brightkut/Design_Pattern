package AbstractFactoryPattern;

public class ModernFurnitureFactory implements  IFurnitureFactory{

    @Override
    public IChair createChair() {
        return new ModernChair();
    }

    @Override
    public ICoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
