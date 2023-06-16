package ArbolPalabras;

public class Nodo {

    private String palabra;
    Nodo izquierdo, derecho;

    public Nodo(String palabra) {
        this.palabra = palabra;
        this.derecho=this.izquierdo=null;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
}
