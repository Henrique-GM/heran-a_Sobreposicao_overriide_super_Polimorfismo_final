/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesExercicio_02;

/**
 *
 * @author Henrique
 */
public class ProdutoImportado extends Produto {
    
    private Double taxaAlfandegaria;

    public ProdutoImportado() { 
        super();
    }

    public ProdutoImportado(Double taxaAlfandegaria, String nome, Double preco) {
        super(nome, preco);
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    public Double getTaxaAlfandegaria() {
        return taxaAlfandegaria;
    }

    public void setTaxaAlfandegaria(Double taxaAlfandegaria) {
        this.taxaAlfandegaria = taxaAlfandegaria;
    }   
    
    public Double precoTotal() {
        return getPreco() + taxaAlfandegaria;
    }
    
    @Override
    public String precoDaEtiqueta() {
      return "Nome: " + getNome()             
              + "Preço: " + String.format("%.2f", precoTotal())             
              + '('+" Taxa Personalizada: " + String.format("%.2f", taxaAlfandegaria)+')';
    }
}
