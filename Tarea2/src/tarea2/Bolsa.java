/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.Arrays;

/**
 *
 * @author Mansilla
 */

/**
 *
 * @author User
 */
public class Bolsa {
    protected Node head;
    protected Node tail;
    private int length;
    
    public Bolsa(){
        System.out.println("Se creo una nueva bolsa");
        this.head = new Node();
        this.tail = new Node();
        this.length = 0;
    }    
    
    public Bolsa bolsavacia(){
        return new Bolsa();
    }
    
    //Esta vacia?
    public static boolean esvacia(Bolsa dlE){
        System.out.println("Es vacia la bolsa?: " + (dlE.length == 0));
        return dlE.length == 0;
    }
    
    //No devuelve la cantidad de elementos pero cuenta las insercciones
    public int length(){
        return length;
    }
    
    //desplegar Nodos
    public static void display(Bolsa dlE){
        Node temp = new Node();
        temp = dlE.head;
        do{
            System.out.print("<-");
            System.out.print(temp.getData());
            System.out.print("->");
            System.out.println();
            temp = temp.getNext();
        }while(temp!=dlE.head);
    }
    
     //insertar pares
     public static Bolsa insertar(Bolsa dlE, Object value){
         Node newNode = new Node(value);
         if(dlE.length == 0){
             dlE.head = newNode;
             dlE.head.setNext(dlE.head);
             newNode.setPrevious(dlE.tail);
             dlE.tail = newNode;
         }else{
             dlE.tail.setNext(newNode);
             newNode.setNext(dlE.head);
             newNode.setPrevious(dlE.tail);
             dlE.tail = newNode;
             dlE.head.setPrevious(newNode);
         }
         dlE.length++;
         return dlE;
     }    
     
    //Contar Elementos
     public static int countElements(Bolsa dlE){
     int count = 0; 
     Node temp = new Node();
        temp = dlE.head;
        do{
            count++;
            temp = temp.getNext();
        }while(temp!=dlE.head);
        return count;
     }
     
     public static int cuantos(Bolsa dlE, Object data){
     if(verificar(dlE,data)){
         int count = 1; 
     Node temp = new Node();
        temp = dlE.head;
        while(temp.getData()!=data){
            count++;
            temp = temp.getNext();
        }
        System.out.println("La cantidad de elementos a partir de " + data.toString() + " es de:" +  (countElements(dlE)-count) );
        return count-countElements(dlE);
     }else{
          System.out.println("Ese elemento no pertence a la bolsa...return size list:"+ countElements(dlE));
          return countElements(dlE);
     }
     }
     
     public static boolean verificar(Bolsa dlE, Object data){
     boolean existe = false;
     Node temp = new Node();
        temp = dlE.head;
        do{
            if(temp.getData()==data){
                existe = true;
                break;
            }
            temp = temp.getNext();
        }while(temp!=dlE.head );
        return existe;
     }
     
    //Obtener el Nodo por su posicion
     public Node getNode(int val){
         Node temp = head;
         for(int x=0; x<val-1;x++){
             temp = temp.getNext();
         }
         return temp;
     }
     
    
     
     
}
