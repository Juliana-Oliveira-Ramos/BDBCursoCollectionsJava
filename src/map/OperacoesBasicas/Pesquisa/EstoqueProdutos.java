package map.OperacoesBasicas.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributos
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    //adicionar Produto
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    //exibir todos os produtos
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    //calcular total valor do estoque
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
        //obter produto mais caro
        public Produto obterProdutoMaisCaro() {

            Produto produtoMaisCaro = null;
            //variavel para armazenar o maior valor
            double maiorPreco = Double.MIN_VALUE; //pega o menor valor double
            if (!estoqueProdutosMap.isEmpty()) {
                for (Produto p : estoqueProdutosMap.values()) {
                    if (p.getPreco() > maiorPreco){
                        produtoMaisCaro = p;
                    }
                }
            }
            return produtoMaisCaro;
        }

    public static void main(String[] args) {

        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto A ", 10, 5.0);
        estoque.adicionarProduto(2L, "Produto B ", 5, 10.0);
        estoque.adicionarProduto(3L, "Produto C ", 2, 15.0);
        estoque.adicionarProduto(8L, "Produto D ", 2, 20.0);

        estoque.exibirProdutos();

        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        System.out.println("Valor total do estoque: R$" +estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
    }

}
