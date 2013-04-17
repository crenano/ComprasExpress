/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compras.lacunas;

import java.util.Random;
/**
 *
 * @author RENAN
 */
public class Geradornomefornecedor {
    
    static private String[] nomes = {
        
        "aranha",
        "amaral",
        "brassi",
        "carrera",
        "centro",
        "cabelo",
        "comercial",
        "comercio",
        "digipron",
        "dentistas",
        "d-midia",
        "detetizadores",
        "extrator",
        "erick",
        "funilaria",
        "funerária",
        "gastronomia",
        "galvanizacoes",
        "geriatria",
        "henrique",
        "hidroginastica",
        "jornaleteiro",
        "masmorra",
        "navegacao",
        "ouvidoria",
        "papiloscopia",
        "queijos",
        "queijaria",
        "queijada",
        "rodoshack",
        "sao vicente",
        "santo cristo",
        "seu barriga",
        "trocadilho",
        "tesouro",
        "taxidermista",
        "taxi",
            
            
};
    static private String[] sufixos = {
        "MEI",
        "ME",
        "EPP",
        "Simples",
        "Ltda",
        "SA",
    };
    

    static private String classificacao(){
        Random g = new Random();
               int a = g.nextInt(sufixos.length);
               
               return sufixos[a];
               
   
        
        
    }
    
        static private String estrutura(){
        ExpressaoGeradora tal = new ExpressaoGeradora(25);
        tal.colar(new ParteSorteada(nomes));
        tal.colar(new ParteFixa(" - " + classificacao()));
       
        
        ExpressaoGeradora taletal = new ExpressaoGeradora(60);
        taletal.colar(new ParteSorteada(nomes));
        taletal.colar(new ParteFixa(" e "));
        taletal.colar(new ParteSorteada(nomes));
        tal.colar(new ParteFixa(" - " + classificacao()));
        
        
        ExpressaoGeradora taltaletal = new ExpressaoGeradora(15);
        taltaletal.colar(new ParteSorteada(nomes));
        taltaletal.colar(new ParteSorteada(nomes));
        taltaletal.colar(new ParteFixa(" e "));
        tal.colar(new ParteFixa(" - " + classificacao()));    
        
        
        ExpressaoGeradora [] modelos = {tal, taletal, taltaletal};
        Gerador a = new Gerador(modelos);
        
        return a.prox();
        
    }
        
        static public String geracao(){
            for (int i = 0; i < 10; i++) 
                return estrutura();
        return "Fim de dados";
        
        }
    
    
}
