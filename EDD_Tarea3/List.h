/*
 * To change this license cabezaer, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   List.h
 * Author: User
 *
 * Created on 20 de agosto de 2019, 11:09 PM
 */
#ifndef LIST_H
#define LIST_H
#include "Nodo.h"
#include<stdlib.h>
#include<iostream>
#include <fstream>
#include <string.h>
#include <cstring>


class List {
public:
    Nodo* cabeza;
    void insertar(string dia, string activdad);
    Nodo* insertar_dia(string dia);
    Nodo* exist_dis_empia(string dia);
    bool esta_vacio(); 
    private:
};

#endif /* LIST_H */

