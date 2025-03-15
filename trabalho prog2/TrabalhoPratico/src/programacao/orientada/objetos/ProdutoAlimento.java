package programacao.orientada.objetos;

public class ProdutoAlimento {
	private String dataValidade;

    public ProdutoAlimento(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    @Override
    public String getDescricao() {
        return "Alimento - Nome: " + nome + ", Validade: " + dataValidade + ", Preço: " + preco;
    }
}
