/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abb;

import java.util.Scanner;

/**
 *
 * @author gondekr
 */
public class Teste {

    public static void main(String[] args) {
        ABB tree = new ABB();
        Scanner read = new Scanner(System.in);
        
        String txt = "Meu WhatsApp parece Caverna do Dragão, tem um Mestre dos Magos que me deixa falando sozinho, tem um dragão de quem eu vivo fugindo e sempre que penso em sair acontece alguma coisa pra eu ficar.";
        System.out.println("Frase: " + txt);
        String[] words = txt.replaceAll(",", "").split(" ");
        
        for (String word : words) {
            tree.insere(new Node(new Palavra(word.toLowerCase())));
        }
        System.out.println("Palavras de A a Z (e quantidade de vezes que aparecem na frase):");
        System.out.println("=========================");
        tree.executaInOrdem(tree.root());
        System.out.println("=========================");
        System.out.println("Número total de palavras na frase: " + tree.count(tree.root()));
        
        System.out.print("\nBusca: ");
        String w = read.nextLine();
        int n = tree.busca(w);
        System.out.println((n == 0 ? w + " não existe na árvore" : w + " aparece " + n + (n == 1 ? " vez": " vezes") +" na árvore"));
        
        
        
        
//        arvore.insere(new Node(20));
//        arvore.insere(new Node(10));
//        arvore.insere(new Node(25));
//        arvore.insere(new Node<Integer>(31));
//        arvore.insere(new Node<Integer>(28));
//        arvore.insere(new Node<Integer>(45));
//        arvore.insere(new Node<Integer>(21));
//        arvore.executaInOrdem(arvore.root());
//        arvore.delete(arvore.root(), 10);
//        System.out.println();
//        arvore.executaInOrdem(arvore.root());
//        arvore.insere(new Node<Integer>(10));
//        arvore.insere(new Node<Integer>(14));
//        System.out.println();
//        arvore.executaInOrdem(arvore.root());
//        arvore.delete(arvore.root(), 10);
//        System.out.println();
//        arvore.executaInOrdem(arvore.root());
//        arvore.delete(arvore.root(), 25);
//        System.out.println();
//        arvore.executaInOrdem(arvore.root());

    }
}
