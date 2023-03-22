package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator {

    @Test
    public void eenPlusEen_geefTwee(){
        double a = 1;
        double b = 1.0;
        Calculator c = new Calculator(a,b);
        Assertions.assertEquals(c.getSum(),2.0);
    }

    public void eenPlusEen_isDrie_ikKijkDoorMijnVingersWantIkZieDitLieverNiet(){
        double a = 1.0;
        double b = 1;
        Calculator c = new Calculator(a,b);
        Assertions.assertEquals(c.getSum(),3);
    }
}
