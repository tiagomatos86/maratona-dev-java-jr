package br.com.tiago.maratonadevjr.arquitetura.times.classes;

import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class TimesService {
    private final TimesRepository tr;

    public TimesService(TimesRepository tr) {
        this.tr = tr;
    }

    public void cadastraTime(TimeEntity time) {
        Set<TimeEntity> times = new HashSet<>(tr.findAllTeams()); 
        if(times.contains(time)) throw new IllegalStateException("Time já existe");
        tr.save(time);
    }

    public TimeEntity buscarTimePorId(int id) {
        TimeEntity time = tr.findById(id);
        if(time == null) throw new NoSuchElementException ("Time não encontrado.");
        return time;
    }

    public List<TimeEntity> retornaTodosTimes() {
        return tr.findAllTeams();
    }
}