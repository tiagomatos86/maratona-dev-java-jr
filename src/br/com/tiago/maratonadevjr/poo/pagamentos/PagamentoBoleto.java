package br.com.tiago.maratonadevjr.poo.pagamentos;

public class PagamentoBoleto extends Pagamento{

    public PagamentoBoleto(double valor) {
        super(valor);
    }

    @Override
    public String processarPagamento() {
        return "Pagamento no valor de: " + retornarValor() + " efetuado com sucesso via boleto";
    }
    
}
