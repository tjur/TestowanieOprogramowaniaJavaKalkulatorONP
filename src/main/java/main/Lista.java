package main;

/**
 *Klasa implementująca listę asocjacyjną, której elementami są obiekty klasy Węzeł, zawierające pary typu String-double
 * @author Tomasz Jurkiewicz
 */
public class Lista 
{
    /**
     * Referencja do pierwszego elementu Listy
     */
    private Węzeł first;
    private int rozmiar;

    public Lista () 
    {
        first = null;
        rozmiar = 0;
    }

    /**
     * Dodaje element na początek listy
     * @param p Element typu Para, który ma być dodany do listy
     */
    public void dodaj(Para p) 
    {
        Węzeł temp = first;
        while(temp != null)
        {
            if(temp.para.getKey().equals(p.getKey()))//zmienna już wcześniej występowała
            {
                temp.para = p;
                return;
            }
            temp = temp.next;
        }
        
        first = new Węzeł(p, first);
        rozmiar++;
    }
    
    /**
     * Usuwa element o podanym kluczu z listy
     * @param s Klucz typu String z obiektu typu Para, który ma być usunięty z listy
     */
    public void usun(String s)
    {
        if(rozmiar != 0)
        {
            if(first.para.getKey().equals(s))
                first = first.next;
            else
            {
                Węzeł temp = first;
                while(temp != null && !temp.next.para.getKey().equals(s))
                    temp = temp.next;
                if(temp == null)//nie znaleziono elementu
                    return;
                temp.next = temp.next.next;
            }             
            rozmiar--;
        }
    }
    /**
     * Usuwa wszystkie elementy z listy
     */
    public void wyczysc() 
    {
        first = null;
        rozmiar = 0;
    }
    
    /**
     * Zwraca wartość typu double powiązaną z podanym kluczem w liście
     * @param s
     * @return 
     */
    public double getValue(String s)
    {
        Węzeł temp = first;
        while(temp != null && !temp.para.getKey().equals(s))
            temp = temp.next;

        return temp.getValue();
    }
    
    /**
     * Sprawdza, czy element o podanym kluczu znajduje się w liście
     * @param s Klucz typu String, którego wystąpienie w liście chcemy sprawdzić
     * @return true jeśli element o podanym kluczu występuje w liście i false w przeciwnym przypadku
     */
    public boolean contains(String s)
    {
        Węzeł temp = first;
        while(temp != null)
        {
            if(temp.para.getKey().equals(s))
                return true;
            temp = temp.next;
        }
        return false;
    }

    /**
     * KLasa reprezentująca pojedynczy element listy, będąca opakowaniem dla obiektu typu Para
     */
    class Węzeł 
    {
        /**
         * Obiekt klasy Para, czyli para typu String-double
         */
        private Para para;
        /**
         * Referencja do kolejnego węzła
         */
        private Węzeł next;

        public Węzeł(Para p, Węzeł next)
        {
            para = p; 
            this.next = next;
        }
        
        /**
         * Zwraca wartość typu double z pola para
         * @return Wartość elementu typu double z pola para
         */
        public double getValue()
        {
            return para.getValue();
        }
    }
}
