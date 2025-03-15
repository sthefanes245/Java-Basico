package programacao.orientada.objetos;

public abstract class Produto implements Comparable<Produto>{
	protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Método abstrato que as subclasses devem implementar
    public abstract String getDescricao();
}
