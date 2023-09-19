package map.OperacoesBasicas.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    //atributos
    private Map<LocalDate, Evento> eventosMap;
    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

        public void exibirAgenda(){
            Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
            System.out.println(eventosTreeMap);
        }


        public void obterProximoEvento(){
        //é o evento mais recente,
            /*Set<LocalDate> dataSet = eventosMap.keySet();//retorna uma set com toas as keys
            Collection<Evento> values = eventosMap.values();//retorna uma coleçao com todos os valores
            */
            //eventosMap.get();

            //como pegar a data atual em java ?
            LocalDate dataAtual = LocalDate.now();
            LocalDate proximaData = null;
            Evento proximoEvento   = null;

            //navegar dentro do map e saber se o evento e na proxima data atual ou depois da data atual
            Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
            for (Map.Entry<LocalDate, Evento> entry: eventosMap.entrySet()) {//retorna um set com objetos map que apontam os valores dentro
                if (entry.getKey().isEqual(dataAtual)||entry.getKey().isAfter(dataAtual)){
                    proximaData = entry.getKey();
                    proximoEvento = entry.getValue();
                    System.out.println("O Proximo Evento:" + proximoEvento + " acontecera na data" + proximaData);
                    break;
                }


            }



        }


    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atracao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 19), "Evento 4", "Atracao 4");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 20), "Evento 5", "Atracao 5");



        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();

    }
}
