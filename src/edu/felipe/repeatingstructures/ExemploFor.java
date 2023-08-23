package edu.felipe.repeatingstructures;

public class ExemploFor {
    public static void main(String[] args) {
        for( int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
            System.out.println("Contando Carneirinhos " + carneirinhos);
        }

        String alunos[] = {"FELIPE", "YURI ALBERTO", "MATIAS ROJAS"};

        for(int x=0; x<alunos.length; x++){
            System.out.println("O Aluno no índice x= " + x + " é " + alunos[x]);
        }

        //forma abreviada
        for(String aluno : alunos){
            System.out.println(aluno);
        }
    }
}
