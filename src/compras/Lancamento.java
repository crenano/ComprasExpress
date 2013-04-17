/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compras;

/**
 *
 * @author RENAN
 */
public class Lancamento {
    int numero;
    int numeroprocesso;
    int tipo;
    String produto;
    int quantidade;
    String data;
    String usuario;
    String historico;
    
    public Lancamento(int numero, int numeroprocesso, int tipo, String produto, int quantidade, String data, String usuario, String historico){
    this.numero = numero;
    this.numeroprocesso = numeroprocesso;
    this.tipo = tipo;
    this.produto = produto;
    this.quantidade = quantidade;
    this.data = data;
    this.usuario = usuario;
    this.historico = historico;

    }
    
    
}
