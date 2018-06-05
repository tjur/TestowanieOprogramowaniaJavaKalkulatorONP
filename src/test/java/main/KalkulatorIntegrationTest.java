package main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class KalkulatorIntegrationTest
{
    @Test
    public void test1() throws WyjatekONP
    {
        assertEquals(Kalkulator.calc("2 2 +"), 4);
    }
    
    @Test
    public void test2() throws WyjatekONP
    {
        assertEquals(Kalkulator.calc("2 3 + 5 *"), 25);
    }
    
    @Test
    public void test3() throws WyjatekONP
    {
        assertEquals(Kalkulator.calc("2 7 + 3 / 14 3 - 4 * + 2 /"), 23.5);
    }
    
    @Test
    public void test4() throws WyjatekONP
    {
        assertEquals(Kalkulator.calc("12 2 3 4 * 10 5 / + * +"), 40);
    }
    
    @Test
    public void test5() throws WyjatekONP
    {
        assertEquals(Kalkulator.calc("15 7 1 1 + - / 3 * 2 1 1 + + -"), 5);
    }
}
