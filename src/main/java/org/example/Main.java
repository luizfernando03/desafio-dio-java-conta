package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o numero da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o nome do Cliente:  ");
        String nomeCliente =scanner.next();

        System.out.println("Por favor, digite o saldo da Conta:  ");
        double saldoConta = scanner.nextDouble();

        scanner.close();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldoConta +
                " já está disponível para saque.");
    }
}