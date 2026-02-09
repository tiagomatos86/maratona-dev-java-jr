package br.com.tiago.maratonadevjr.arquitetura.times;

import br.com.tiago.maratonadevjr.arquitetura.times.classes.TimeEntity;
import br.com.tiago.maratonadevjr.arquitetura.times.classes.TimesMemoryRepository;
import br.com.tiago.maratonadevjr.arquitetura.times.classes.TimesService;

public class App {
    public static void main(String[] args) {
        TimesMemoryRepository timesMemory = new TimesMemoryRepository();
        TimesService ts = new TimesService(timesMemory);

        TimeEntity time1 = new TimeEntity("São Paulo", "Brasil", "Campeonato Brasileiro");
        TimeEntity time2 = new TimeEntity("Fortaleza", "Brasil", "Campeonato Brasileiro - Série B");
        TimeEntity time3 = new TimeEntity("Barcelona", "Espanha", "La Liga");
        TimeEntity time4 = new TimeEntity("Liverpool", "Inglaterra", "Premiere League");
        TimeEntity time5 = new TimeEntity("São Paulo", "Brasil", "Campeonato Brasileiro");

        ts.cadastraTime(time1);
        ts.cadastraTime(time2);
        ts.cadastraTime(time3);
        ts.cadastraTime(time4);
        // ts.cadastraTime(time5);

        System.out.println(ts.buscarTimePorId(1));
        System.out.println(ts.buscarTimePorId(2));
        System.out.println(ts.buscarTimePorId(3));
        System.out.println(ts.buscarTimePorId(4));
        // System.out.println(ts.buscarTimePorId(5));

        System.out.println(ts.retornaTodosTimes());
    }
}