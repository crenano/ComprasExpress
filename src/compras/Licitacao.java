/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compras;

/**
 *
 * @author RENAN
 * dados sobre o processo licitatório
 */
public class Licitacao {
    int numero;
    int ano;
    Fornecedor nome;   
    String produto[];
    int quantidade[];
    double valor[];
    double total;
    double saldo;
    
     Licitacao(int numero, int ano,Fornecedor nome, String produto[],int quantidade[], double valor[], double total, double saldo){
      this.numero = numero;
      this.ano = ano;
      this.nome = nome;
      this.produto = produto;
      this.quantidade = quantidade;
      this.valor = valor;
      this.total = total;
      this.saldo = saldo;   
    }
     
     private void saldo(){

     saldo = 0;    
//calcular quanto ainda resta da licitação
         for (int i = 0; i < quantidade.length; i++) {
             this.saldo += quantidade[i] + valor[i];
         }
              
  
    
     }
     
}
