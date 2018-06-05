package main;

/**
 *Abstrakcyjna klasa reprezentująca operand w wyrażeniu ONP
 * @author Tomasz Jurkiewicz
 */
abstract class Operand extends Symbol implements Obliczalny {}

/**
 * Klasa reprezentująca liczbę w wyrażeniu ONP
 * @author Tomasz Jurkiewicz
 */
class Liczba extends Operand
{
    private final double wartość;  
    @Override
    public double obliczWartosc() {return wartość;}
    
    Liczba(double val) {wartość = val;} 
}
