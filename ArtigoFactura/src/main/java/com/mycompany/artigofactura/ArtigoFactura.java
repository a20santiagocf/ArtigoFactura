
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
    
   public double obterPrezo(){
       
       return prezoUnitario;
   }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantide() {
        return cantide;
    }

    public void setCantide(int cantide) {
        this.cantide = cantide;
    }

    public double getPrezoUnitario() {
        return prezoUnitario;
    }

    public void setPrezoUnitario(double prezoUnitario) {
        this.prezoUnitario = prezoUnitario;
    }
   
   
    
    
}
