/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abb;

/**
 *
 * @author gondekr
 */
public class Node {

    Palavra elemento;  // elemento armazenado no n�
    Node left, right, parent; // apontadores do n�

    Node(Palavra elemento) {
        this.elemento = elemento;
        left = right = parent = null;
    }

    public Palavra getElemento() {
        // Devolve o elemento armazenado no n�    
        return elemento;
    }

    public void setElemento(Palavra e) {
        // Altera o elemento armazenado no n� 
        this.elemento = e;
    }

    public Node getParent() {
        // Devolve o pai do n�
        return parent;
    }

    public void setParent(Node p) {
        // Altera o pai do n� para o n� p    
        this.parent = p;
    }

    public Node getLeft() {
        // Devolve o n� armazenado � esquerda do n�    
        return left;
    }

    public void setLeft(Node p) {
        // Altera o n� armazenado � esquerda para p
        this.left = p;
    }

    public Node getRight() {
        // Devolve o n� armazenado � esquerda do n� 
        return right;
    }

    public void setRight(Node p) {
        // Altera o n� armazenado � esquerda para p  
        this.right = p;
    }
    
    public boolean isEqual(Node n) {
        return (n.getElemento().getText().equals(this.elemento.getText()));
    }
    
    public void increaseCont() {
        this.elemento.increaseCont();
    }
}
