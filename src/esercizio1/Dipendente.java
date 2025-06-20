package esercizio1;

public class Dipendente {
    private String matricola;
    private double stipendio;
    private String dipartimento; // PRODUZIONE, AMMINISTRAZIONE, VENDITE

    public Dipendente(String matricola, double stipendio, String dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(String nuovoDipartimento) {
        this.dipartimento = nuovoDipartimento;
    }

}