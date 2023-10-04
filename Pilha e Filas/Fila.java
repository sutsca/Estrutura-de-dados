public class Fila {
    public static final int MINIMO_DE_ELEMENTOS = 10;

    private int[] vet;
    private int fim;
    private int inicio;

    public Fila(){
        this(MINIMO_DE_ELEMENTOS);
    }
    public Fila(int qtos){
        if (qtos<MINIMO_DE_ELEMENTOS) qtos=MINIMO_DE_ELEMENTOS;

        vet = new int[qtos];
        this.fim = -1;
        this.inicio = -1;
    }

    public void enfileirar(int e) throws java.lang.Exception{
        if (cheia()) throw new Exception("OVERFLOW, fila cheia!");
        if (this.inicio == -1) this.inicio = 0;

        fim++; 
        if (fim==vet.length)
           fim = 0;

        // fim = ((fim+1) % vet.length)

        vet[fim] = e;
    }
    
    public int desenfileirar() throws java.lang.Exception{
        if (vazia()) throw new Exception("UNDERFLOW, fila vazia!");
    
        int elemento = vet[this.inicio];

        if (this.inicio ==  this.fim){  // tirando um elemento UNICO
            this.fim = this.inicio = -1;
        }
        else {        
            this.inicio = (inicio+1) % vet.length;  
        }

        return elemento;
    }

    public int consulta() throws java.lang.Exception{
        if (vazia()) throw new Exception("UNDERFLOW, fila vazia!");
    
        return vet[this.inicio];

    }
    public boolean cheia(){
        // conta pra achar a quantidade de elemento no vetor

        int qtosElementosCabem = vet.length;
        
        int qtosElementosTenhoAtualmente = 0;

        if (inicio!=-1){
            qtosElementosTenhoAtualmente = 
            (fim>inicio? fim-inicio : vet.length-inicio+fim);

            qtosElementosTenhoAtualmente++;
        }

        // if (fim>inicio)
        //     int qtosElementosTenhoAtualmente = fim-inicio   +1
        // else
        //     int qtosElementosTenhoAtualmente =  inicio-fim   +1

        return qtosElementosCabem == qtosElementosTenhoAtualmente;

    }
    public boolean vazia(){
        return this.inicio==-1;

    }
    public java.lang.String toString(){
        String retorno = "Proximo [ ";
        if (vazia())
            retorno += "<fila vazia> ";
        else
            retorno += vet[this.inicio] + " ";

        return retorno + "] ";
    }
}
