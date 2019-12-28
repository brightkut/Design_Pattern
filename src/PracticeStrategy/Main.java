package PracticeStrategy;

public class Main {

    public static void main(String[] args) {
        Plane p = new Plane();
        Ship s = new Ship();

        Station st = new Station();

        st.trip(p);
        st.trip(s);

    }
}
