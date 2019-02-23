package SDA;

public class Room {
    private int numerPokoju;
    private int iloscOsob;
    private boolean zLazienka;
    private boolean dostepnosc;

    public Room(int numerPokoju, int iloscOsob, boolean zLazienka, boolean dostepnosc) {
        this.numerPokoju = numerPokoju;
        this.iloscOsob = iloscOsob;
        this.zLazienka = zLazienka;
        this.dostepnosc = dostepnosc;
    }
}
