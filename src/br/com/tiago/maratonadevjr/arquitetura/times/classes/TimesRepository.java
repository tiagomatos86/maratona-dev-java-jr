package br.com.tiago.maratonadevjr.arquitetura.times.classes;

import java.util.List;
import java.util.UUID;

public interface TimesRepository {
    public void save(TimeEntity time);
    public TimeEntity findById(UUID id);
    public List<TimeEntity> findAllTeams();
    public List<TimeEntity> findByCountry(String pais);
}