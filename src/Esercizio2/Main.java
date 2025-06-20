package Esercizio2;

public class Main {
    public static void main(String[] args) {

        Dipendente[] dipendenti = new Dipendente[4];
        dipendenti[0] = new DipendenteFullTime("A123", 2000.0, "PRODUZIONE");
        dipendenti[1] = new DipendentePartTime("B456", "VENDITE", 20, 12.5);
        dipendenti[2] = new Dirigente("C789", 3000.0, "DIREZIONE", 1000.0);
        dipendenti[3] = new DipendenteFullTime("D321", 2500.0, "AMMINISTRAZIONE");

        Interfaccia[] presenze = new Interfaccia[6];
        presenze[0] = dipendenti[0];
        presenze[1] = dipendenti[1];
        presenze[2] = dipendenti[2];
        presenze[3] = dipendenti[3];
        presenze[4] = new Volontario("Luca", 24, "Studente Stage");
        presenze[5] = new Volontario("Sofia", 21, "Volontaria Africa");

        for (int i = 0; i < dipendenti.length; i++) {
            Dipendente d = dipendenti[i];
            System.out.println("Stipendio annuale di " + d.getMatricola() + ": " + d.calculateSalary() + " euro");
        }

        System.out.println("Check-in di oggi:\n");
        for (Interfaccia persona : presenze) {
            persona.checkIn();
        }
    }
}