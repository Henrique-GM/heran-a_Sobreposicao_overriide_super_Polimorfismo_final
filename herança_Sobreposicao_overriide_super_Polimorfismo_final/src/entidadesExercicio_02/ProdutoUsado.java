/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesExercicio_02;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Henrique
 */
public class ProdutoUsado extends Produto {
    
    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
    
    private Date dataDeFabricacao;
    
    public ProdutoUsado() { 
        super();
    }

    public ProdutoUsado(Date dataDeFabricacao, String nome, Double preco) {
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public Date getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(Date dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }
    
    @Override
    public final String precoDaEtiqueta() {
      return "Nome: " + getNome()
              + " (usado) $ "
              + " Preço: " + String.format("%.2f", getPreco())
              + "Data de fabricação (DD/MM/YYYY): " + sdf.format(dataDeFabricacao);              
    }
    
}
