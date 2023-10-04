public class Expressao {
    public static boolean temPrioridade(char a, char b){
        return false;
        // a b -> return

        // + + -> false;
        // + - -> false;
        // + * -> false;
        // + / -> false;

        // - + -> false;
        // - - -> false;
        // - * -> false;
        // - / -> false;

        // * + -> true;
        // * - -> true;
        // * * -> false;
        // * / -> false;

        // / + -> true;
        // / - -> true;
        // / * -> false;
        // / / -> false;

    }

    public static String posfixa(String expressaoEmLetras){
        String expressaoPosFixas="";

        // for (percorrer a expressao)
        //     if (Expre.charAt é letra)
        //         a letra vai pra expressao
        //     else

        //     if (Expressao.temPrioridade(Expre.charAt(i),operacoes.consulta()))     
        //             empilhar da expressa
        //     else 
        //         desempilhar e mandar o da pilha pra expressao
        


        return expressaoPosFixas;
    }

    public static double resolvePosFixa(String expressaoPosFixa, Fila numeros){
        return 0.0;
    }

    public static Fila extrairNumeros(String e)throws Exception{
        Fila Numeros = new Fila();
        String valor ="";

        for(int i=0; i<e.length() ;i++)
            if ("1234567890".indexOf(e.charAt(i))==-1){
                Numeros.enfileirar(Integer.parseInt(valor));
                valor = "";
            }else
                valor += e.charAt(i);

        Numeros.enfileirar(Integer.parseInt(valor));

        return Numeros;

    }
    public static String expressaoEmLetras(String e)throws Exception{
        String emLetras="";
        char letras='A';
        for(int i=0; i<e.length() ;i++)
            if ("1234567890".indexOf(e.charAt(i))==-1){
                emLetras += letras;
                emLetras += e.charAt(i);
                letras++;
            }
        return emLetras+letras;

    }
}
