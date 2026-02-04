package br.com.tiago.maratonadevjr.poo.pagamentos;

public class PagamentoCartao extends Pagamento{

    public PagamentoCartao(double valor) {
        super(valor);
    }

    @Override
    public String processarPagamento() {
        return "Pagamento no valor de: " + retornarValor() + " efetuado com sucesso via cartão";
    }
    
}
