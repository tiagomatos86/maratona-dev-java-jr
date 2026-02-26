package br.com.tiago.maratonadevjr.arquitetura.times.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TimesMemoryRepository implements TimesRepository{
    private Map<UUID, TimeEntity> times = new HashMap<>();

    @Override
    public void save(TimeEntity time) {
        times.put(time.getId(), time);
    }

    @Override
    public TimeEntity findById(UUID id) {
        return times.get(id);
    }

    @Override
    public List<TimeEntity> findAllTeams() {
        return new ArrayList<>(times.values());
    }
}