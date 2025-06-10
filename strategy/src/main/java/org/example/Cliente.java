package org.example;

public class Cliente {
    private String formaDePagamento;

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void pagarPorPix() {
        Pagamento pagamento = new Pagamento();
        this.formaDePagamento = pagamento.processarPagamento(FormaDePagamentoPix.getInstance());
    }
    public void pagarPorCartao() {
        Pagamento pagamento = new Pagamento();
        this.formaDePagamento = pagamento.processarPagamento(FormaDePagamentoCartao.getInstance());
    }
    public void pagarPorBoleto() {
        Pagamento pagamento = new Pagamento();
        this.formaDePagamento = pagamento.processarPagamento(FormaDePagamentoBoleto.getInstance());
    }
}
