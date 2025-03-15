/*package model;

import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

public class Testa {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = null;
		
		System.out.println("Cadastro de produtos");
		System.out.println("Escolha qual tipo de produto deseja cadastrar:");
		System.out.println("1-Produto Eletrônico");
		System.out.println("2-Produto Alimento");
		int op = scan.nextInt();
		 scan.nextLine(); // Consumir a quebra de linha
		
		if(op == 1) {
			produto = new ProdutoEletronico("", 0, 0, "", "");
		}
		else {
			produto = new ProdutoAlimento("", op, op, null);
		}
		
		
		
		produto.cadastrar(scan);
		produtoDAO.adicionarProduto(produto);
		
		System.out.println("Produto cadastrado com sucesso!");
		produto.imprimir();
		
		System.out.print("\nDeseja pesquisar um produto pelo nome? (s/n): ");
        String resposta = scan.nextLine();
        if (resposta.equalsIgnoreCase("s")) {
            System.out.print("Digite o nome do produto a ser pesquisado: ");
            String nomePesquisa = scan.nextLine();
            List<Produto> resultados = produtoDAO.pesquisarPorNome(nomePesquisa);
            if (resultados.isEmpty()) {
                System.out.println("Produto não encontrado!");
            } else {
                System.out.println("Produtos encontrados:");
                for (Produto p : resultados) {
                    p.imprimir();
                }
            }
        }

        scan.close();
	}

}
*/