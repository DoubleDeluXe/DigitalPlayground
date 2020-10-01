package org.example.DaveLevi;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class A01PrimitiveTypes {
    @Test
//Annotatie
    void voorbeeldVanLineComments() {
        //Line comment 1
        //Line comment 2
    }

    @Test
    void voorbeeldVanEenBlockComment() {
        /*
         Onberperkt aantal regels commentaar opnemen
         */
    }

    @Test
    void voorbeeldVanTekstWegschrijvenNaarDeConsole() {
        System.out.println("Hello Java!");
    }

    @Test
    void experimentMetEenByteVariabele() {
        byte leeftijdCategory1 = 100;
        byte leeftijdIncrement = 10;
    }

    @Test
    void experimentMetEenByteCast() {
        byte leeftijdCategory1 = 100;
        byte leeftijdIncrement = 10;
        byte leeftijdCategory2 = (byte) (leeftijdCategory1 + leeftijdIncrement);
        System.out.println(leeftijdCategory2);
    }

    @Test/* Ghandi bug alike */
    void experimentMetEenOptellingPlusVerrassing() {
        byte leeftijdCategory1 = 127;
        byte leeftijdIncrement = 1;
        byte leeftijdCategory2 = (byte) (leeftijdCategory1 + leeftijdIncrement);
        System.out.println(leeftijdCategory2);
    }

    @Test/* Ghandi bug alike */
    void experimentMetInts() {
        int leeftijdCategory1 = 127;
        int leeftijdIncrement = 1;
        int leeftijdCategory2 =leeftijdCategory1 + leeftijdIncrement;
        System.out.println(leeftijdCategory2);
    }

    @Test/* Ghandi bug alike */
    void experimentMetIntsDelenDoorNulLevertEenArithmeticException() {
        int leeftijdCategory1 = 127;
        int leeftijdIncrement = 0;
        int leeftijdCategory2 =leeftijdCategory1 / leeftijdIncrement;
        System.out.println(leeftijdCategory2);
    }
    @Test/* Ghandi bug alike */
    void experimentMetLongs() {
        long leeftijdCategory1 = 127L;
        long leeftijdIncrement = 1L;
        long leeftijdCategory2 =leeftijdCategory1 + leeftijdIncrement;
        System.out.println(leeftijdCategory2);
    }

    @Test
    void experimenteerBijRekenenMetFloatingPointsZulJeHeelVaakPrecisieVerliezen(){
        double doubleVariabele1 = 1.033;
        double doubleVariabele2 = 0.033;
        double difference = doubleVariabele1 - doubleVariabele2;
        boolean isGelijk = difference == 1.0;
        Offset<Double> offset = Offset.offset(1.0E-2);
        assertThat(difference).isCloseTo(1.0,offset);
    }

    @Test
    void doublesDoenMeerRareDingen() {
        double doubleVariabele1 = 1.033;
        double doubleVariabele2 = 0.0;
        double quotient = doubleVariabele1/doubleVariabele2;
        System.out.println(quotient == Double.POSITIVE_INFINITY);
    }

    @Test
    void doublesDoenNogMeerRareDingen() {
        double doubleVariabele1 = 0.0;
        double doubleVariabele2 = 0.0;
        double nan = Double.NaN;
        double infinity = Double.POSITIVE_INFINITY;
        double quotient = doubleVariabele1/doubleVariabele2;
        System.out.println(quotient );
    }

    @Test
    void geldigeBooleanValues() {
        boolean waar = true;
        boolean onwaar = false;
        boolean firstValueIsGreater = 9 == 1; // is gelijk aan operator ==
        System.out.println(firstValueIsGreater);
    }

    @Test
    void eenExperimentMetHetCharType() {
        byte b1 = 1;
        char char1 = 'a';
        char char2 = 'b';
        //Zeldzaam + operator
        System.out.println("z" + char1 + char2);
        System.out.println(char1 + char2 + "z");

        //plakken
        System.out.println("" + char1 + char2);
    }
}
