
#include "List.h"
#include "Nodo.h"
#include<stdlib.h>
#include<iostream>
#include <fstream>
#include <string.h>
#include <cstring>

using namespace std;


Nodo* List::ya_dia(string dia) {
    if (esta_vacio()) {
        return 0;
    } else {
        Nodo* temp = cabeza;
        while (temp != 0) {
            if (temp->dia == dia) {
                return temp;
            }
            temp = temp->siguiente;
        }
    }
}

Nodo* List::insertar_dia(string dia) {
    Nodo* nuevo = new Nodo();
    nuevo->dia = dia;
    nuevo->siguiente = nuevo->izquierda = nuevo->derecha;
    
    if(esta_vacio()){
        cabeza = nuevo;
        return cabeza;
    }else{
        Nodo* temp = cabeza;
        while(temp->siguiente!=0){
            temp = temp->siguiente;
        }
        temp ->siguiente = nuevo;
        return temp->siguiente;
    }

}

bool List::esta_vacio() {
    return cabeza == 0;
}

void List::insertar(string dia, string actividad) {
    
    Nodo* nodo_dia = ya_dia(dia);
    Nodo* nuevo = new Nodo();
    nuevo->dia = dia;
    nuevo->actividad = actividad;

    if (nodo_dia == 0) {
        nodo_dia = insertar_dia(dia);
    }
    Nodo* temp = nodo_dia;
    while (temp->izquierda != 0) {
        temp = temp->izquierda;
    }
    temp->izquierda = nuevo;
    nuevo->derecha = temp;
}
    
    void List::reporte(){// metodo para imprimir 
    if (esta_vacio()) {

    } else {
        Nodo* temp_dia = cabeza;
        while (temp_dia != 0) {//recorriendo por dias
            printf("*****************");
            cout << temp_dia->dia << endl;
            Nodo* temp_act = temp_dia->izquierda;
            while (temp_act != 0) {// recorriendo actividades por cada dia
                cout << temp_act->actividad << endl;
                temp_act = temp_act->izquierda;
            }
            temp_dia = temp_dia->siguiente;
        }
    }
}
    





