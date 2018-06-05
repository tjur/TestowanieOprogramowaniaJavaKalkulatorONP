package main;

/**
 * Klasa implementująca kolejkę, której pojedyńczy element jest obiektem klasy Węzeł
 * @author Tomasz Jurkiewicz
 */
public class Kolejka 
{
    /**
     * Referencja do pierwszego i ostatniego węzła w kolejce
     */
    private Węzeł first, last;
    /**
     * Aktualna liczba elementów w kolejce
     */
    private int rozmiar;

    public Kolejka()
    {
        first = last = null;
    }

    /**
     * Dodaje podany argument na koniec kolejki 
     * @param s Obiekt klasy Symbol, który chcemy dodać do kolejki
     */
    public void dodaj(Symbol s)
    {
        Węzeł temp = new Węzeł(s);
        if(first == null)
        {
            first = last = temp;
        }
        else 
        {
            last.next = temp;
            last = temp;
        }
        rozmiar++;
    }

    /** 
     * Wyciąga z kolejki element z początku i go zwraca
     * @return Pierwszy element z kolejki (typu Symbol)
     */
    public Symbol delete()
    {
        if(first != null)
        {
            if(first.next == null)
                last = null;

            Węzeł temp = first;
            first = first.next;
            rozmiar--;
            return temp.symbol;
        }
        return null;
    }
    
    /**
     * Zwraca rozmiar kolejki
     * @return Liczba elementów znajdujących się w kolejce
     */
    public int rozmiar() {return rozmiar;}
    
    /**
     * KLasa reprezentująca pojedynczy element kolejki, będąca opakowaniem dla obiektu typu Symbol
     */
    class Węzeł 
    {
        /**
         * Obiekt typu Symbol, będący właściwym elementem, który przechowuje kolejka
         */
        private Symbol symbol;
        /**
         * Referencja do kolejnego węzła
         */
        private Węzeł next;

        public Węzeł(Symbol s)
        {
            symbol = s;
            next = null;
        }
        
        /**
         * Zwraca obiekt klasy Symbol znajdujący się w węźle
         * @return Obiekt klasy Symbol znajdujący się w węźle
         */
        public Symbol getSymbol()
        {
            return symbol;
        }
    }
}
