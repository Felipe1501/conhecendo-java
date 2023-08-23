package edu.felipe.conditionalofstructures;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "F";

        switch(plano){
            case "T":{
                System.out.println("5GB YOUTUBE");
                break;
            }
            case "M":{
                System.out.println("WHATSAPP e INSTAGRAM GRÁTIS");
                break;
            }
            case "B":{
                System.out.println("100 MINS de LIGAÇÃO");
                break;
            }
            default:
                System.out.println("TENTE NOVAMENTE!");
        }
    }
}
