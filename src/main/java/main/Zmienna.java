package main;

/**
 *Klasa reprezentująca zmienną w wyrażeniu ONP
 * @author Tomasz Jurkiewicz
 */
public class Zmienna extends Operand
{
    private String zmienna;
    public static Lista zmienne;
    @Override
    public double obliczWartosc() {return zmienne.getValue(zmienna);}
    
    Zmienna(String x) throws ONP_NieznanySymbol 
    {
        if(x.matches("\\p{Alpha}\\p{Alnum}*"))
            zmienna = x;
        else
        {
            throw new ONP_NieznanySymbol("Identyfikator nie pasuje do wzorca!");
        }
    } 
}