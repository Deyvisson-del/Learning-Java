package edu.deyvisson.third_week;

import java.util.Scanner;

public class SmartTvExercise {


    public void ligarTv(){
        Scanner sc = new Scanner(System.in);
        int status;
        System.out.println("A SmartTv está desligada\n digite 1 para ligar:");
        status = sc.nextInt();
        String mensagem = (status==1) ?"SmartTv ligada":"SmartTv desligada";
        System.out.println(mensagem);
    }

    public void volume(){
        Scanner sc = new Scanner(System.in);
//        int volume = 0;
//        volume = sc.nextInt();

//        for (int i =1; i<=100; i++) {
//            System.out.println("O volume da SmartTV: " +i);
//            System.out.println("1-Aumentar volume\n2-diminuir volume\n3-sair");
//            System.out.println("O volume atual da SmartTV: " +i+"\n");
//        }
        boolean status = true;
        int volume;
        volume = 0;

        while (status==true){
            System.out.println("O volume: "+volume);
            int contidion;
            System.out.println("Digite 1 para aumentar\nDigite 2 para diminuir\nDigite 3 para sair\nEscolha:");
            contidion = sc.nextInt();

            if (contidion==1){
                volume++;
                System.out.println("Volume: "+volume);
                status=true;
                continue;
            } else if (contidion==2) {
                volume--;
                System.out.println("Volume: "+volume);
                status=true;
                continue;
            } else if (contidion==3) {
                status=false;
                break;
            }

            sc.close();
        }

    }

    public void selecionarCanal(){
        Scanner sc = new Scanner(System.in);
        int canal = 0;
        System.out.println("O canal da SmartTV: " +canal);
        System.out.println("Digite o canal que você deseja:");
        canal = sc.nextInt();
        sc.close();
        System.out.println("O volume atual da SmartTV: " +canal);
    }


    public void controleSmartTv(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Controle Smartv:\n 1-Ligar/desligar\n 2-Aumentar/Diminuir volume\n 3-Selecionar canal\n 0-sair\n Digite uma opção:");
        int escolha;
        escolha = sc.nextInt();

        if (escolha==1){
            ligarTv();
        }else if (escolha==2){
            volume();
        } else if (escolha==3) {
            selecionarCanal();
        } else if (escolha==0) {
            System.out.println("Finalizando programa...");
        } else {
            System.err.println("Nenhuma escolha selecionada/ escolha inválida");
        }
    };


    public static void main(String[] args) {
        SmartTvExercise tv = new SmartTvExercise();
        Scanner sc = new Scanner(System.in);

        tv.controleSmartTv();

    }
}
