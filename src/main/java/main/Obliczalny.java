package main;

/**
* Interfejs pozwalający na oblczenie wartości obiektu będącego w wyrażeniu
*/

public interface Obliczalny
{
    /**
    * Metoda wylicza wartość danego obiektu klasy Symbol
     * @return Wyliczona wartość obiektu będąca typem double
     * @throws narzedzia.WyjątekONP Gdy nie da się wyliczyć wartości obiektu
    */
    double obliczWartosc () throws WyjatekONP;
}
