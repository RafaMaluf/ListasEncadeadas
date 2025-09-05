package tde1;

public class Pilha{
    private Node Pilha;

    public Pilha(){
        this.Pilha = null;
    }

    public void insere(int informacao){
        Node no = new Node();
        no.setInformacao(informacao);

        Node atual = Pilha;

        if (atual == null){
            Pilha = no;
        }
        else{
            while(atual.getProximo()!=null){
                atual = atual.getProximo();
            }
            atual.setProximo(no);
        }

    }

    public void imprime(){
        Node atual = Pilha;
        while (atual != null) {
            System.out.print(atual.getInformacao()+ " -> ");
            atual= atual.getProximo();
        }
        System.out.println("Null");


    }

    public void remove(){
        Node atual = Pilha;
        Node anterior = atual;

        while(atual.getProximo()!= null){
            anterior = atual;
            atual = atual.getProximo();
        }

        System.out.print("removido = " + atual.getInformacao() +"\n");
        anterior.setProximo(null);

    }
}
