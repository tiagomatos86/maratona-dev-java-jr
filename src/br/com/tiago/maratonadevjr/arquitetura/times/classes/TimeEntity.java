package br.com.tiago.maratonadevjr.arquitetura.times.classes;

import java.util.Objects;

public class TimeEntity {
    private static int contId = 0;
    private int id;
    private TimeIdentity timeIdentity;

    public TimeEntity(String nome, String pais, String campeonatoNacional) {
        this.id = ++contId;
        this.timeIdentity = new TimeIdentity(nome, pais, campeonatoNacional);
    }

     public int getId() {
        return id;
    }

    public String getNome() {
        return timeIdentity.getNome();
    }

    public String getPais() {
        return timeIdentity.getPais();
    }

    public String getCampeonatoNacional() {
        return timeIdentity.getCampeonatoNacional();
    }

    public void updateTeamInfo(String nome, String pais, String campeonatoNacional) {
        TimeIdentity newIdentity = new TimeIdentity(nome, pais, campeonatoNacional);
        this.timeIdentity = newIdentity;
    }

    @Override
    public String toString() {
        return "Time [ID=" + id + ", nome=" + timeIdentity.getNome() + ", pais=" + timeIdentity.getPais() + ", campeonatoNacional=" + timeIdentity.getCampeonatoNacional() + "]";
    }

    @Override
    public int hashCode() {
          return Objects.hash(id); 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof TimeEntity)) return false;
        TimeEntity that = (TimeEntity) obj;
        return Objects.equals(id, that.id);
    } 
}