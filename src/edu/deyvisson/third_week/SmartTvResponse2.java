package edu.deyvisson.third_week;

import java.util.Scanner;

public class SmartTvResponse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartTvResponse tv = new SmartTvResponse();
        int opcao;

        do {
            System.out.println("\n--- Controle SmartTV ---");
            System.out.println("1 - Ligar/Desligar");
            System.out.println("2 - Aumentar Volume");
            System.out.println("3 - Diminuir Volume");
            System.out.println("4 - Aumentar Canal");
            System.out.println("5 - Diminuir Canal");
            System.out.println("6 - Selecionar Canal");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> tv.ligarDesligar();
                case 2 -> tv.aumentarVolume();
                case 3 -> tv.diminuirVolume();
                case 4 -> tv.aumentarCanal();
                case 5 -> tv.diminuirCanal();
                case 6 -> {
                    System.out.print("Digite o canal desejado: ");
                    int canal = sc.nextInt();
                    tv.selecionarCanal(canal);
                }
                case 0 -> System.out.println("Desligando SmartTV...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
    }

