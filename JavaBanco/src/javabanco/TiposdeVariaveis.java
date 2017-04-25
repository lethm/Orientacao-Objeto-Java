package javabanco;

import java.util.ArrayList;
import java.util.Date;

import javabanco.entidade.ContaCorrente;
import javabanco.entidade.Operacao;

public class TiposdeVariaveis {

	public static void main(String[] args) {
		int umNumero = 42;
		int outroNumero = 3;
		int produto = 0;
		
		Integer umNumeroObj = new Integer(42);
		
		System.out.println("umNumero: " + umNumero);

	
		produto = umNumero * outroNumero;
		
		System.out.println("produto = " + produto);
		
		System.out.println("umNumeroObj: " + umNumeroObj);
		
		ArrayList<Integer> contas = new ArrayList<Integer>();
		
		
		
		
		System.out.println("contas: " + contas);
		
		ContaCorrente cc1 = new ContaCorrente(6789, "Paula");
		System.out.println("cc1.getSaldo():" + cc1.getSaldo());
		
		cc1.credito(umNumero);
		
		System.out.println("cc1.getSaldo() após crédito: " + cc1.getSaldo());
		
		System.out.println("cc1.getSaldo() após débito: " + cc1.getSaldo());
		
		System.out.println("cc1.extrato():" + cc1.extrato());
		
		Operacao o1 = new Operacao(500, "CREDITO", new Date());
		Operacao o2 = new Operacao(300, "DEBITO", new Date());
		
		System.out.println("o1: " + o1.getValor() + ", " + o1.getTipoOperacao() + ", " + o1.getDataHora() );
		System.out.println("o2: " + o2.getValor() + ", " + o2.getTipoOperacao() + ", " + o2.getDataHora() );
		
		System.out.println("o1: " + o1.toString());
		System.out.println("o2: " + o2.toString());
		
		ContaCorrente cc2= new ContaCorrente(12345, "Marcos");
		cc1.transferencial(10, cc2);
		System.out.println("cc1.extrato():" + cc1.extrato());
		System.out.println("cc2.extrato():" + cc2.extrato());
		
		System.out.println("Nome do Titular cc1: " + cc1.getTitular());
		System.out.println("Nome do Titular cc2: " + cc2.getTitular());
		
		
		
	}

}
