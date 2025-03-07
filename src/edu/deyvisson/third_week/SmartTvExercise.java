package edu.deyvisson.third_week;

import java.util.Scanner;
/*
<h1>SmartTvExercise</h1>
@author Deyvisson Rafael
@version 2.1

 */
public class SmartTvExercise {

    //My coding SmartTv
    public void ligarTv(){
        Scanner sc = new Scanner(System.in);
        int status;
        System.out.println("A SmartTv está desligada\n digite 1 para ligar:");
        status = sc.nextInt();
        String mensagem = (status==1) ?"SmartTv ligada":"SmartTv desligada";
        System.out.println(mensagem);
        sc.close();
        controleSmartTv();
    }

    public void volume(){
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        int volume,atualVolume,contidion;

        volume = 0;

        while (true){

            System.out.println("O volume: "+volume+"\nDigite 1 para aumentar\nDigite 2 para diminuir\nDigite 3 para sair\nEscolha:");
            contidion = sc.nextInt();

            if (contidion==1){
                atualVolume = volume++;
                System.out.println("Volume: "+atualVolume);
                status=true;
                continue;

            } else if (contidion==2) {
                volume--;
                System.out.println("Volume: "+volume);
                status=true;
                continue;

            } else if (contidion==3) {
                status=false;
                controleSmartTv();
                break;

            }else{
                System.err.println("Opção inválida");
                continue;
            }
        }
        sc.close();

    }

    public void selecionarCanal(){
        Scanner sc = new Scanner(System.in);
        int contidion,canal;
        boolean status = true;
        canal =0;

        while (true){
            System.out.println("O canal: "+canal+
                    "\nDigite 1 para +1 canal" +
                    "\nDigite 2 para -1 canal" +
                    "\nDigite 3 para selecionar o canal desejado"+
                    "\nDigite 4 para sair" +
                    "\nEscolha:");
            contidion = sc.nextInt();

            if (contidion==1){
                canal++;

            } else if (contidion==2) {
                canal--;

            } else if (contidion==3) {
                System.out.println("Digite o canal desejado: ");
                canal = sc.nextInt();

            } else if (contidion==4) {
                controleSmartTv();
                break;

            }else{
                System.err.println("Opção inválida");
                continue;
            }
        }
        sc.close();
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
            System.err.println("Nenhuma escolha selecionada\nou\nescolha inválida");
            controleSmartTv();
        }
    };


    public static void main(String[] args) {
        SmartTvExercise tv = new SmartTvExercise();
        tv.controleSmartTv();
    }
}
