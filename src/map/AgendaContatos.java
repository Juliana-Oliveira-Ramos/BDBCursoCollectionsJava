package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        //por boas praticas o recomendado é verificar se os map esta vazio
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }

    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Camila",123456);
        agendaContatos.adicionarContato("Camila",5566);
        agendaContatos.adicionarContato("Camila Dio",556677);
        agendaContatos.adicionarContato("Camila Calvante",654321);
        agendaContatos.adicionarContato("Maria Silva",1111111);
        agendaContatos.adicionarContato("Camila",44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();

        System.out.println("O numero e:" + agendaContatos.pesquisarPorNome("Camila Dio"));

    }
}
