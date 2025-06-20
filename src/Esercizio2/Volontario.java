package Esercizio2;

public class Volontario implements Interfaccia {
    private String nome;
    private int eta;
    private String curriculum;

    public Volontario(String nome, int eta, String curriculum) {
        this.nome = nome;
        this.eta = eta;
        this.curriculum = curriculum;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void checkIn() {
        System.out.println("🙋 Volontario " + nome + " ha iniziato il suo servizio.");
    }
}