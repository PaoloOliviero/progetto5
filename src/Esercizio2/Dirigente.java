package Esercizio2;

public class Dirigente extends Dipendente {
    private double indennitaMensile;

    public Dirigente(String matricola, double stipendioBase, String dipartimento, double indennitaMensile) {
        super(matricola, stipendioBase, dipartimento);
        this.indennitaMensile = indennitaMensile;
    }

    @Override
    public double calculateSalary() {
        return (getStipendioBase() + indennitaMensile) * 12;
    }

    @Override
    public void checkIn() {
        System.out.println(" Dirigente " + getMatricola() + " ha iniziato il turno.");
    }
