package StrategyPattern;

public class Plane implements  CalculateTravel {

    private String planeName;
    private  int seat ;
    private  int ticketPrice;
    private double fuel;
    private  double rateFuel;

    public Plane(String planeName, int seat, int ticketPrice, double fuel, double rateFuel) {
        this.planeName = planeName;
        this.seat = seat;
        this.ticketPrice = ticketPrice;
        this.fuel = fuel;
        this.rateFuel = rateFuel;
    }

    @Override
    public String travel() {
        double calculate_price = (seat*ticketPrice)+(fuel*rateFuel);
        return "This price of plane is : "+calculate_price ;
    }
}
