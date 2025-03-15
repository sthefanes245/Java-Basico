package javaBasico.lista.aula27;

import java.util.Scanner;

public class contaCorrente {
	int numero;
	double saldo;
	boolean especial;
	double limiteEspecial;

	
	boolean realizarSaque(double quantiaASacar) {
		if(saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		} else {
			if(especial) {
				double limite = limiteEspecial + saldo;
				if (limite >=quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		
	}
	
	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	void consultarSaldo() {
		System.out.println("Saldo atual da sua conta: R$" + saldo);
	}
	
	boolean verificarUsoCheque() {
		return saldo < 0;
	}
}
