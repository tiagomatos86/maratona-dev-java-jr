package br.com.tiago.maratonadevjr.arquitetura.times.classes;

public class TimeEntity {
     private static int contId = 0;
    private int id;
    private String nome;
    private String pais;
    private String campeonatoNacional;

    public TimeEntity(String nome, String pais, String campeonatoNacional) {
        this.id = ++contId;
        this.nome = nome;
        this.pais = pais;
        this.campeonatoNacional = campeonatoNacional;
    }

     public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCampeonatoNacional() {
        return campeonatoNacional;
    }

    public void setCampeonatoNacional(String campeonatoNacional) {
        this.campeonatoNacional = campeonatoNacional;
    }

    @Override
    public String toString() {
        return "Time [ID=" + id + ", nome=" + nome + ", pais=" + pais + ", campeonatoNacional=" + campeonatoNacional + "]";
    }
}