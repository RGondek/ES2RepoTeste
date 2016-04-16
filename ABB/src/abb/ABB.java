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
public class ABB {

    private Node root; // raiz da �rvore   
    private int size;
    
    ABB() {
        // Cria uma �rvore bin�ria vazia  
        root = null;
    }

    public boolean isEmpty() {
        // Verifica se a �rvore est� vazia    
        return root == null;
    }

    public Node root() {
        // Devolve a raiz da �rvore.   
        return root;
    }

    public boolean isLeaf(Node n) {
        // Verifica se um n� n � uma folha
        return n.getLeft() == null && n.getRight() == null;
    }

    public void executaPreOrdem(Node no) {
        if (no == null) {
            return;
        }
        System.out.print(no.getElemento() + " ");
        executaPreOrdem(no.getLeft());
        executaPreOrdem(no.getRight());
    }

    public void executaInOrdem(Node no) {
        if (no == null) {
            return;
        }

        executaInOrdem(no.getLeft());
        System.out.println(no.getElemento() + " ");
        executaInOrdem(no.getRight());
    }

    public void executaPosOrdem(Node no) {
        if (no == null) {
            return;
        }
        executaPosOrdem(no.getLeft());
        executaPosOrdem(no.getRight());
        System.out.print(no.getElemento() + " ");
    }

    public void insere(Node z) {
        Node y = null;
        Node x = root();
        while (x != null) {
            y = x;
            if (z.isEqual(x)) {
                y.increaseCont();
                size++;
                return;
            } else if (z.getElemento().getText().compareTo(x.getElemento().getText()) < 0) {
                x = x.getLeft();
            } else {
                x = x.getRight();
            }
        }
        z.setParent(y);
        if (y == null) {
            root = z;
        } else if (z.getElemento().getText().compareTo(y.getElemento().getText()) < 0) {
            y.setLeft(z);
        } else {
            y.setRight(z);
        }
        size++;
    }

    public void delete(Node Tree, String Tar) {
        Node Min, Temp;
        if (Tree == null) // �rvore vazia
        {
            return;
        } else if (Tar.compareTo(Tree.elemento.getText()) < 0) {
            delete(Tree.left, Tar); // buscar na esquerda
        } else if (Tar.compareTo(Tree.elemento.getText()) > 0) {
            delete(Tree.right, Tar);// buscar na direita
        } else {
            // encontrou o n� a ser deletado
            if (Tree.left != null && Tree.right != null) {
                // n� com dois filhos 
                Min = minimo(Tree.right);
                Tree.elemento = Min.elemento;
                delete(Tree.right, Tree.elemento.getText());
            } else {
                // n� com um ou nenhum filho
                if (Tree.left == null) {
                    if (Tree.parent == null) {
                        root = Tree.right; // A raiz dever� ser deletada
                    } else {
                        if (Tree.right != null) {
                            Tree.right.parent = Tree.parent;
                        }
                        if (Tree == Tree.parent.left) {
                            Tree.parent.left = Tree.right;
                        } else {
                            Tree.parent.right = Tree.right;
                        }
                    }

                } else if (Tree.right == null) {
                    if (Tree.parent == null) {
                        root = Tree.left; // A raiz dever� ser deletada
                    } else {

                        Tree.left.parent = Tree.parent;
                        if (Tree == Tree.parent.left) {
                            Tree.parent.left = Tree.left;
                        } else {
                            Tree.parent.right = Tree.left;
                        }
                    }
                }

            }

        }

    }

    public Node busca(Node k) {
        Node y = root();
        while (y != null) {
            if (y.getElemento().getText().equals(k.getElemento().getText())) {
                return y;
            } else if (y.getElemento().getText().compareTo(k.getElemento().getText()) < 0) {
                y = y.getRight();
            } else {
                y = y.getLeft();
            }
        }
        return null;
    }
    
    public int busca(String txt) {
        Node y = root();
        while (y != null) {
            if (y.getElemento().getText().equals(txt)) {
                return y.getElemento().getCont();
            } else if (y.getElemento().getText().compareTo(txt) < 0) {
                y = y.getRight();
            } else {
                y = y.getLeft();
            }
        }
        return 0;
    }

    public Node maximo(Node x) {
        //Node<E> x = root();
        while (x.getRight() != null) {
            x = x.getRight();
        }
        return x;
    }

    public Node minimo() {
        Node x = root();
        while (x.getLeft() != null) {
            x = x.getLeft();
        }
        return x;
    }

    public Node minimo(Node n) {
        Node x = n;
        while (x.getLeft() != null) {
            x = x.getLeft();
        }
        return x;
    }

    public Node mystery(Node root) {
        if (root.getRight() == null) {
            return root;
        } else {
            return mystery(root.getRight());
        }
    }

    public int count(Node x) {    
       return this.size;
    }
}
