/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Henrique
 */
public class ContaPoupanca extends Conta{
    
    private Double taxaDeJuro;
    
    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(Double taxaDeJuro, Integer numero, String titular, Double saldo) {
        super(numero, titular, saldo);
        this.taxaDeJuro = taxaDeJuro;
    }

    public Double getTaxaDeJuro() {
        return taxaDeJuro;
    }

    public void setTaxaDeJuro(Double taxaDeJuro) {
        this.taxaDeJuro = taxaDeJuro;
    }
    
    public void atualizarSaldo() {
        saldo += saldo * taxaDeJuro;
    }
    
    @Override
    public final void saque(double montante) {
        saldo -= montante;
    }
}
