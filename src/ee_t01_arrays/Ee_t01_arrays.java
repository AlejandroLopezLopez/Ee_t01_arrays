/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t01_arrays;

/**
 *
 * @author Alejandro Lopez Lopez
 */
import java.io.*;
public class Ee_t01_arrays {

    private String entrada="";
    private String salida="";
    private int tamaño;
    
    public void setEntrada(String entrada){
     this.entrada=entrada;
    }
    public String getEntrada(){
      return entrada;
    }
    //** En este metodo se leera el archivo con la entrada
    public void leerArchivo(){
        
      try{
    FileReader fr = new FileReader ("numeros.txt");
    BufferedReader br = new BufferedReader(fr);
    for(int i=0;i<tamaño;i++)
    {
        entrada=entrada+br.readLine();
    }
 
    }
    catch (Exception e){
     System.out.println("No se encontro el Archivo");
      }
    }
    public void crearArray(){
    char [] numeros=new char[tamaño];
    for(int i=0;i<entrada.length();i++){
     numeros[i]=entrada.charAt(i);    
    }
    for(int j=entrada.length()-1;j>=0;j--){
    salida=salida+numeros[j];
    }
    
    }
    public static void main(String []arg) {
        // TODO code application logic here
        Ee_t01_arrays e= new Ee_t01_arrays();
        e.leerArchivo();
        e.crearArray();   
        System.out.println("entrada: "+e.tamaño+e.entrada);
        System.out.println("salida: "+e.salida);
    }
    
}
