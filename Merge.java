package tde1;

public class Merge {
    private Node Merge;
    public Merge(){
        this.Merge = null;
    }

    public Fila merge(Fila A, Fila B){
        Fila C = new Fila();

        while (A.primeiro() != null && B.primeiro() != null){
            if (A.primeiro() <= B.primeiro()){
                C.insere(A.primeiro());
                A.remove();
            }
            else{
                C.insere(B.primeiro());
                B.remove();
            }
        }

        while (A.primeiro() != null) {
            C.insere(A.primeiro());
            A.remove();
        }

        while (B.primeiro() != null) {
            C.insere(B.primeiro());
            B.remove();
        }

        return C;
    }
}
