package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperationInterf operation = new AtmOperationImpl();

        int carta = 123;
        int codice = 123;

        Scanner input = new Scanner(System.in);
        System.out.print("ATM ti da il benvenuto!!\n");
        System.out.print("Credenziali: 123\n");

        int numeroCarta = 0;
        int codiceCarta = 0;

        try {
            System.out.print("Inserire numero carta: ");
            numeroCarta = input.nextInt();

            System.out.print("Inserire codice carta: ");
            codiceCarta = input.nextInt();
        } catch (Exception e) {
            System.out.println("Nessun numero è stato inserito.");
        }


        if ((carta == numeroCarta) && (codice == codiceCarta)) {
            while (true) {
                System.out.println("\n1) Guarda il saldo disponibile \n2) Effettuare un prelievo \n3) Effettuare un deposito \n4) Registro ultime transazioni \n0) Non voglio effettuare altre operazioni");
                System.out.print("\nInserire numero corrispondente alla propria scelta: ");
                int scelta = input.nextInt();

                switch (scelta){
                    case 0: {
                        System.out.println("\nRitira la tua carta. \nGrazie di aver scelto questo ATM.");
                        return;
                    }
                    case 1: {
                        operation.visualizzaSaldo();
                        break;
                    }
                    case 2: {
                        System.out.print("\nInserire la somma di denaro che si desidera prelevare: ");
                        double prelievo = input.nextDouble();
                        operation.prelievo(prelievo);
                        break;
                    }
                    case 3: {
                        System.out.print("\nInserire la somma di denaro che si desidera depositare: ");
                        double deposito = input.nextDouble();
                        operation.deposito(deposito);
                        break;
                    }
                    case 4: {
                        operation.transazioniRecenti();
                        break;
                    }
                    default: {
                        System.out.println("\nIl numero inserito non corrisponde con i servizi disponibili.");
                        break;
                    }
                }
            }
        } else {
            System.out.println("\nIl numero o il codice della carta sono errati.");
            System.exit(0);
        }
    }
}