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
public class Palavra {
    private String text;
    private int cont;

    public Palavra(String text) {
        this.text = text;
        this.cont = 1;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    public void increaseCont() {
        this.cont++;
    }

    @Override
    public String toString() {
        return text + "(" + cont + ")";
    }
}
