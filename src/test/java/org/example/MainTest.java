package org.example;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.PackageUtils;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void return5_whenSumGets3And2() {
        //GIVEN
        int a = 3;
        int b = 2;
        // WHEN
        int actual = Main.calcSum(a,b);
        //THEN
        int expected = 5;
        assertEquals( expected, actual );
    }

    @Test
    void returnFalse_whenIsEven_getsOddValue() {
        //GIVEN
        int a = 3;
        // WHEN
        boolean actual = Main.isEven( a );
        //THEN
        boolean expected = false;
        assertFalse( actual );
    }
    @Test
    void return_calc_Value() {
        //GIVEN
        int a = 3;
        int b = 2;
        // WHEN
        int actual = Main.calc(a,b);
        //THEN
        int expected = 6;
        assertEquals( expected, actual );
    }
}