package set.OperacoesBasicas.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome,numero));

    }

    //exibir
    public void exibirContato(){
        System.out.println(contatoSet);
    }
    //pesquisar
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c: contatoSet) {
            if (c.getNome().startsWith(nome)){//utilizando string
                contatoPorNome.add(c);
            }
            
        }
        return contatoPorNome;
    }

    //atualizar
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c: contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
               break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();;

        agendaContatos.adicionarContato("Camila",123456);
        agendaContatos.adicionarContato("Camila",0);
        agendaContatos.adicionarContato("Camila Calvacavante",111111);
        agendaContatos.adicionarContato("Camila 010",654321);
        agendaContatos.adicionarContato("Camila Dio",123456);
        agendaContatos.adicionarContato("Maria Silva",123456);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato Atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 55555555));

        agendaContatos.exibirContato();
    }
}
