package org.example.DaveLevi;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class A02Tafels {
    @Test
    void tafel() {
        Scanner eye = new Scanner(System.in);
        System.out.println("Welke tafel wil je zien?");
        int tafelNummer = eye.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.printf("%4d", i * tafelNummer);
        }
    }

    @Test
    void createDriehoek() {
        Scanner eye = new Scanner(System.in);
        System.out.println("Hoe groot mag de driehoek worden?");
        int groei = eye.nextInt();
        assertThat(groei).isInstanceOf(Integer.class);
        System.out.println("Goed! ik ga een driehoek maken die " + groei + " lijnen groot is!");
        blanco();
        startDriehoek(groei);
        eindeDriehoek(groei-1);
        blanco();
        System.out.println("Ziedaar! Uw driehoek!");
    }

    void blanco() {
        System.out.println();
    }

    void eindeDriehoek(int rijen) {
        int x = 1;
        while (x <= rijen) {
            driehoek(rijen);
            rijen = rijen - 1;
        }
    }

    void startDriehoek(int rijen) {
        int x = 1;
        while (x <= rijen) {
            driehoek(x);
            x++;
        }
    }

    void driehoek(int x) {
        int n = 1;
        while (n <= x) {
            System.out.print("♠ ");
            x = x - 1;
        }
        blanco();
    }

    @Test
    void maakTafelsvantot() {
        int begin = vraagTafel("begin tafel");
        int einde = vraagTafel("eind tafel");
        maakTafelOverzicht(begin, einde);
    }

    void maakTafelOverzicht(int begin, int einde) {
        for(int i = begin; i <= einde; i++){
            printTafelVan(i);
            System.out.println();
        }
    }

    void printTafelVan(int tafel){
        for (int x = 1; x < 11; x++) {
            System.out.println(x + " * " + tafel + " = " + x * tafel);
        }
    }

    int vraagTafel(String text) {
        Scanner eye = new Scanner(System.in);
        System.out.println("Geef waarde " + text + " op");
        int tafel = eye.nextInt();
        System.out.println("De begin tafel is: " + tafel);
        return tafel;
    }
}
