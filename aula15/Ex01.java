//Faça um Programa que peça dois números e imprima o maior deles.
package javaBasico.lista.aula15;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int numero1 = scan.nextInt();
		System.out.println("Informe outro numero: ");
		int numero2 = scan.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O maior numero é: " +numero1);
		}
		else {
			System.out.println("O maior numero é: " +numero2);
		}
	}

}
