package programacao.orientada.objetos;

public class ProdutoEletronico {
	private String marca;

    public ProdutoEletronico(String nome, double preco, String marca) {
        super(nome, preco);
        this.marca = marca;
    }

    @Override
    public String getDescricao() {
        return "Eletrônico - Nome: " + nome + ", Marca: " + marca + ", Preço: " + preco;
    }
}
