package br.com.tiago.maratonadevjr.arquitetura.times.classes;

import java.util.List;

public interface TimesRepository {
    public void save(TimeEntity time);
    public TimeEntity findById(int id);
    public List<TimeEntity> findAllTeams();
}