package br.com.tiago.maratonadevjr.arquitetura.times.classes;

import java.util.List;
import java.util.NoSuchElementException;

public class TimesService {
    private final TimesRepository tr;

    public TimesService(TimesRepository tr) {
        this.tr = tr;
    }

    public void cadastraTime(TimeEntity time) {
        List<TimeEntity> times = tr.findAllTeams(); 
        for(TimeEntity timeDaLista : times) {
            if(time.getNome().equals(timeDaLista.getNome()) && time.getPais().equals(timeDaLista.getPais()) && time.getCampeonatoNacional().equals(timeDaLista.getCampeonatoNacional()) ) {
                throw new IllegalStateException ("Time já existe");
            }
        }
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