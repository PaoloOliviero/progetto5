package Esercizio2;
public class Main {
    public static void main(String[] args) {
        Dipendente[] dipendenti = new Dipendente[4];

        dipendenti[0] = new DipendenteFullTime("A123", 2000.0, "PRODUZIONE", 1500.0);
        dipendenti[1] = new DipendentePartTime("B456", "VENDITE", 20, 12.5);
        dipendenti[2] = new Dirigente("C789", 3000.0, "DIREZIONE", 1000.0);
        dipendenti[3] = new DipendenteFullTime("D321", 2500.0, "AMMINISTRAZIONE", 1800.0);

    }
}