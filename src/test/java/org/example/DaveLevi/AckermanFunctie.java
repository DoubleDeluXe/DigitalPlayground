package org.example.DaveLevi;

import org.junit.jupiter.api.Test;

public class AckermanFunctie {

    @Test
    void ackermannTest() {
        System.out.println(ack(4,3));
    }

    public static long ack(long m, long n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return ack(m - 1, ack(m, n - 1));
        } else {
            return 233;
        }
    }
}