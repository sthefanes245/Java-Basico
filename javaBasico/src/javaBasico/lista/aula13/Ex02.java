//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]. 25
package javaBasico.lista.aula13;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int numero = scan.nextInt();
		
		System.out.println("O numero informado foi: " + numero);

	}

}
