package br.com.tiago.maratonadevjr.poo.pagamentos;

public abstract class Pagamento {
	private double valor; 

	public Pagamento(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("Valor negativo - inválido");
		}
		this.valor = valor;
	}

   	public abstract String processarPagamento();

   	public double retornarValor() {
		return this.valor;
   	}
    
}