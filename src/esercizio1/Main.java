package esercizio1;

public class Main {
    public static void main(String[] args) {
        Dipendente d1 = new Dipendente("A123", 1800.50, "PRODUZIONE");
        Dipendente d2 = new Dipendente("B456", 2200.00, "AMMINISTRAZIONE");
        Dipendente d3 = new Dipendente("C789", 1950.75, "VENDITE");

        Dipendente[] dipendenti = {d1, d2, d3};

        System.out.println("📋 Elenco iniziale dipendenti:");
        for (Dipendente d : dipendenti) {
            System.out.println("Matricola: " + d.getMatricola() + ", Dipartimento: " + d.getDipartimento());
        }

        d2.setDipartimento("VENDITE");

        System.out.println("\n🔄 Dopo trasferimento del dipendente B456:");
        for (Dipendente d : dipendenti) {
            System.out.println("Matricola: " + d.getMatricola() + ", Dipartimento: " + d.getDipartimento());
        }
    }
}






