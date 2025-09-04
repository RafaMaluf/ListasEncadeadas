package tde1;

public class Main {
    public static void main(String[] args) {
        /*
        1 é o funcionamento de uma pilha (first in last out)
        2 é uma fila (first in first out)
        3 é o merge entre 2 filas

        pode adicionar .insere(numero), .remove() e . imprime() pra pilha e fila
        */

        // 1) pilha
        System.out.println("começo pilha");
        Pilha pilha = new Pilha();
        pilha.insere(1);
        pilha.insere(3);
        pilha.insere(5);
        pilha.insere(7);
        System.out.println("pilha apos inserir:");
        pilha.imprime();

        pilha.remove();
        System.out.println("pilha apos remover 1 :");
        pilha.imprime();

        pilha.remove();
        System.out.println("pilha apos remover 1 :");
        pilha.imprime();
        System.out.println("fim pilha");


        // 2) fila
        System.out.println("começo fila");
        Fila fila = new Fila();
        fila.insere(2);
        fila.insere(4);
        fila.insere(6);
        fila.insere(8);
        System.out.println("fila apos inserir:");
        fila.imprime();

        fila.remove();
        System.out.println("fila apos remover 1 :");
        fila.imprime();

        fila.remove();
        System.out.println("fila apos remover 1:");
        fila.imprime();
        System.out.println("fim fila");


        // 3) merge de duas filas
        System.out.println("começo merge");
        Fila A = new Fila();
        A.insere(1);
        A.insere(3);
        A.insere(5);
        A.insere(7);
        A.insere(9);

        Fila B = new Fila();
        B.insere(2);
        B.insere(4);
        B.insere(6);
        B.insere(8);

        System.out.println("fila A:");
        A.imprime();
        System.out.println("fila B:");
        B.imprime();

        Merge m = new Merge();
        Fila C = m.merge(A, B);

        System.out.println("fila A apos merge (esvaziamos):");
        A.imprime();
        System.out.println("fila B apos merge (esvaziamos):");
        B.imprime();
        System.out.println("fila C (A+B):");
        C.imprime();
        System.out.println("fim merge");
    }
}
