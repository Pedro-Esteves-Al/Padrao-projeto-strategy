package org.example;

public class Pagamento {
    private String formaDePagamento;

    public String processarPagamento(FormaDePagamento formaDePagamento) {
        return "Pagamento feito por "+formaDePagamento.processar();
    }
}
