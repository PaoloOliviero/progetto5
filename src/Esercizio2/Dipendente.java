package Esercizio2;

public abstract class Dipendente {
    private String matricola;
    private double stipendioBase;
    private String dipartimento;

    public Dipendente(String matricola, double stipendioBase, String dipartimento) {
        this.matricola = matricola;
        this.stipendioBase = stipendioBase;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(String nuovoDipartimento) {
        this.dipartimento = nuovoDipartimento;
    }

    // 👇 Metodo astratto da implementare nelle sottoclassi
    public abstract double calculateSalary();
}