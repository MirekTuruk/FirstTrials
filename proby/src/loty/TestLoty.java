package loty;

import java.util.Date;

public class TestLoty {
    public static void main(String[] args) {

        Loty[] flights = new Loty[3];

        flights[0] = new Loty("Warszawa", "Berlin",
                new Date(119 - 1 - 1), new Date(119 - 1 - 1),
                10, 250);
        flights[1] = new Loty("Warszawa", "Londyn",
                new Date(2019 - 06 - 15), new Date(2019 - 06 - 15),
                10, 250);
        flights[2] = new Loty("Warszawa", "Paryż",
                new Date(2019 - 06 - 15), new Date(2019 - 06 - 15),
                10, 250);
        for (Loty loty : flights){
            loty.show();
        }
    }
}
