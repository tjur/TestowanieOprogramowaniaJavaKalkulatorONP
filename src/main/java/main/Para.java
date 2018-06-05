package main;

/**
 *Klasa przechowująca dwa elementy w postaci klucza typu String i wartości typu double
 * @author Tomasz Jurkiewicz
 */
public class Para 
{
    private String key;
    private double value;
    
    public String getKey()
    {
        return key;
    }
    
    public double getValue()
    {
        return value;
    }
    
    public Para(String k, double v)
    {
        key = k;
        value = v;
    }
}
