package tde1;

public class Fila{
    private Node Fila;

    public Fila(){
        this.Fila = null;
    }

    public void insere(int informacao){
        Node no = new Node();
        no.setInformacao(informacao);

        Node atual = Fila;

        if (atual == null){
            Fila = no;
        }
        else{
            while(atual.getProximo()!=null){
                atual = atual.getProximo();
            }
            atual.setProximo(no);
        }

    }

    public void imprime(){
        Node atual = Fila;
        while (atual != null) {
            System.out.print(atual.getInformacao()+ " -> ");
            atual= atual.getProximo();
        }
        System.out.println("Null");


    }

    public void remove(){
        Node atual = Fila;
        Node prox = atual.getProximo();

        Fila = prox;
        System.out.print("removido = " + atual.getInformacao() +"\n");
    }

    public Integer primeiro(){
        if (Fila == null){
            return null;
        }
        else{
            return Fila.getInformacao();
        }
    }
}
