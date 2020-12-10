/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliminar;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class nodoDos {
    Scanner sc= new Scanner (System.in);    
public class Nodo {
    
    public String dato;
    public Nodo sig;
    public Nodo(String valor){
        this.dato=valor;
    }
    public Nodo(String valor,Nodo a){
        dato=valor;
        sig=a;
    }
}

    private Nodo principio,ultimo;
    public nodoDos(){
        principio = null;
        ultimo= null;
    }
public void agregar(String valor){
   
    valor=sc.nextLine();
    principio=new Nodo(valor, principio);
        if(ultimo==null){
            ultimo=principio;
        }
    }
    public void mostrar(){
        Nodo rec=principio;
        while(rec!=null){
            System.out.print("Dato : ["+rec.dato+"]\n");
            rec=rec.sig;
        }
        
    }
    public String eliminar(){
        String valor=principio.dato;
        if(principio==ultimo){
            principio=null;
            ultimo=null;
        }else{
           principio=principio.sig;
        }
        return valor;
    }
    public String eliminarult(){
        String valor=ultimo.dato;
        if (principio==ultimo) {
            principio=null;
            ultimo=null;
        }else{
            Nodo temporal=principio;
            while(temporal.sig!=ultimo){
                temporal=temporal.sig;
            }
            ultimo=temporal;
            ultimo.sig=null;
        }
        return valor;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        String v=null;//agarra el valor de los datos ingresados en "valor"
        nodoDos n= new nodoDos();
        int opc;
        
       do{           
                System.out.println("1 agregar  \n" // aqui se realizo un menu
                    + "2 mostrar \n"
                    + "3 eliminar\n"
                    + "4 eliminar dato primero \n "
                    + "5 salir\n");
               switch (opc=in.nextInt()){
                   case 1:
                           System.out.println(" dato ingresar");
                           n.agregar(v);
                       break;
                       case 2:
                           System.out.println("datos");
                           n.mostrar();
                           
                       break;
                       case 3:
                           System.out.println("eliminado");
                           n.eliminar();
                           
                       break;
                       case 4:
                           System.out.println("eliminado");
                          n.eliminarult();
                           
                           break;
                        
               }
           
       }while(opc!=5);
    }
}

