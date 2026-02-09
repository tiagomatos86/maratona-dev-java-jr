package br.com.tiago.maratonadevjr.arquitetura.times.classes;

import java.util.ArrayList;
import java.util.List;

public class TimesMemoryRepository implements TimesRepository{
    List<TimeEntity> times = new ArrayList<>();

    @Override
    public void save(TimeEntity time) {
        times.add(time);
    }

    @Override
    public TimeEntity findById(int id) {
        for(TimeEntity time : times) {
            if(time.getId() == id) return time;
        }
        return null;
    }

    @Override
    public List<TimeEntity> findAllTeams() {
        return new ArrayList<>(times);
    }
}