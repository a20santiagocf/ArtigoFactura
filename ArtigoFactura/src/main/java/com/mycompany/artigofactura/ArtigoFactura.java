
package com.mycompany.artigofactura;

/**
 *
 * @author sanco
 */
public class ArtigoFactura {
    
 private String id;
 private String descripcion;
 private int cantide;
 private double prezoUnitario;
 
 
    
    public ArtigoFactura (String id, String descripcion, int cantidade, double prezoUnitario ){
        this.cantide = cantidade;
        this.descripcion = descripcion;
        this.id = id;
        this.prezoUnitario = prezoUnitario;
    }
    
    public String toString(){
        
        
        return descripcion;
    }
 

   
   
   
    
    
}
