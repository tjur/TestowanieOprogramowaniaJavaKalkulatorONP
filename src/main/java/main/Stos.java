package main;
 
/**
 *Klasa implementująca stos elemetów typu Węzeł
 * @author Tomasz Jurkiewicz
 */
public class Stos 
{
    /**
     * Referencja do szczytu elementu na szczycie stosu
     */
    private Węzeł start;
    /**
     * Liczba elementów znajdujących się na stosie
     */
    private int rozmiar;

    Stos()
    {
        start = null;
    }
    
    /**
     * Wkłada element na szczyt stosu
     * @param x Element typu double wkładany na szczyt stosu
     */
    public void push(double x)
    {
        Węzeł temp = new Węzeł(x,start);
        start=temp;
        rozmiar++;
    }
    
    /**
     * Usuwa element ze szczytu stosu i go zwraca
     * @return Element typu double będący na szczycie stosu
     * @throws ONP_PustyStos Gdy metoda jest wywoływana na pustym stosie
     */
    public double pop() throws ONP_PustyStos
    {
        if(start!=null)
        {
            Węzeł temp = start;
            start = start.next;
            rozmiar--;
            return temp.wartosc;          
        } 
        else 
            throw new ONP_PustyStos("Pusty stos!");
    }
    
    /**
     * Zwraca liczbę elementów będących na stosie
     * @return Liczba elementów na stosie
     */
    public int rozmiar()
    {
        return rozmiar;
    }
    
    /**
     * KLasa reprezentująca pojedynczy element stosu, będąca opakowaniem dla obiektu typu double
     */
    class Węzeł 
    {
        /**
         * Przechowywany element typu double
         */
        double wartosc;
        /**
         * Referencja do kolejnrgo węzła
         */
        Węzeł next;

        public Węzeł(double x, Węzeł n)
        {
            next = n;
            wartosc = x;
        }
    }
}