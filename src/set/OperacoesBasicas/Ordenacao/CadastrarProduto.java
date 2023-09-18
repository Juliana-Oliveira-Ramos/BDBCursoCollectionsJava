package set.OperacoesBasicas.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastrarProduto {
    private Set<Produto> produtoSet;

    public CadastrarProduto() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod,nome,preco,quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!produtoSet.isEmpty()) {
            produtosPorPreco.addAll(produtoSet);
            return produtosPorPreco;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }


    public static void main(String[] args) {

        CadastrarProduto cadastroProduto = new CadastrarProduto();

        cadastroProduto.adicionarProduto(1L, "Produto 5 ", 15d, 5);
        cadastroProduto.adicionarProduto(2L, "Produto 0 ", 20d, 10);
        cadastroProduto.adicionarProduto(1L, "Produto 3 ", 10d, 2);
        cadastroProduto.adicionarProduto(9L, "Produto 9 ", 2d, 2);
        cadastroProduto.adicionarProduto(1L, "Produto 2 ", 16d, 1);
        cadastroProduto.adicionarProduto(3L, "Produto 4 ", 25d, 6);

        System.out.println(cadastroProduto.produtoSet);
        System.out.println(cadastroProduto.exibirProdutosPorNome());
        System.out.println(cadastroProduto.exibirProdutosPorPreco());
    }
}
