package edu.felipe.typeofvariables;

public class TypeVariable {
    public static void main(String[] args) {
        float pi = 3.14F;

        long cpf = 43413319809L;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;

        short numeroCurto2 = (short) numeroNormal;
    }
}
