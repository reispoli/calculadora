package org.example;

import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double numeroum;
        double numerodois;

        String operacao;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        numeroum = scanner.nextDouble();

        System.out.println("Digite o segundo número");
        numerodois = scanner.nextDouble();

        System.out.println("Digite a operação");
        operacao = scanner.next();

        double valor;
        if(Objects.equals(operacao, "+")){
           valor = numeroum + numerodois;
        }
        else if (Objects.equals(operacao, "-")){
            valor = numeroum - numerodois;
        }
        else if (Objects.equals(operacao, "/")){
            valor = numeroum / numerodois;
        }
        else if (Objects.equals(operacao, "*")){
            valor = numeroum * numerodois;
        }
        else{
            System.out.println("Operação Invalida");
            return;
        }
        System.out.println("Resultado: "+valor);

    }
}