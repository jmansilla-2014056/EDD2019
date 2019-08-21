/*
 * To change this license cabezaer, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: User
 *
 * Created on 20 de agosto de 2019, 10:07 PM
 */
#include<stdlib.h>
#include<iostream>
#include <fstream>
#include <string.h>
#include <cstring>
#include <cstdlib>
#include <string>
#include "List.h"
#include "Nodo.h"
using namespace std;
List lista;
/*
 * 
 */
int main(int argc, char** argv) {
    while (true) {
        printf("%s\n", "1. Ingresar dia , 2.ingresar actividad, 3 imprimir");
        string o;
            cin>>o;
            if(o == "1"){
                printf("%s\n", "Ingresar el dia");
                string dia;
                cin >>dia;
                lista.insertar(dia, "");
            }else if(o=="2"){
                printf("%s\n", "Ingresar el dia");
                string dias;                
                cin >>dias;
                printf("%s\n", "Ingresar la actividad");
                string act;                
                cin >>act;
                lista.insertar(dias,act);
            }else if(o=="3"){
                
            }
            o = "9999";
    }
    return 0;
}
