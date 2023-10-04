public class Pilha<T> {
    private T[] vet;
    private int topo;

    public Pilha(){
        this(10);
    }
    public Pilha(int qtos){
        if (qtos<10) qtos=10;
        vet = (T[]) new Object[qtos];
        topo = -1;
    }

    public void empilhar(T e) throws Exception{
        if (cheia()) throw new Exception("Overflow, pilha Cheia!");

        topo++;
        vet[topo] = e;
    }
    public T desempilhar() throws Exception{

        if (vazia()) throw new Exception("Underflow, pilha vazia!");

        T elemento = vet[topo];
        topo--;
        return elemento;

        //return vet[topo--];
    }
    public T  consulta() throws Exception{
        if (vazia()) throw new Exception("Underflow, pilha vazia!");
        return vet[topo];
    }

    public boolean cheia(){
        return topo==vet.length-1;
    }
    public boolean vazia() {
        return topo==-1;
    }

    public String toString(){
        String retorno="[ ";

        for (int i=0;i<=topo;i++){
            retorno += ((T)vet[i]) + " ";     // retorno = retorno+ vet[i]
        }

        return retorno + "] <= Topo";
    }
}
