package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class ProgramAlturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("Digite o numero de pessoas a ser inseridas: ");
        int n = sc.nextInt();

        Pessoas [] lista = new Pessoas[n];

        for(int i = 0; i<lista.length; i++){
            System.out.println("Digite nome da "+(i+1)+"ª pessoa: ");
            String name = sc.nextLine();
            System.out.println("Idade: ");
            int age = sc.nextInt();
            System.out.println("Altura:");
            double idade = sc.nextDouble();

            lista[i] = new Pessoas(name, age, idade);
        }
        double media = 0;
        
        
        sc.close();
    }
}
