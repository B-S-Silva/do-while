package com.mycompany.mavenproject4;
import java.util.Scanner;
public class Mavenproject4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senhacerta = 2222;
        int senhainformada;
        do {
            System.out.print ("digite sua senha");
            senhainformada = scanner.nextInt();
            if (senhainformada != senhacerta) {
            System.out.println("senha incorreta. tente novamente");
           }
        } 
        while (senhainformada != senhacerta);
        System.out.println("senha correta, bem vindo");
        scanner.close();
        }
    }
