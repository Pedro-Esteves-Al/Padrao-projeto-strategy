package org.example;

public class FormaDePagamentoBoleto implements FormaDePagamento {
    private FormaDePagamentoBoleto() {};
    private static FormaDePagamentoBoleto instance = new FormaDePagamentoBoleto();
    public static FormaDePagamentoBoleto getInstance() {
        return instance;
    }
    public String processar() {
        return "Boleto";
    }
}
