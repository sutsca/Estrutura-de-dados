import java.util.Random;
import java.util.Scanner;

class Principal{
    public static void main(String[] args) throws Exception{
        
        Scanner teclado = new Scanner(System.in);
        String expressao ="";

        if (args.length>0)
             expressao = args[0];
        else {
            System.out.print ("Expressao? ");
            expressao = teclado.nextLine();
        }
       
        Fila Numeros = Expressao.extrairNumeros(expressao);
        String ExpEmLetras = Expressao.expressaoEmLetras(expressao);

        String ExpPosFixa = Expressao.posfixa(ExpEmLetras);
        double resultado = Expressao.resolvePosFixa(ExpPosFixa, Numeros);

        System.out.println("Expressao: " + ExpEmLetras);
        System.out.println("Expressao PosFixa: " + ExpPosFixa);
        System.out.println("Fila de Numeros");
        while (!Numeros.vazia())
            System.out.print(Numeros.desenfileirar());
        System.out.println();    
        System.out.println("Resulado Final " + resultado);


    }

}