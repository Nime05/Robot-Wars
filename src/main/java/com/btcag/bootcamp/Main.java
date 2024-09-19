package com.btcag.bootcamp;

import java.util.Scanner;

import static com.btcag.bootcamp.Clear.clear;
import static com.btcag.bootcamp.positionchange.positionchange;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib bitte deinen Spielernamen ein: ");
        String nametag = scanner.nextLine();

        clear();

        System.out.println("Herzlich Willkommen bei Robot Wars! \n"+nametag);

        System.out.println("Benenne nun deinen Roboter: ");
        String botname = scanner.nextLine();

        System.out.println("\nStartposition: ");
        System.out.println("X-Koordinate eingeben (1-15): ");
        int robotx = scanner.nextInt();
        System.out.println("Y-Koordinate eingeben (1-10): ");
        int roboty = scanner.nextInt();

        System.out.println("\nWenn du das Spiel starten möchtest tippe '1'!");
        Long gamestart = scanner.nextLong();


        if (gamestart == 1)
        {
            clear();

            int breite = 16;
            int höhe = 11;


            while (true) {
                clear();
                for (int y = 1; y < höhe; y++) {
                    for (int x = 1; x < breite; x++) {
                        if (x == robotx && y == roboty) {
                            System.out.print("[ X ]");
                        } else {
                            System.out.print("[   ]");
                        }
                    }
                    System.out.println();
                }
                System.out.println("X: " + robotx + "   Y: " + roboty);

                int[] newposition = positionchange(scanner, robotx, roboty);
                robotx = newposition[0];
                roboty = newposition[1];
            }
        }
    }
}

