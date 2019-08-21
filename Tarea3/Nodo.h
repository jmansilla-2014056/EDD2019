#pragma once
#ifndef NODO_H
#define NODO_H
#include <string>

using namespace std;
class Nodo
{
	public:
		Nodo *siguiente=0;
                Nodo *derecha=0;
                Nodo *izquierda=0;
	
                string dia;
                string actividad;
		Nodo();	
        private:
};
#endif
