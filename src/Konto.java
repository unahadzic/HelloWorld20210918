public class Konto {
    private String Kontoinhaber;
    private double Kontostand;
    private int idNumber; // 1...999999
    public static int s_anzahlKonto = 10;


    public Konto(String Kontoinhaber){
        //Konstruktor
        this.Kontoinhaber = Kontoinhaber;
        Kontostand = 0;
        this.idNumber = ++s_anzahlKonto;
    }

    public void setInhaber(String Kontoinhaber) {
        this.Kontoinhaber = Kontoinhaber;
        Kontostand = 0;
    }

    public void aufbuchen(double betrag) {
        if (betrag > 0) {
            Kontostand = Kontostand + betrag;
        } else {
            System.out.println("Nur Werte > 0 sind erlaubt!");
        }

    }

    public void abbuchen(double betrag) {
        if (Kontostand >= betrag) {
            Kontostand -= betrag;
        } else {
            System.out.println("Nicht genügend Geld am Konto");
        }
    }

    public void print() {
        System.out.println(idNumber + ": Kontoinhaber: " + Kontoinhaber + ", Kontostand: " + Kontostand);
    }


}

