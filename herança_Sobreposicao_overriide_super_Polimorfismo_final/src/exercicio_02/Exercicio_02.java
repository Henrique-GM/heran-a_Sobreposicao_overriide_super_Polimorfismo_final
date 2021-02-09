/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_02;

import entidadesExercicio_02.Produto;
import entidadesExercicio_02.ProdutoImportado;
import entidadesExercicio_02.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Exercicio_02 {
    
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Produto> lista = new ArrayList<>();
        
        System.out.print("Entre com a quantidade de produtos: ");
        Integer numero = sc.nextInt();
        
        
        for (int i = 0; i < numero; i++) {
            
            System.out.println();
            System.out.println("Produto número #" + (i + 1));
            System.out.println();
            
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char escolha = sc.next().charAt(0);
        
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
                
            System.out.print("Preço: ");
            Double preco = sc.nextDouble();

            
            if (escolha == 'c') {
                                    
                lista.add(new Produto(nome, preco));
            }
            
            else if (escolha == 'u') {
                  
                System.out.print("Data de fabricação (DD/MM/YYYY): ");
                Date data = sdf.parse(sc.next());
                
                lista.add(new ProdutoUsado(data, nome, preco));
            }
            
            else if (escolha == 'i') {
                
                System.out.print("Digite a taxa alfandegaria: ");
                Double taxaAlfandegaria = sc.nextDouble();
                
                lista.add(new ProdutoImportado(taxaAlfandegaria, nome, preco));
            }      
    
        }
        
        System.out.println();
        System.out.println("ETIQUETA DE PREÇOS");
            
        for (Produto produto : lista) {
                
            System.out.println(produto.precoDaEtiqueta());
        }
        
        sc.close();
    }
}
