public class Classes {
    public static void main(String[] args) {

        final String BR = "Brasil";

        int ano = 2023;

        System.out.println(BR);
        System.out.println(ano);

        ano = 2024;

        System.out.println(ano);

        String primeiroNm = "Felipe";
        String segundoNm = "Barbosa dos Santos";

        String nomeCompleto = nomeCompleto (primeiroNm, segundoNm);
        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto(String primeiroNm, String segundoNm){

     return "Resultado do Método " + primeiroNm.concat(" ").concat(segundoNm); 

    }
}
