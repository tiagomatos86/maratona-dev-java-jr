package br.com.tiago.maratonadevjr.arquitetura.times.classes;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

public class TimesService {
    private final TimesRepository tr;

    public TimesService(TimesRepository tr) {
        this.tr = tr;
    }

    public void cadastraTime(TimeEntity time) {
        if (verificaIdentidade(time)) {
            throw new IllegalStateException("Time com essa identidade já existe");
        }
        tr.save(time);
    }

    private boolean verificaIdentidade(TimeEntity time) {
        return tr.findAllTeams().stream()
                .anyMatch(timeExistente -> timeExistente.getIdentity().equals(time.getIdentity()));
    }

    public TimeEntity buscarTimePorId(UUID id) {
        TimeEntity time = tr.findById(id);
        if (time == null)
            throw new NoSuchElementException("Time não encontrado.");
        return time;
    }

    public List<TimeEntity> retornaTodosTimes() {
        return tr.findAllTeams();
    }
}