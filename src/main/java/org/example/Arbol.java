package org.example;
import java.util.Random;

public class Arbol {

    private Nodo raiz;
    private int numNodos;

    public Arbol() {
        this.raiz = null;
        this.numNodos = 0;
    }

    // Metodos main para los metodos recursivos
    public void ingresarNodo(int dato) {
        this.raiz = insertNodo(dato, this.raiz);
    }

    public void recorridoPreOrden() {
        preorder(raiz);
    }

    public void recorridoEntreOrden() {
        inorder(raiz);
    }

    public void recorridoPosOrden() {
        postorder(raiz);
    }

    public void imprimirNivelNodo() {
        printLevelOfNodo(raiz, 1);
    }

    public void diferenciaAlturaNodos() {
        nodeHeights(raiz);
    }

    public void generarArbolAleatorio(int numeroNodos) {
        int datoAleatorio;
        Random genNumeroAleatorio = new Random();
        for(int i = 1; i <= numeroNodos; i++) {
            datoAleatorio = genNumeroAleatorio.nextInt(100);
            System.out.println("Dato generador: " + datoAleatorio);
            ingresarNodo(datoAleatorio);
        }
    }
    public void eliminarNodo(int dato) {
        this.raiz = deleteNodo(dato, raiz);
    }
    public void busquedaNodo(int dato) {
        if(searchNodo(dato, raiz)) System.out.println("El dato: " + dato + " a sido encontrado!!");
        else System.out.println("El dato no a sido encontrado!!");
    }
    // Metodos recursivos
    private Nodo deleteNodo(int dato, Nodo root) {
        if (root == null) {
            return null;
        }

        if (dato < root.getDato()) {
            root.izquierdo = deleteNodo(dato, root.izquierdo);
        } else if (dato > root.getDato()) {
            root.derecho = deleteNodo(dato, root.derecho);
        } else {
            if (root.izquierdo == null && root.derecho == null) {
                root = null;
            }
            else if (root.izquierdo == null) {
                root = root.derecho;
            } else if (root.derecho == null) {
                root = root.izquierdo;
            }
            else {
                Nodo sucesor = encontrarSucesor(root.derecho);
                root.setDato(sucesor.getDato());
                root.derecho = deleteNodo(sucesor.getDato(), root.derecho);
            }
        }
        return root;
    }

    private Nodo encontrarSucesor(Nodo nodo) {
        while (nodo.izquierdo != null) {
            nodo = nodo.izquierdo;
        }
        return nodo;
    }
    private Boolean searchNodo(int dato, Nodo root) {
        if(root == null) return false;

        if(root.getDato() == dato) return true;
        
        if(searchNodo(dato, root.izquierdo)) return true;
        if(searchNodo(dato, root.derecho)) return true;
        
        return false;
    }

    private Nodo insertNodo(int dato, Nodo root) {
        if(root == null) return new Nodo(dato);
        if(dato < root.getDato()) {
            if(root.izquierdo == null) root.izquierdo = new Nodo(dato);
            else insertNodo(dato, root.izquierdo);
        }else {
            if(root.derecho == null) root.derecho = new Nodo(dato);
            else insertNodo(dato, root.derecho);
        }
        return root;
    }

    private void preorder(Nodo root) {
        if(root == null) return;

        System.out.println("Dato: " + root.getDato());
        preorder(root.izquierdo);
        preorder(root.derecho);
    }

    public void inorder(Nodo root) {
        if(root == null) return;

        inorder(root.izquierdo);
        System.out.println("Dato: " + root.getDato());
        inorder(root.derecho);
    }

    private void postorder(Nodo root) {
        if(root == null) return;

        postorder(root.izquierdo);
        postorder(root.derecho);
        System.out.println("Dato: " + root.getDato());
    }

    private void printLevelOfNodo(Nodo root, int nivel) {
        if(root == null) return;
        System.out.println("Nivel: " + nivel + ", Dato: " + root.getDato());
        printLevelOfNodo(root.izquierdo, nivel + 1);
        printLevelOfNodo(root.derecho, nivel + 1);
    }

    private int altura(Nodo root) {
        if (root == null) return 0;

        int alturaIzquierda = altura(root.izquierdo);
        int alturaDerecha = altura(root.derecho);

        return Math.max(alturaIzquierda, alturaDerecha) + 1;

    }
    private void nodeHeights(Nodo root) {
        if(root == null) return;

        int alturaIzquierda = altura(root.izquierdo);
        int alturaDerecha = altura(root.derecho);
        int diferenciaAltura = alturaDerecha - alturaIzquierda;
        System.out.println("Diferencia del nodo: " + root.getDato() + " es: " + diferenciaAltura);
        nodeHeights(root.izquierdo);
        nodeHeights(root.derecho);
    }
}
