package loty;

import java.util.Date;


public class Loty {
    String from;
    String where;
    Date arrival;
    Date departure;
    int firstClassPlace;
    int secondClassPlace;

    public Loty(String from, String where, Date arrival, Date departure, int firstClassPlace, int secondClassPlace) {
        this.from = from;
        this.where = where;
        this.arrival = arrival;
        this.departure = departure;
        this.firstClassPlace = firstClassPlace;
        this.secondClassPlace = secondClassPlace;
    }
    void show(){
        System.out.println(" Skąd: " + from + " Dokąd: " + where +
                " Przylot: " + arrival + " Odlot: " + departure +
                " Miejsca w klasie pierwszej: " + firstClassPlace +
                " Miejsca w klasie drugiej: " + secondClassPlace);
    }
}
