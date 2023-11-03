package br.com.bytebank.libs;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		Conta c= new ContaCorrente(222,223);
		
		c.deposita(200);
		
		System.out.println("Saldo: " +c.getSaldo());

	}

}
