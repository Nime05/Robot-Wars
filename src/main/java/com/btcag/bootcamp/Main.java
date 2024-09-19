package com.btcag.bootcamp;

import java.util.Scanner;

import static com.btcag.bootcamp.Clear.clear;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib bitte deinen Spielernamen ein: ");
        String nametag = scanner.nextLine();

        clear();

        System.out.println("Herzlich Willkommen bei Robot Wars! \n"+nametag);

        System.out.println("Benenne nun deinen Roboter: ");
        String botname = scanner.nextLine();

        System.out.println("\nWenn du das Spiel starten möchtest tippe '1'!");
        Long gamestart = scanner.nextLong();

        if (gamestart == 1)
        {
            clear();

            int breite = 15;
            int höhe = 10;

            for (int y = 0; y < höhe; y++) {
                for (int x = 0; x < breite; x++) {

                    System.out.print("[ ]");
                }
                System.out.println();
            }
        }
    }
}

