public class Bank {
    public static void main(String[] args) {
        int counter = 1;
        System.out.println(Konto.s_anzahlKonto);
        Konto.s_anzahlKonto = 1001;
        Konto max = new Konto("Max Mustermann");
        //max.setInhaber("Max Mustermann");
        max.print();
        //max.s_anzahlKonto = 4;

        Konto susi = new Konto("Susi Sorglos");
        Konto john = new Konto("John Doe");

        max.aufbuchen(1000);
        max.print();

        max.abbuchen(800);
        max.print();

        max.abbuchen(300);
        max.print();
        susi.print();
        john.print();
    }
}
