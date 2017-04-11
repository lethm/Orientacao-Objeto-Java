package javabanco;

import java.util.ArrayList;

import javabanco.entidade.ContaCorrente;

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
		
		ContaCorrente cc1 = new ContaCorrente();
		System.out.println("cc1.getSaldo():" + cc1.getSaldo());
		
		cc1.credito(umNumero);
		
		System.out.println("cc1.getSaldo() após crédito: " + cc1.getSaldo());
		
		System.out.println("cc1.getSaldo() após débito: " + cc1.getSaldo());
		
		System.out.println("cc1.extrato():" + cc1.extrato());
		
	}

}
