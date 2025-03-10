package edu.deyvisson.fourth_week;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public int numeroConta;
    public String agencia, nomeCliente;
    public Double saldo;

    public void criarConta() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Seja bem-vindo ao Banco x");

        System.out.println("por favor,digite o número da sua conta: ");
        numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Agora digite o número da sua Agência:");
        agencia = sc.nextLine();

        System.out.println("Digite o seu nome:");
        nomeCliente = sc.nextLine();

        System.out.println("Digite o valor que deseja depositar:");
        saldo = sc.nextDouble();
        sc.close();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }

    ;

}
