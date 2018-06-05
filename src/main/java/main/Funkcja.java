package main;

/**
 * Abstrakcyjna klasa reprezentująca funkcję w wyrażeniu ONP
 * @author Tomasz Jurkiewicz
 */
abstract public class Funkcja extends Symbol implements Funkcyjny {}

///////   Funkcje bezargumentowe   //////////////

class E extends Funkcja
{
    private int brakujaceArgumenty = 0;
    
    @Override
    public int arnosc() {return 0;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakujaceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        throw new WyjatekONP();
    }
    
    @Override
    public double obliczWartosc ()
    {
        return Math.E;
    }
}

/////////////////////////////////////////////

class Pi extends Funkcja
{
    private int brakująceArgumenty = 0;
    
    @Override
    public int arnosc() {return 0;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        throw new WyjatekONP();
    }
    
    @Override
    public double obliczWartosc ()
    {
        return Math.PI;
    }
}


///////   Funkce jednoargumentowe   //////////////

class Abs extends Funkcja
{
    private double arg1;
    private int brakująceArgumenty = 1;
    
    @Override
    public int arnosc() {return 1;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        if(brakująceArgumenty == 0)
            throw new WyjatekONP();
        
        arg1 = d;
        brakująceArgumenty--;
    }
    
    @Override
    public double obliczWartosc ()
    {
        return Math.abs(arg1);
    }
}

////////////////////////////////////////////

class Sgn extends Funkcja
{
    private double arg1;
    private int brakująceArgumenty = 1;
    
    @Override
    public int arnosc() {return 1;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        if(brakująceArgumenty == 0)
            throw new WyjatekONP();
        
        arg1 = d;
        brakująceArgumenty--;
    }
    
    @Override
    public double obliczWartosc ()
    {
        return Math.signum(arg1);
    }
}

////////////////////////////////////////////

class Floor extends Funkcja
{
    private double arg1;
    private int brakująceArgumenty = 1;
    
    @Override
    public int arnosc() {return 1;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        if(brakująceArgumenty == 0)
            throw new WyjatekONP();
        
        arg1 = d;
        brakująceArgumenty--;
    }
    
    @Override
    public double obliczWartosc ()
    {
        return Math.floor(arg1);
    }
}

////////////////////////////////////////////

class Ceil extends Funkcja
{
    private double arg1;
    private int brakująceArgumenty = 1;
    
    @Override
    public int arnosc() {return 1;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        if(brakująceArgumenty == 0)
            throw new WyjatekONP();
        
        arg1 = d;
        brakująceArgumenty--;
    }
    
    @Override
    public double obliczWartosc ()
    {
        return Math.ceil(arg1);
    }
}

////////////////////////////////////////////

class Frac extends Funkcja
{
    private double arg1;
    private int brakująceArgumenty = 1;
    
    @Override
    public int arnosc() {return 1;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        if(brakująceArgumenty == 0)
            throw new WyjatekONP();
        
        arg1 = d;
        brakująceArgumenty--;
    }
    
    @Override
    public double obliczWartosc ()
    {
        return arg1 - Math.floor(arg1);
    }
}

////////////////////////////////////////////

class Sin extends Funkcja
{
    private double arg1;
    private int brakująceArgumenty = 1;
    
    @Override
    public int arnosc() {return 1;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        if(brakująceArgumenty == 0)
            throw new WyjatekONP();
        
        arg1 = d;
        brakująceArgumenty--;
    }
    
    @Override
    public double obliczWartosc ()
    {
        return Math.sin(arg1);
    }
}

////////////////////////////////////////////

class Cos extends Funkcja
{
    private double arg1;
    private int brakująceArgumenty = 1;
    
    @Override
    public int arnosc() {return 1;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        if(brakująceArgumenty == 0)
            throw new WyjatekONP();
        
        arg1 = d;
        brakująceArgumenty--;
    }
    
    @Override
    public double obliczWartosc ()
    {
        return Math.cos(arg1);
    }
}

////////////////////////////////////////////

class Atan extends Funkcja
{
    private double arg1;
    private int brakująceArgumenty = 1;
    
    @Override
    public int arnosc() {return 1;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        if(brakująceArgumenty == 0)
            throw new WyjatekONP();
        
        arg1 = d;
        brakująceArgumenty--;
    }
    
    @Override
    public double obliczWartosc ()
    {
        return Math.atan(arg1);
    }
}

////////////////////////////////////////////

class Acot extends Funkcja
{
    private double arg1;
    private int brakująceArgumenty = 1;
    
    @Override
    public int arnosc() {return 1;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        if(brakująceArgumenty == 0)
            throw new WyjatekONP();
        
        arg1 = d;
        brakująceArgumenty--;
    }
    
    @Override
    public double obliczWartosc ()
    {
        return Math.atan(1.0/arg1);
    }
}

////////////////////////////////////////////

class Ln extends Funkcja
{
    private double arg1;
    private int brakująceArgumenty = 1;
    
    @Override
    public int arnosc() {return 1;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        if(brakująceArgumenty == 0)
            throw new WyjatekONP();
        
        arg1 = d;
        brakująceArgumenty--;
    }
    
    @Override
    public double obliczWartosc () throws WyjatekONP
    {
        if(arg1 <= 0)
            throw new ONP_BłędneWyrażenie("Niepoprawny argument dla logarytmu!");
        return Math.log(arg1);
    }
}

////////////////////////////////////////////

class Exp extends Funkcja
{
    private double arg1;
    private int brakująceArgumenty = 1;
    
    @Override
    public int arnosc() {return 1;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        if(brakująceArgumenty == 0)
            throw new WyjatekONP();
        
        arg1 = d;
        brakująceArgumenty--;
    }
    
    @Override
    public double obliczWartosc ()
    {
        return Math.exp(arg1);
    }
}



///////   Funkce dwuargumentowe   //////////////

class Dodaj extends Funkcja
{
    private double arg1, arg2;
    private int brakująceArgumenty = 2;
    
    @Override
    public int arnosc() {return 2;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        if(brakująceArgumenty == 0)
            throw new WyjatekONP();
        
        if(brakująceArgumenty == 2)
            arg1 = d;
        else arg2 = d;
        
        brakująceArgumenty--;
    }
    
    @Override
    public double obliczWartosc () throws WyjatekONP
    {
        if(brakująceArgumenty != 0)
            throw new WyjatekONP();
        return arg1 + arg2;
    }
}

////////////////////////////////////////////////////////////////////

class Odejmij extends Funkcja
{
    private double arg1, arg2;
    private int brakująceArgumenty = 2;
    
    @Override
    public int arnosc() {return 2;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        if(brakująceArgumenty == 0)
            throw new WyjatekONP();
        
        if(brakująceArgumenty == 2)
            arg1 = d;
        else arg2 = d;
        
        brakująceArgumenty--;
    }
    
    @Override
    public double obliczWartosc () throws WyjatekONP
    {
        if(brakująceArgumenty != 0)
            throw new WyjatekONP();
        return arg1 - arg2;
    }
}

///////////////////////////////////////////////////////////////////////

class Pomnoz extends Funkcja
{
    private double arg1, arg2;
    private int brakująceArgumenty = 2;
    
    @Override
    public int arnosc() {return 2;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        if(brakująceArgumenty == 0)
            throw new WyjatekONP();
        
        if(brakująceArgumenty == 2)
            arg1 = d;
        else arg2 = d;
        
        brakująceArgumenty--;
    }
    
    @Override
    public double obliczWartosc () throws WyjatekONP
    {
        if(brakująceArgumenty != 0)
            throw new WyjatekONP();
        return arg1 * arg2;
    }
}

///////////////////////////////////////////////////////////

class Podziel extends Funkcja
{
    private double arg1, arg2;
    private int brakująceArgumenty = 2;
    
    @Override
    public int arnosc() {return 2;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        if(brakująceArgumenty == 0)
            throw new WyjatekONP();
        
        if(brakująceArgumenty == 2)
            arg1 = d;
        else arg2 = d;
        
        brakująceArgumenty--;
    }
    
    @Override
    public double obliczWartosc () throws WyjatekONP
    {
        if(brakująceArgumenty != 0)
            throw new WyjatekONP();
        if(arg2 == 0)
            throw new ONP_DzieleniePrzez0("Dzielenie przez zero!");
        return arg1 / arg2;
    }
}

/////////////////////////////////////////////////////////

class Min extends Funkcja
{
    private double arg1, arg2;
    private int brakująceArgumenty = 2;
    
    @Override
    public int arnosc() {return 2;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        if(brakująceArgumenty == 0)
            throw new WyjatekONP();
        
        if(brakująceArgumenty == 2)
            arg1 = d;
        else arg2 = d;
        
        brakująceArgumenty--;
    }
    
    @Override
    public double obliczWartosc () throws WyjatekONP
    {
        if(brakująceArgumenty != 0)
            throw new WyjatekONP();
        return Math.min(arg1, arg2);
    }
}

/////////////////////////////////////////////////////////

class Max extends Funkcja
{
    private double arg1, arg2;
    private int brakująceArgumenty = 2;
    
    @Override
    public int arnosc() {return 2;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        if(brakująceArgumenty == 0)
            throw new WyjatekONP();
        
        if(brakująceArgumenty == 2)
            arg1 = d;
        else arg2 = d;
        
        brakująceArgumenty--;
    }
    
    @Override
    public double obliczWartosc () throws WyjatekONP
    {
        if(brakująceArgumenty != 0)
            throw new WyjatekONP();
        return Math.max(arg1, arg2);
    }
}

/////////////////////////////////////////////////////////

class Log extends Funkcja
{
    private double arg1, arg2;
    private int brakująceArgumenty = 2;
    
    @Override
    public int arnosc() {return 2;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        if(brakująceArgumenty == 0)
            throw new WyjatekONP();
        
        if(brakująceArgumenty == 2)
            arg1 = d;
        else arg2 = d;
        
        brakująceArgumenty--;
    }
    
    @Override
    public double obliczWartosc () throws WyjatekONP
    {
        if(brakująceArgumenty != 0)
            throw new WyjatekONP();
        if(arg1 <= 0 || arg2 <= 0 || arg1 == 1)
            throw new ONP_BłędneWyrażenie("Niepoprawne argumenty dla logarytmu!");
        return Math.log(arg2)/Math.log(arg1);
    }
}

/////////////////////////////////////////////////////////

class Pow extends Funkcja
{
    private double arg1, arg2;
    private int brakująceArgumenty = 2;
    
    @Override
    public int arnosc() {return 2;}
    
    @Override
    public int brakujaceArgumenty ()
    {
        return brakująceArgumenty;
    }
    
    @Override
    public void dodajArgument (double d) throws WyjatekONP
    {
        if(brakująceArgumenty == 0)
            throw new WyjatekONP();
        
        if(brakująceArgumenty == 2)
            arg1 = d;
        else arg2 = d;
        
        brakująceArgumenty--;
    }
    
    @Override
    public double obliczWartosc () throws WyjatekONP
    {
        if(brakująceArgumenty != 0)
            throw new WyjatekONP();
        return Math.pow(arg1, arg2);
    }
}