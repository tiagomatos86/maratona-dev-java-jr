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

        System.out.println(ts.buscarTimePorId(time1.getId()));
        System.out.println(ts.buscarTimePorId(time2.getId()));
        System.out.println(ts.buscarTimePorId(time3.getId()));
        System.out.println(ts.buscarTimePorId(time4.getId()));
        // System.out.println(ts.buscarTimePorId(time5.getId()));

        System.out.println("\n------------------------TODOS TIMES-----------------------\n" + ts.retornaTodosTimes());

        System.out.println();

        System.out.println("\n------------------------TIMES DO PAÍS-----------------------\n" + ts.buscarTimesPorPais("Brasil"));
        System.out.println("\n------------------------TIMES DO PAÍS-----------------------\n" + ts.buscarTimesPorPais("espanha"));
        System.out.println("\n------------------------TIMES DO PAÍS-----------------------\n" + ts.buscarTimesPorPais("inglaTERRA "));
        System.out.println("\n------------------------TIMES DO PAÍS-----------------------\n" + ts.buscarTimesPorPais("Colômbia"));
        // System.out.println("\n------------------------TIMES DO PAÍS-----------------------\n" + ts.buscarTimesPorPais(""));
    }
}