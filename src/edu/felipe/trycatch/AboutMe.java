package edu.felipe.trycatch;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {

        try{
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
        catch(InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numéricos");
        }

        
    }
}
