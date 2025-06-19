package Esercizio2;

public class Dirigente extends Dipendente {
    private double indennita;

    public Dirigente(String matricola, double stipendioBase, String dipartimento, double indennita) {
        super(matricola, stipendioBase, dipartimento);
        this.indennita = indennita;
    }

    @Override
    public double calculateSalary() {
        return (getStipendioBase() + indennita) * 12;
    }
}