package edu.deyvisson.third_week;

import java.util.Scanner;

public class SmartTvResponse {
    private boolean ligada;
    private int volume;
    private int canal;

    public SmartTvResponse() {
        this.ligada = false;
        this.volume = 10;
        this.canal = 1;
    }

    public void ligarDesligar() {
        ligada = !ligada;
        System.out.println(ligada ? "SmartTv ligada" : "SmartTv desligada");
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Volume no máximo ou TV desligada.");
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            volume--;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Volume no mínimo ou TV desligada.");
        }
    }

    public void aumentarCanal() {
        if (ligada) {
            canal++;
            System.out.println("Canal: " + canal);
        }
    }

    public void diminuirCanal() {
        if (ligada && canal > 1) {
            canal--;
            System.out.println("Canal: " + canal);
        }
    }

    public void selecionarCanal(int novoCanal) {
        if (ligada && novoCanal > 0) {
            canal = novoCanal;
            System.out.println("Canal alterado para: " + canal);
        }
    }

    public boolean isLigada() {
        return ligada;
    }
}

