
#include "List.h"
#include "Nodo.h"
#include<stdlib.h>
#include<iostream>
#include <fstream>
#include <string.h>
#include <cstring>

using namespace std;


void List::insertar(string dia, string actividad) {
    //aqui codificas
    Nodo* nodo_dia = exist_dis_empia(dia);
    Nodo* nuevo = new Nodo();
    nuevo->dia = dia;
    nuevo->actividad = actividad;

    if (nodo_dia == 0) {
        nodo_dia = insertar_dia(dia);
    }
    Nodo* aux = nodo_dia;
    while (aux != 0) {
        aux = aux->izquierda;
    }
    nuevo->derecha = aux;
    aux->izquierda = nuevo;
    nuevo->izquierda = 0;

}

Nodo* List::insertar_dia(string dia) {
    Nodo* aux = cabeza;
    
    while (aux->siguiente != 0) {
        aux = aux->siguiente;
    }
    Nodo* nuevo = new Nodo();
    nuevo->siguiente = nuevo->izquierda = nuevo->derecha = 0;
    nuevo->dia = dia;
    aux = nuevo;

}

Nodo* List::exist_dis_empia(string dia) {
    if (esta_vacio()) {
        return 0;
    } else {
        Nodo* aux = cabeza;
        while (aux != 0) {
            if (aux->siguiente->dia == dia) {
                return aux;
            }
            aux = aux->siguiente;
        }
    }
}

bool List::esta_vacio() {
    return cabeza == 0;
}

