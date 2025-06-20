package Esercizio2;

public class DipendentePartTime extends Dipendente {
    private int oreSettimanali;
    private double pagaOraria;

    public DipendentePartTime(String matricola, String dipartimento, int oreSettimanali, double pagaOraria) {
        super(matricola, 0, dipartimento); // stipendioBase non usato per part-time
        this.oreSettimanali = oreSettimanali;
        this.pagaOraria = pagaOraria;
    }

    @Override
    public double calculateSalary() {
        return oreSettimanali * pagaOraria * 4 * 12;
    }

    @Override
    public void checkIn() {
        System.out.println("Dipendente part-time " + getMatricola() + " ha iniziato il turno.");
    }
