/*Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.*/
package javaBasico.lista.aula15;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite F ou M, digite a letra maiuscula");
		String letra = scan.next();
		
		if(letra.equalsIgnoreCase("F")) {
			System.out.println("Feminino");

		}else if(letra.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		}else{
			System.out.println("Sexo Inválido");
		}
	}
}
