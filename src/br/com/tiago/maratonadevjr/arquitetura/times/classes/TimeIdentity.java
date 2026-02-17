package br.com.tiago.maratonadevjr.arquitetura.times.classes;

import java.util.Objects;

public class TimeIdentity {
    private final String nome;
    private final String pais;
    private final String campeonatoNacional;


    public TimeIdentity(String nome, String pais, String campeonatoNacional) {
        this.nome = nome;
        this.pais = pais;
        this.campeonatoNacional = campeonatoNacional;
    }

    public String getNome() {
        return nome;
    }
    
    public String getPais() {
        return pais;
    }
   
    public String getCampeonatoNacional() {
        return campeonatoNacional;
    }
   
    @Override
    public String toString() {
        return "TimeIdentity [nome=" + nome + ", pais=" + pais + ", campeonatoNacional=" + campeonatoNacional + "]";
    }

    @Override
    public int hashCode() {
          return Objects.hash(nome, pais, campeonatoNacional); 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof TimeIdentity)) return false;
        TimeIdentity that = (TimeIdentity) obj;
        return Objects.equals(nome, that.nome) &&
            Objects.equals(pais, that.pais) &&
            Objects.equals(campeonatoNacional, that.campeonatoNacional);
    }

    

}