package javabanco.entidade;

import java.util.ArrayList;

public class ContaCorrente {
	private float saldo;
	private ArrayList operacoes;
	
	public float getSaldo() {
		return saldo;
	}
	
	public float debito(float valor){
		saldo -= valor;
		return saldo;
		
	}
	
	public float credito(float valor){
		saldo += valor;
		return saldo;
	}
}
