package br.com.tiago.maratonadevjr.arquitetura.times.classes;

import java.util.Objects;

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

    @Override
    public int hashCode() {
          return Objects.hash(nome, pais, campeonatoNacional); 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof TimeEntity)) return false;
        TimeEntity that = (TimeEntity) obj;
        return Objects.equals(nome, that.nome) &&
            Objects.equals(pais, that.pais) &&
            Objects.equals(campeonatoNacional, that.campeonatoNacional);
    }

    
}