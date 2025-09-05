package tde1;

public class MergeVetor {
    private int[] C;
    private int tamanhoC;

    public int[] merge(int[] A, int tamA, int[] B, int tamB) {
        C = new int[tamA + tamB];
        tamanhoC = 0;

        int i = 0;
        int j = 0;

        while (i < tamA && j < tamB) {
            if (A[i] <= B[j]) {
                C[tamanhoC++] = A[i++];
            } else {
                C[tamanhoC++] = B[j++];
            }
        }

        while (i < tamA) {
            C[tamanhoC++] = A[i++];
        }

        while (j < tamB) {
            C[tamanhoC++] = B[j++];
        }

        return C;
    }

    public void imprime() {
        for (int k = 0; k < tamanhoC; k++) {
            System.out.print(C[k] + " -> ");
        }
        System.out.println("Null");
    }
}
