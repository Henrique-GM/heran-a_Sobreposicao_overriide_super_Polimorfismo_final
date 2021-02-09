/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import entidades_exercicio.Empregado;
import entidades_exercicio.EmpregadoTerceirizado;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Programa {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Empregado> lista = new ArrayList<>();
        
        System.out.print("Entre com o número de funcionarios: ");
        Integer numero = sc.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            
            System.out.println("Empregado #" + i + " dados");
            
            System.out.print("Tercerizado (s/n)? ");
            char escolha = sc.next().charAt(0);
            
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Horas: ");
            Integer horas = sc.nextInt();
            
            System.out.print("Valor por hora: ");
            Double valorPorHora = sc.nextDouble();
            
            if (escolha == 's') {
                
                System.out.print("Taxa adicional: ");
                Double taxaAdicional = sc.nextDouble();
                
                Empregado empregado = new EmpregadoTerceirizado(taxaAdicional, nome, horas, valorPorHora);
                lista.add(empregado);
            }
            
            else {
                
                Empregado empregado = new Empregado(nome, horas, valorPorHora);
                lista.add(empregado);
            }
        }
        
        System.out.println();
        
        System.out.println("PAGAMENTOS");
        
        for (Empregado empregado : lista) {
            
            System.out.println(empregado.getNome() + " - $ " + String.format("%.2f", empregado.pagamento()));
        }
        
        sc.close();
    }
}
