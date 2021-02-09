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
public class ContaNegocio extends Conta{
    
    private Double limiteDeEmprestimo;
    
    public ContaNegocio() {  
        super();
    }

    public ContaNegocio(Double limiteDeEmprestimo, Integer numero, String titular, Double saldo) {
        super(numero, titular, saldo);
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }

    public Double getLimiteDeEmprestimo() {
        return limiteDeEmprestimo;
    }

    public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }

    public void emprestimo(double montante) {
        if (montante <= limiteDeEmprestimo) {
            saldo += montante - 10.0;
        }        
    }   
    
    @Override
    public void saque(double montante) {
        super.saque(montante);
        saldo -= 2.0;
    }
}
