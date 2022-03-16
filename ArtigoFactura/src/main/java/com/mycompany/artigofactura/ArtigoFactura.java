
package com.mycompany.artigofactura;

/**
 *
 * @author sanco
 */
public class ArtigoFactura {
    
    private int valorActual;
    
    public ArtigoFactura (int valorInicial){
        this.valorActual = valorInicial;
    }
    
    public String toString(){
        
        String valor =  String.valueOf(valorActual);
        return valor;
    }
    
    
    
}
