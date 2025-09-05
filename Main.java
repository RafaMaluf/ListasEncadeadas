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
        pilha.imprime();

        pilha.remove();
        pilha.imprime();
        System.out.println("fim pilha");


        // 2) fila
        System.out.println("começo fila");
        Fila fila = new Fila();
        fila.insere(2);
        fila.insere(4);
        fila.insere(6);
        fila.insere(8);
        fila.imprime();

        fila.remove();
        fila.imprime();

        fila.remove();
        fila.imprime();
        System.out.println("fim fila");


        // 3.1) merge de duas filas encadeadas
        System.out.println("começo merge (lista encadeada)");
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

        System.out.println("fila C (A+B):");
        C.imprime();
        System.out.println("fim merge (lista encadeada)");


        // 3.2) merge dois vetores
        System.out.println("começo merge (vetores)");
        int[] vetA = {1, 3, 5, 7, 9};
        int[] vetB = {2, 4, 6, 8};

        MergeVetor merge_vetor = new MergeVetor();
        int[] vetC = merge_vetor.merge(vetA, vetA.length, vetB, vetB.length);

        System.out.println("vetor A:");
        for (int x : vetA) System.out.print(x + " -> ");
        System.out.println("Null");

        System.out.println("vetor B:");
        for (int x : vetB) System.out.print(x + " -> ");
        System.out.println("Null");

        System.out.println("vetor C (A+B):");
        merge_vetor.imprime();
        System.out.println("fim merge (vetores)");
    }
}
