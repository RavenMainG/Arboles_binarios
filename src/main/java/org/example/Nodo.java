package org.example;

public class Nodo {

    private int dato;
    Nodo izquierdo, derecho;
    public Nodo(int dato) {
        this.dato = dato;
        this.izquierdo = this.derecho = null;
    }

    public int getDato() {
        return this.dato;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzquierdo() {
        return this.izquierdo;
    }
    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return this.derecho;
    }
    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
}