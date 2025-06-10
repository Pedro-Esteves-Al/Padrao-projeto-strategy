package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    Cliente cliente;
    @BeforeEach
    void setUp() {
        cliente = new Cliente();
    }
    @Test
    void devePagarPorPix() {
        cliente.pagarPorPix();
        assertEquals("Pagamento feito por Pix",cliente.getFormaDePagamento());
    }
    @Test
    void devePagarPorBoleto() {
        cliente.pagarPorBoleto();
        assertEquals("Pagamento feito por Boleto",cliente.getFormaDePagamento());
    }
    @Test
    void devePagarPorCartao() {
        cliente.pagarPorCartao();
        assertEquals("Pagamento feito por Cartão",cliente.getFormaDePagamento());
    }

}