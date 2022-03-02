/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.io.*;

public class ExemploDom {
    
    public static void main(String args[]) throws IOException{
        int  id = 1;                                            // Id de filme
        int  ano =  1999;                                       // Ano do filme
        Double prezo = 19.99;                                   // Prezo
        String titulo = new String("A lingua das bolboretas");  // Titulo
     
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
  
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "Filmes", null);
            document.setXmlVersion("1.0"); 
            
            //nodo filme
            Element raiz = document.createElement("filme"); 
            document.getDocumentElement().appendChild(raiz); 
        
            //Engadir ID                       
            CrearElemento("id",Integer.toString(id), raiz, document); 
            //Titulo
            CrearElemento("titulo",titulo.trim(), raiz, document); 
            //Engadir Ano
            CrearElemento("ano",Integer.toString(ano), raiz, document); 
            //Engadir prezo
            CrearElemento("prezo",Double.toString(prezo), raiz, document); 
            
            Source source = new DOMSource(document);
            Result result = new StreamResult(new java.io.File("Filmes.xml"));        
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
    
        }catch(Exception e){ System.err.println("Error: "+e); }
    
    }//fin de main
 
    //Insercion dos datos do filme
    static void  CrearElemento(String etiqueta, String valor,Element raiz, Document document){
        Element elem = document.createElement(etiqueta); 
        Text text = document.createTextNode(valor); //damos valor
        raiz.appendChild(elem);                     //Engadimos o elemento fillo a raiz
        elem.appendChild(text);                     //Engadimos o valor como fillo de elem
    }
    
}//fin da clase
