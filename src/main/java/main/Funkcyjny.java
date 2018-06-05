package main;

/**
* Rozszerzenie interfejsu Obliczalny dla funkcji
*/

public interface Funkcyjny extends Obliczalny
{
    /**
    * Metoda mówi o arności funkcji lub operatora.
     * @return Arność danej funkcji typu int
    */
    int arnosc ();
    /**
    * Metoda informuje
    o liczbie brakujących argumentów, czyli argumentów które trzeba jeszcze dostarczyć do
    funkcji za pomocą metody dodajArgument(), zanim wywoła się metodę obliczWartość()
     * @return Liczba brakujących argumentów, które należy dostarczyć jeszcze do funkcji
    */
    int brakujaceArgumenty ();
    /**
    * Dodaje kolejny argument do Funkcji.@throws narzedzia.WyjatekONP
     * @param d Wartość typu double, która będzie dodany do funkcji jako kolejny argument
     * @throws narzedzia.WyjątekONP Gdy liczba dostarczonych argumentów jest większa niż arnosc funkcji
    */
    void dodajArgument (double d) throws WyjatekONP;
}
