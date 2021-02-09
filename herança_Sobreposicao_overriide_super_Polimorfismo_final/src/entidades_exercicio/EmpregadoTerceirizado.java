/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades_exercicio;

/**
 *
 * @author Henrique
 */
public class EmpregadoTerceirizado extends Empregado {
    
    private Double cobrancaAdicional;

    public EmpregadoTerceirizado(){
        super();
    }

    public EmpregadoTerceirizado(Double cobrancaAdicional, String nome, Integer horas, Double valorPorHora) {
        super(nome, horas, valorPorHora);
        this.cobrancaAdicional = cobrancaAdicional;
    }

    public Double getCobrancaAdicional() {
        return cobrancaAdicional;
    }

    public void setCobrancaAdicional(Double cobrancaAdicional) {
        this.cobrancaAdicional = cobrancaAdicional;
    }
    
    @Override
    public Double pagamento() {
        return super.pagamento() + cobrancaAdicional * 1.1;
    }
}
