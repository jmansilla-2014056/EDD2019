/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import static tarea2.Bolsa.cuantos;
import static tarea2.Bolsa.display;
import static tarea2.Bolsa.esvacia;
import static tarea2.Bolsa.insertar;
/**
 *
 * @author Mansilla
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    // String input
    
    Bolsa bolsavacia1 = new Bolsa();
    //La bolsavacia1 esta vacia?
    esvacia(bolsavacia1);
    
    Bolsa bolsavacia2 = new Bolsa();
    
    insertar(bolsavacia1, "Elemento 1a");
    insertar(bolsavacia2, "Elemento 1b");
    insertar(bolsavacia1, "Elemento 2a");
    
    insertar(bolsavacia2, "Elemento 2b");
    insertar(bolsavacia1, "Elemento 3a");
    insertar(bolsavacia2, "Elemento 3b");
    insertar(bolsavacia2, "Elemento 4b");
    insertar(bolsavacia2, "Elemento 5b");
    
    //Ver Flujo de Inserccion para las bolsas
    display(bolsavacia1);
    display(bolsavacia2);
    
    //La bolsa 2 esta vacia?
    esvacia(bolsavacia2);
    
    //Contar los elementos de la bolsavacia1 desde el primer elemento
    cuantos(bolsavacia1, "Elemento 1a" );
    
    //Contar los elementos de la bolsavacia2 desde "Elemento 2b"
    cuantos(bolsavacia2, "xxx" );
    cuantos(bolsavacia2, "Elemento 3b" );
    
    //Contar los elementos a partir del ultimo elemento
    cuantos(bolsavacia2, "Elemento 5b" );
    
    //Contar los elementos del return Bolsa despues de la inserccion para la bolsa 1 y apartir del segundo elemento
    cuantos(insertar(bolsavacia1, "Elemento 4a"), "Elemento 2a");
    
    
    //Prueba con enteros
    Bolsa bolsavacia3 = new Bolsa();
    //La bolsavacia3 esta vacia despues de una inserccion?
    esvacia(insertar(bolsavacia3, 21));
    display(bolsavacia3);
    }
    
}
