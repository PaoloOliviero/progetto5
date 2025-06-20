package Esercizio2;

public class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(String matricola, double stipendioBase, String dipartimento) {
        super(matricola, stipendioBase, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendioBase() * 12;
    }

    @Override
    public void checkIn() {
        System.out.println(" Dipendente full-time " + getMatricola() + " ha timbrato alle 10.");
    }
}
