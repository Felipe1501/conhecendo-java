package edu.felipe.operators;

public class Operators {
    public static void main(String[] args) {
        char sexo = 'M';

        // date dtNascimento = new Date();

        String teste = "LINGUAGEM " + "JAVA";

        // System.out.println(teste);

        // String concatenacao = "?";

        // System.out.println(concatenacao);

        // concatenacao = 1 + 1 + 1 + "1";

        // System.out.println(concatenacao);

        // concatenacao = 1 + "1" + 1 + 1;

        // System.out.println(concatenacao);

        // concatenacao = 1 + "1" + 1 + "1";

        // System.out.println(concatenacao);

        // concatenacao = "1" + 1 + 1 + 1;

        // System.out.println(concatenacao);

        // concatenacao = "1" + (1 + 1 + 1);

        // System.out.println(concatenacao);

        int numero = 1501;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        numero++;

        System.out.println(numero);

        numero--;

        System.out.println(--numero);

        boolean verdade = true;

        System.out.println(!verdade);

        int a ,b;

        a = 5;
        b = 5;

        String resultado = a == b ? "VERDADEIRO" : "FALSO";

        System.out.println(resultado);

        String nm1 = "Felipe";
        String nm2 = new String("Yuri Alberto");

        System.out.println(nm1 == nm2);
    }
}
