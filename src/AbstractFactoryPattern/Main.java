package AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        //create object that use to create victoria furniture
        VictorianFurnitureFactory v = new VictorianFurnitureFactory();
        IChair victorianChair = v.createChair();
        ICoffeeTable victorianCoffeeTable = v.createCoffeeTable();
        System.out.println(victorianChair.sitOn());
        System.out.println(victorianCoffeeTable.drink());


        //create object that use to create modern furniture
        ModernFurnitureFactory m = new ModernFurnitureFactory();
        IChair  modernChair = m.createChair();
        ICoffeeTable modernCoffeeTable  = m.createCoffeeTable();
        System.out.println(modernChair.sitOn());
        System.out.println(modernCoffeeTable.drink());
    }
}
