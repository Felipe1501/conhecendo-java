package edu.felipe.scanner;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        //imprimindo na tela
        //https://felipe-silva-aguiar.gitbook.io/dio-java/gitbook/summary
        System.out.println("Hello fi, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade);
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
