import java.util.Stack;

public class Expressao {
    public static boolean temPrioridade(char a, char b){

        //Notas
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

        if ((a == '*' || a == '/') && (b == '+' || b == '-')) {
            return true;
        } else {
            return false; 
        }
        



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

        Stack<Character> operacoes = new Stack<>();

    for (int i = 0; i < expressaoEmLetras.length(); i++) {
        char caractere = expressaoEmLetras.charAt(i);

        if (Character.isLetter(caractere)) {
            // Se o caractere for uma letra, adicione-o à expressão pós-fixa
            expressaoPosFixas += caractere;
        } else {
            // Se o caractere for um operador
            while (!operacoes.isEmpty() && temPrioridade(operacoes.peek(), caractere)) {
                // Verifica se o operador no topo da pilha tem prioridade sobre o operador atual
                expressaoPosFixas += operacoes.pop();
            }
            // Empilhe o operador atual
            operacoes.push(caractere);
        }
    }

    // Desempilhe qualquer operador restante e adicione-o à expressão pós-fixa
    while (!operacoes.isEmpty()) {
        expressaoPosFixas += operacoes.pop();
    }

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
