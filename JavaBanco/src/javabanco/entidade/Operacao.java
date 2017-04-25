package javabanco.entidade;

import java.util.Date;

public class Operacao {
	private float valor;
	private String tipoOperacao;
	private Date dataHora;

	public Date getDataHora() {
		return dataHora;
	}

	public String getTipoOperacao() {
		return tipoOperacao;
	}

	public Operacao(float valor, String tipoOperacao, Date dataHora) {
		this.valor = valor;
		this.tipoOperacao = tipoOperacao;
		this.dataHora = dataHora;
	}

	public float getValor() {
		return valor;
	}
	
	public void setDataHora(java.util.Date dataHora){
		this.dataHora = dataHora;
	}

	@Override
	public String toString() {
		return this.getValor() + ", " + this.getTipoOperacao() + ", " + this.getDataHora();
	}
	
	

}
