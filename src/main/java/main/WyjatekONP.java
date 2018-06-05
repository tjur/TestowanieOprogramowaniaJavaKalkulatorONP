package main;

/**
 *Klasa reprezentująca każdy wyjątek związany z wyrażeniem ONP
 * @author Tomasz Jurkiewicz
 */
public class WyjatekONP extends Exception 
{
    public WyjatekONP()
    {
        super();
    }
    
    public WyjatekONP(String message) 
    {
        super(message);
    }
}
/**
 * Klasa reprezentująca wyjątek, który rzucamy, gdy dzielimy przez 0 w wyrażeniu ONP
 * @author Tomasz Jurkiewicz
 */
class ONP_DzieleniePrzez0 extends WyjatekONP 
{
    public ONP_DzieleniePrzez0()
    {
        super("Dzielenie przez 0!");
    }
    
    public ONP_DzieleniePrzez0(String message) 
    {
        super(message);
    }
}

/**
 * Klasa reprezentująca wyjątek, który rzucamy, gdy wystąpił nieznany symbol w wyrażeniu ONP
 * @author Tomasz Jurkiewicz
 */
class ONP_NieznanySymbol extends WyjatekONP 
{
    public ONP_NieznanySymbol()
    {
        super("Nieznany symbol!");
    }
    
    public ONP_NieznanySymbol(String message) 
    {
        super(message);
    }
}

/**
 * Klasa reprezentująca wyjątek, który rzucamy, gdy podane wyrażenie ONP jest błędne
 * @author Tomasz Jurkiewicz
 */
class ONP_BłędneWyrażenie extends WyjatekONP 
{
    public ONP_BłędneWyrażenie()
    {
        super("Błędne wyrażenie!");
    }
    
    public ONP_BłędneWyrażenie(String message) 
    {
        super(message);
    }
}

/**
 * Klasa reprezentująca wyjątek, który rzucamy, gdy chcemy ściągnąć element z pustego stosu
 * @author Tomasz Jurkiewicz
 */
class ONP_PustyStos extends WyjatekONP 
{
    public ONP_PustyStos()
    {
        super("Pusty stos!");
    }
    
    public ONP_PustyStos(String message) 
    {
        super(message);
    }
}
