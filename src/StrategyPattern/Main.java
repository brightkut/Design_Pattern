package StrategyPattern;

public class Main {
    public static void main(String[] args) {

        Plane plane = new Plane("brightAirline", 5, 20, 100, 2.5);
        Ship ship = new Ship("Brightboat",100,10,2);
        Travel travel = new Travel();

        System.out.println(travel.getPriceTravel(plane));
        System.out.println(travel.getPriceTravel(ship));


    }
}
