package br.com.tiago.maratonadevjr.poo.pagamentos;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PagamentoBoleto pb1 = new PagamentoBoleto(500.25);
        PagamentoCartao pc1 = new PagamentoCartao(35.00);
        PagamentoBoleto pb2 = new PagamentoBoleto(285.00);
        PagamentoBoleto pb3 = new PagamentoBoleto(500.25);
        PagamentoCartao pc2 = new PagamentoCartao(1500.00);

        List<Pagamento> pagamentos = Arrays.asList(pb1, pc1, pb2, pb3, pc2);

        for (Pagamento pagamento : pagamentos) {
            System.out.println(pagamento.processarPagamento());
        }
        
    }
    
}