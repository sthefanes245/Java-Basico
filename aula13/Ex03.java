//Faça um Programa que peça dois números e imprima a soma.

package javaBasico.lista.aula13;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int numero1 = scan.nextInt();
		System.out.println("Informe outro numero: ");
		int numero2 = scan.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("A soma de " + numero1 + " + " + numero2 + " é de: " + soma);

	}

}

