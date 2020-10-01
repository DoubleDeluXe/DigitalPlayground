package org.example.DaveLevi;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class A03Driehoek {

    @Test
    void DriehoekBouwer(){
        Scanner eye = new Scanner(System.in);
        System.out.println("Hallo! Waar mag de driehoek naar wijzen? boven / onder / links / rechts?");
        String direction = eye.nextLine();
    }
}
