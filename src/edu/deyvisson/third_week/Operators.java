package edu.deyvisson.third_week;
import java.lang.String;

public class Operators {
    public static void main(String[] args) {

//        int a,b;
//        a = 6;
//        b = 6;
//
//        System.out.println("Operadores tenários");
//        if (a==b){
//            System.out.println("Condição Verdadeira / Condition true");
//        }else{
//            System.out.println("Condição Falsa / Condition false");
//        }
//
//        String mensagem = a==b ? "condition true" : "contidion false" ;
//
//        System.out.println(mensagem);
//        System.out.println("Operadores tenários. FIM");
//
//        System.out.println("Operadores de comparação.");
//
//        int numberone, numbertwo;
//        numberone = 1;
//        numbertwo = 2;
//        boolean yesNo = numbertwo == numberone;
//
//        System.out.println("Condição: "+yesNo);
//
//        yesNo = numbertwo != numberone;
//        System.out.println("Condição: "+yesNo);
//
//      String name = "Deyvisson";
//        String namedois = "Deyvisson2";
//
//        System.out.println(name.equals(namedois));
//        boolean condition = name.equals(namedois);
//
//        name = condition == true ? "verdadeiro": "falso";
//      System.out.println(name);
//        System.out.println("Operadores de comparação. FIM");
//        System.out.println("Operadores Lógicos");

        boolean True = true;
        boolean False = true;

        if (True && (7>4) ){
            System.out.println("As duas são verdadeiras");
        }
        if (True || False) {
            System.out.println("Uma das condições é verdadeira: ");
            boolean mensagem = True || False;
            System.out.println(mensagem);
        }else{
            System.out.println("As duas são falsas");
        }
    }
}
