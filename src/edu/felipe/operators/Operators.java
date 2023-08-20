package edu.felipe.operators;

public class Operators {
    public static void main(String[] args) {
        char sexo = 'M';

        // date dtNascimento = new Date();

        String teste = "LINGUAGEM " + "JAVA";

        System.out.println(teste);

        String concatenacao = "?";

        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(concatenacao);
    }
}
