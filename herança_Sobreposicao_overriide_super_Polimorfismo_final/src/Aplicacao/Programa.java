/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import entidades.Conta;
import entidades.ContaNegocio;
import entidades.ContaPoupanca;


/**
 *
 * @author Henrique
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Conta conta = new Conta(1001, "Alex", 0.0);
        ContaNegocio CN = new ContaNegocio(500.0, 1002, "Maria", 0.0);
        
        //UPCASTING
        //Pegar um objeto da subeclasse e atribuilo, para uma variável em uma superclasse.
        Conta conta2 = CN;
        Conta conta3 = new ContaNegocio(200.0, 1003, "Bob", 0.0);
        Conta conta4 = new ContaPoupanca(0.01, 1004, "Anna", 0.0);
        
        //DOWNCASTING
        //Converte um objeto da superclasse, para subclasse.       
        ContaNegocio conta5 = (ContaNegocio)conta3;
        conta5.emprestimo(100.0);
        
        //Testando objetos
        
        //ContaNegocio conta6 = (ContaNegocio)conta4;
        //O if falhou
        if (conta4 instanceof ContaNegocio) {
            ContaNegocio conta6 = (ContaNegocio)conta3;
            conta6.emprestimo(200.0);
            System.out.println("Impréstimo!");
        }
        
        if (conta4 instanceof ContaPoupanca) {
           ContaPoupanca conta6 = (ContaPoupanca)conta4;
           conta6.atualizarSaldo();
           System.out.println("Atualizado");
        } 
               
        Conta C = new Conta(1009, "Jorge", 1000.0);
        C.saque(200);
        System.out.println(C.getSaldo());
        
        //Usando sobreposição
        Conta C2 = new ContaPoupanca(0.01, 1007, "Marta", 1000.0);
        C2.saque(200);
        System.out.println(C2.getSaldo());
        
        //Usando sobreposicao com super
        Conta C3 = new ContaNegocio(500.0, 1008, "Bob", 1000.0);
        C3.saque(200);
        System.out.println(C3.getSaldo());
        
        //Polimorfismo
        Conta x = new Conta(1025, "Fernando", 1000.0);
        Conta y = new ContaPoupanca(0.01, 1029, "Vanessa", 1000.0);
        
        x.saque(50.0);
        y.saque(50.0);
        
        System.out.println(x.getSaldo());
        System.out.println(y.getSaldo());
    }   
}
