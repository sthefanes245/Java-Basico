// Faça um Programa que peça as 4 notas bimestrais e mostre a média.

package javaBasico.lista.aula13;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe as suas quatro notas: ");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		double n4 = scan.nextDouble();
		
		double media = (n1 + n2 + n3 + n4) / 4; 
		
		System.out.println("A sua media é: " + media);

	}

}
