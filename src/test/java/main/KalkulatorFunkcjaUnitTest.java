package main;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class KalkulatorFunkcjaUnitTest
{    
    
    @Test
    public void test1()
    {
        E e = new E();
        assertEquals(e.arnosc(), 0);
        assertThrows(WyjatekONP.class, () -> e.dodajArgument(0));
        assertEquals(e.obliczWartosc(), Math.E);
    }
    
    @Test
    public void test2()
    {
        Pi e = new Pi();
        assertEquals(e.arnosc(), 0);
        assertThrows(WyjatekONP.class, () -> e.dodajArgument(0));
        assertEquals(e.obliczWartosc(), Math.PI);
    }
    
    @Test
    public void test3() throws WyjatekONP
    {
        Abs e = new Abs();
        assertEquals(e.arnosc(), 1);
        e.dodajArgument(-27);
        assertThrows(WyjatekONP.class, () -> e.dodajArgument(0));
        assertEquals(e.obliczWartosc(), 27);
    }
    
    @Test
    public void test4() throws WyjatekONP
    {
        Sgn e = new Sgn();
        assertEquals(e.arnosc(), 1);
        e.dodajArgument(-27);
        assertThrows(WyjatekONP.class, () -> e.dodajArgument(0));
        assertEquals(e.obliczWartosc(), -1);
    }
    
    @Test
    public void test5() throws WyjatekONP
    {
        Floor e = new Floor();
        assertEquals(e.arnosc(), 1);
        e.dodajArgument(-27.3);
        assertThrows(WyjatekONP.class, () -> e.dodajArgument(0));
        assertEquals(e.obliczWartosc(), -28);
    }
    
    @Test
    public void test6() throws WyjatekONP
    {
        Ceil e = new Ceil();
        assertEquals(e.arnosc(), 1);
        e.dodajArgument(-27.3);
        assertThrows(WyjatekONP.class, () -> e.dodajArgument(0));
        assertEquals(e.obliczWartosc(), -27);
    }
    
    @Test
    public void test7() throws WyjatekONP
    {
        Frac e = new Frac();
        assertEquals(e.arnosc(), 1);
        e.dodajArgument(27.75);
        assertThrows(WyjatekONP.class, () -> e.dodajArgument(0));
        assertEquals(e.obliczWartosc(), 0.75);
    }
    
    @Test
    public void test8() throws WyjatekONP
    {
        Sin e = new Sin();
        assertEquals(e.arnosc(), 1);
        e.dodajArgument(Math.PI/2);
        assertThrows(WyjatekONP.class, () -> e.dodajArgument(0));
        assertEquals(e.obliczWartosc(), 1);
    }
    
    @Test
    public void test9() throws WyjatekONP
    {
        Cos e = new Cos();
        assertEquals(e.arnosc(), 1);
        e.dodajArgument(0);
        assertThrows(WyjatekONP.class, () -> e.dodajArgument(0));
        assertEquals(e.obliczWartosc(), 1);
    }
    
    @Test
    public void test10() throws WyjatekONP
    {
        Ln e = new Ln();
        assertEquals(e.arnosc(), 1);
        e.dodajArgument(Math.E);
        assertThrows(WyjatekONP.class, () -> e.dodajArgument(0));
        assertEquals(e.obliczWartosc(), 1);
    }
    
    @Test
    public void test11() throws WyjatekONP
    {
        Exp e = new Exp();
        assertEquals(e.arnosc(), 1);
        e.dodajArgument(2);
        assertThrows(WyjatekONP.class, () -> e.dodajArgument(0));
        assertEquals(e.obliczWartosc(), Math.exp(2));
    }
    
    @Test
    public void test12() throws WyjatekONP
    {
        Dodaj e = new Dodaj();
        assertEquals(e.arnosc(), 2);
        e.dodajArgument(5);
        e.dodajArgument(10);
        assertThrows(WyjatekONP.class, () -> e.dodajArgument(0));
        assertEquals(e.obliczWartosc(), 15);
    }
    
    @Test
    public void test13() throws WyjatekONP
    {
        Odejmij e = new Odejmij();
        assertEquals(e.arnosc(), 2);
        e.dodajArgument(5);
        e.dodajArgument(10);
        assertThrows(WyjatekONP.class, () -> e.dodajArgument(0));
        assertEquals(e.obliczWartosc(), -5);
    }
    
    @Test
    public void test14() throws WyjatekONP
    {
        Pomnoz e = new Pomnoz();
        assertEquals(e.arnosc(), 2);
        e.dodajArgument(5);
        e.dodajArgument(10);
        assertThrows(WyjatekONP.class, () -> e.dodajArgument(0));
        assertEquals(e.obliczWartosc(), 50);
    }
    
    @Test
    public void test15() throws WyjatekONP
    {
        Podziel e = new Podziel();
        assertEquals(e.arnosc(), 2);
        e.dodajArgument(5);
        e.dodajArgument(10);
        assertThrows(WyjatekONP.class, () -> e.dodajArgument(0));
        assertEquals(e.obliczWartosc(), 0.5);
    }
    
    @Test
    public void test16() throws WyjatekONP
    {
        Min e = new Min();
        assertEquals(e.arnosc(), 2);
        e.dodajArgument(5);
        e.dodajArgument(10);
        assertThrows(WyjatekONP.class, () -> e.dodajArgument(0));
        assertEquals(e.obliczWartosc(), 5);
    }
    
    @Test
    public void test17() throws WyjatekONP
    {
        Max e = new Max();
        assertEquals(e.arnosc(), 2);
        e.dodajArgument(5);
        e.dodajArgument(10);
        assertThrows(WyjatekONP.class, () -> e.dodajArgument(0));
        assertEquals(e.obliczWartosc(), 10);
    }
    
    @Test
    public void test18() throws WyjatekONP
    {
        Log e = new Log();
        assertEquals(e.arnosc(), 2);
        e.dodajArgument(2);
        e.dodajArgument(64);
        assertThrows(WyjatekONP.class, () -> e.dodajArgument(0));
        assertEquals(e.obliczWartosc(), 6);
    }
    
    @Test
    public void test19() throws WyjatekONP
    {
        Pow e = new Pow();
        assertEquals(e.arnosc(), 2);
        e.dodajArgument(3);
        e.dodajArgument(5);
        assertThrows(WyjatekONP.class, () -> e.dodajArgument(0));
        assertEquals(e.obliczWartosc(), 243);
    }
}
