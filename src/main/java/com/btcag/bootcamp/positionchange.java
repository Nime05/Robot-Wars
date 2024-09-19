package com.btcag.bootcamp;

import java.util.Scanner;


public class positionchange {

     public static int[] positionchange(Scanner scanner, int currentx, int currenty) {
        System.out.println("Tippe '2' um die Position zu verändern.");
        Long positionchange = scanner.nextLong();

        if (positionchange == 2) {
            System.out.println("X-Koordinate eingeben (1-15): ");
            int newx = scanner.nextInt();
            System.out.println("Y-Koordinate eingeben (1-15): ");
            int newy = scanner.nextInt();
            if (newx > 15 || newy > 11)
            {
                System.out.println("Deine Angaben sind nicht gültig! Bitte erneut versuchen.");
                
            }
            return new int[]{newx, newy};
        }
        return new int[]{currentx, currenty};
    }
}


