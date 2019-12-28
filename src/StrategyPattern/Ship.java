package StrategyPattern;

public class Ship implements  CalculateTravel{
    private String shipName;
    private int price ;
    private  int passenger;
    private  int rate;

    public Ship(String shipName, int price, int passenger, int rate) {
        this.shipName = shipName;
        this.price = price;
        this.passenger = passenger;
        this.rate = rate;
    }

    @Override
    public String travel() {
        return "This price o ship is : " + this.price*this.passenger*rate;
    }

}
