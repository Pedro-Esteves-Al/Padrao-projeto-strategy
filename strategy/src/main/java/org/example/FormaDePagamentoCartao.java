package org.example;

public class FormaDePagamentoCartao implements FormaDePagamento {
    private FormaDePagamentoCartao() {};
    private static FormaDePagamentoCartao instance = new FormaDePagamentoCartao();
    public static FormaDePagamentoCartao getInstance() {
        return instance;
    }

    @Override
    public String processar() {
        return "Cartão";
    }
}
