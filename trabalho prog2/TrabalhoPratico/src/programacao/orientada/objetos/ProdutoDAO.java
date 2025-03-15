package programacao.orientada.objetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProdutoDAO {
	private List<Produto> produtos;
	
	public ProdutoDAO() {
		this.produtos = new ArrayList<>();
	}
	
	public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> listarProdutos(boolean ordenado) {
        if (ordenado) {
            Collections.sort(produtos);
        }
        return produtos;
    }

    public Produto buscarProduto(String nome) {
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public void excluirProduto(Produto produto) {
        produtos.remove(produto);
    }
}
