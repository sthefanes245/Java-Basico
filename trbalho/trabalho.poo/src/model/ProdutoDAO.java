package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//slide parte 4.8, slide 47 fala sobre array list

public class ProdutoDAO {
	//List<>, armazena os produtos cadastrads em uma lista 
	private List<Produto> produtos;
	
	public ProdutoDAO() {
		this.produtos = new ArrayList<>();
		
	}
	
	//Adicona um produto a lista 
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	//Remove um produto da lista
	public void removerProduto(Produto produto) {
		produtos.remove(produto);
	}
	
	//Pesquisa por nome
	public List<Produto> pesquisarPorNome(String nome) {
        List<Produto> produtosEncontrados = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getNome().toLowerCase().contains(nome.toLowerCase())) {
                produtosEncontrados.add(produto);
            }
        }
        return produtosEncontrados;
    }

    // Listar os produtos - ordenados ou não
    public List<Produto> listarProdutos(boolean ordenar) {
        if (ordenar) {
            Collections.sort(produtos);
        }
        return produtos; // Retorna uma cópia para evitar modificações externas
    }
}
