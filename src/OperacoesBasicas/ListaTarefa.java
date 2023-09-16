package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    //criar um construtor para chamar a lista vazia
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    //adicionar uma tarefa dentro da array
    public void adicionarTarefa(String descricao){
    tarefaList.add(new Tarefa(descricao));
   }

   //remover uma tarefa
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }

        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    //obter numero de tarefas
        public int obterNumeroTotalTarefas(){
        return tarefaList.size();
        }

        //obter descriçoes tarefas
        public void obterDescricoesTarefas(){
            System.out.println(tarefaList);
        }
        //realizar os testes

        public static void main(String[] args){
        //adicionar tarefa na lista;
        ListaTarefa listaTarefa = new ListaTarefa();
            System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

            //adicionar uma tarefa
            listaTarefa.adicionarTarefa("Tarefa 1");
            listaTarefa.adicionarTarefa("Tarefa 2");
            System.out.println(" O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());


            //remover tarefas
            listaTarefa.removerTarefa("Tarefa 1");
            System.out.println(" O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

            //obter lista tarefas
            listaTarefa.obterDescricoesTarefas();
        }

}
