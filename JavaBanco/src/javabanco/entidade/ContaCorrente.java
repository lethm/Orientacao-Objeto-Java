package javabanco.entidade;

import java.util.ArrayList;
import java.util.Date;

public class ContaCorrente {
	private String titular;

	private int numero;
	private float saldo;
	private ArrayList<Operacao> operacoes = new ArrayList<Operacao>();
	
	public float getSaldo() {
	return saldo;
	}
	
	public float debito(float valor){
		saldo -= valor;
		Operacao op = new Operacao(valor, "DEBITO" , new Date());
		operacoes.add(op);
		return saldo;
		
	}
	
	public float credito(float valor){
		saldo += valor;
		Operacao op = new Operacao(valor, "CREDITO" , new Date());
		operacoes.add(op);
		return saldo;
	}
	
	public ArrayList<Operacao> extrato(){
		return operacoes;
	}

	public float transferencial(float valor, ContaCorrente ccDestino) {
		this.debito(valor);
		ccDestino.credito(valor);
		return saldo;
		
	}
	
	public ContaCorrente(int numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	}

	public String getTitular(){
		return titular;
	}
	
	public int getNumero(){
		return numero;
	}
}

