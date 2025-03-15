package programacao.orientada.objetos;

public class Teste {

	public static void main(String[] args) {

		System.out.println("Informações de Alimento: ");
		
		Sistema a = new Alimento(12,"queijo", 8.99, 5);
		
		a.imprimirDetalhes();
		
		System.out.println("Informações de Eletronico: ");
		
		Sistema eletro = new Eletronico("Sansung", "A12", "Celular", 1800, 20);
		eletro.imprimirDetalhes();

	}

}
