package br.com.tiago.maratonadevjr.arquitetura.times.classes;

import java.util.UUID;

public class TimeEntity {
    private final UUID id;
    private TimeIdentity timeIdentity;

    public TimeEntity(String nome, String pais, String campeonatoNacional) {
        this.id = UUID.randomUUID();
        this.timeIdentity = new TimeIdentity(nome, pais, campeonatoNacional);
    }

    public UUID getId() {
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

    public TimeIdentity getIdentity() {
        return timeIdentity;
    }

    public void updateTeamInfo(String nome, String pais, String campeonatoNacional) {
        TimeIdentity newIdentity = new TimeIdentity(nome, pais, campeonatoNacional);
        this.timeIdentity = newIdentity;
    }

    @Override
    public String toString() {
        return "Time [ID=" + id + ", nome=" + timeIdentity.getNome() + ", pais=" + timeIdentity.getPais()
                + ", campeonatoNacional=" + timeIdentity.getCampeonatoNacional() + "]";
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof TimeEntity))
            return false;
        TimeEntity that = (TimeEntity) obj;
        return id.equals(that.id);
    }
}