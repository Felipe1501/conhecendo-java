package edu.felipe.trycatch;

public class FormatCepExample {
    public static void main(String[] args) {
        try {
            String cepFormat = formatarCep("2376504");
            System.out.println(cepFormat);
        } catch (CepInvalidException e) {
            // TODO Auto-generated catch block
            System.out.println("O CEP não corresponde com as regras do negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidException{
        if(cep.length() != 8)
        throw new CepInvalidException();


        //simulando cep formatado
        return "23.765-064";
    }
}
