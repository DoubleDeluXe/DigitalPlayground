package org.example.DaveLevi;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class A04RevisiePrimitiveTypes {
    @Test
    void primitiveTypes() {
        byte a = 12;
        short b = 52;
        int c = 23;
        long d = 5621;
        double e = 52.78;
        float f = 99;
        boolean g = true;
        char h = 'f';
    }

    @Test
    void stringRefference() {
        String s1 = "Dit is een string!";
        System.out.println(s1);

        //wat kan je doen met een variable waar een referece in zit?
        String s2 = s1.substring(7);

        assertThat(s2).isEqualTo("een string!");

        String s3 = s1.replace('e', 'a');
        System.out.println(s3);

        char s4 = s1.charAt(9);
        System.out.println(s4);
        assertThat(s4).isEqualTo('n');


        String s5 = s1.concat(" Dit is een toevoeging!");
        System.out.println(s5);
    }

    @Test
    void eenHandigeManierOmVeelVariablenTeDeclareren() {
        int leeftijd;     // een int declareren
        int[] leeftijden; // Een int Array declareren
        leeftijd = 10;
        System.out.println(leeftijd);
        leeftijden = new int[10];
        int leeftijdOpIndex = leeftijden[0];
        System.out.println(leeftijdOpIndex);
        leeftijden[0] = 74;
        leeftijden[1] = 26;
        leeftijden[2] = 43;
        leeftijden[3] = 84;
        leeftijden[4] = 19;
        leeftijden[5] = 22;
        leeftijden[6] = 31;
        leeftijden[7] = 78;
        leeftijden[8] = 27;
        leeftijden[9] = 77;
        int sum = 0;
        for (int j : leeftijden) {
            sum = sum + j;
        }
        System.out.println(sum);
    }
    @Test
    void eenNogHandigereManier() {
        int[] leeftijden = {74, 26, 43, 84, 19, 22, 31, 78, 27, 77};
        int sum = 0;
        for (int j = 0; j < leeftijden.length; j++) {
            sum = sum + j;
            System.out.println(leeftijden[j]);
        }
        System.out.println(sum);
    }

    @Test
    void HandigereForloopDeEnhancedForloop() {
        int[] leeftijden = {74, 26, 43, 84, 19, 22, 31, 78, 27, 77};
        int sum = 0;
        for (int j : leeftijden) {
            sum = sum + j;
        }
        System.out.println(sum);
    }

    @Test
    void hetMakenVanEenStriungArray() {
        String[] namen = {"Sjoerd","Sam","Majid","Changir","Rein","Dennis","Evan","Mike","Dave","Joshua"};
        Arrays.sort(namen);
        System.out.println(Arrays.toString(namen));
        Arrays.sort(namen, (a, b)->Integer.compare(a.length(), b.length()));
        System.out.println(Arrays.toString(namen));
    }

    @Test
    void namensorteerMachine() {
        boolean done = false;
        Scanner machine = new Scanner(System.in);
        while(done == false) {

        }
    }

}