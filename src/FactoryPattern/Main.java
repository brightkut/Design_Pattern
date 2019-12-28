package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        Logistics roadLogistics =new RoadLogistics();
        Logistics seaLogistics = new SeaLogistics();

        System.out.println(roadLogistics.planDelivery().deliver());
        System.out.println(seaLogistics.planDelivery().deliver());




    }
}
