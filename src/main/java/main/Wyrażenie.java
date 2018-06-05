package main;

/**
* Klasa reprezentująca wyrażenie ONP jako kolejkę elementów typu Symbol, stos z wynikami pośrednimi obliczeń typu double oraz listę zmiennych, par postaci (String-double)
*/
public class Wyrażenie
{
    /**
     * Kolejka symboli wyrażenia ONP (elementy typu Symbol)
     */
    private Kolejka kolejka;
    /**
     * Stos z wynikami pośrednimi obliczeń (elementy typu double)
     */
    private Stos stos;
    /**
     * Lista zmiennych czyli pary klucz-wartość (String-double)
     */
    private Lista zmienne;
    
    /**
     * Wyliczona wartość wyrażenia typu double
     */
    private double wartość;
    
    
    /**
     * Konstruktor tworzący obiekt Wrażenie. Wylicza wartość Wyrażenia i zapisuje w polu wartość.
     * @param onp Wyrażenie ONP w postaci obiektu typu String
     * @param zm Referencja do asocjacyjnej listy posiadającej informacje o wartościach zmiennych z wyrażenia
     * @throws WyjatekONP Gdy podane wyrażenie ONP było niepoprawne
     */
    public Wyrażenie (String onp, Lista zm) throws WyjatekONP //otrzymane onp jest bez ustawień zmiennych, które zostały wcześniej zaktualizowane
    {
        kolejka = new Kolejka();
        stos = new Stos();
        zmienne = zm;   
        
        String[] splited = onp.split("\\s+");
        
        for(int i = 0;i < splited.length;i++)//włożenie elementów wyrażenia do kolejki (podział na symbole)
        {
            switch(splited[i])
            {
                case "E":
                    kolejka.dodaj(new E());
                    break;
                    
                case "Pi":
                    kolejka.dodaj(new Pi());
                    break;
                    
                case "abs":
                    kolejka.dodaj(new Abs());
                    break;
                    
                case "sgn":
                    kolejka.dodaj(new Sgn());
                    break;
                    
                case "floor":
                    kolejka.dodaj(new Floor());
                    break;
                    
                case "ceil":
                    kolejka.dodaj(new Ceil());
                    break;
                    
                case "frac":
                    kolejka.dodaj(new Frac());
                    break;
                    
                case "sin":
                    kolejka.dodaj(new Sin());
                    break;
                    
                case "cos":
                    kolejka.dodaj(new Cos());
                    break;
                    
                case "atan":
                    kolejka.dodaj(new Atan());
                    break;
                    
                case "acot":
                    kolejka.dodaj(new Acot());
                    break;
                    
                case "ln":
                    kolejka.dodaj(new Ln());
                    break;
                    
                case "exp":
                    kolejka.dodaj(new Exp());
                    break;
                
                case "min":
                    kolejka.dodaj(new Min());
                    break;
                    
                case "max":
                    kolejka.dodaj(new Max());
                    break;
                    
                case "log":
                    kolejka.dodaj(new Log());
                    break;
                    
                case "pow":
                    kolejka.dodaj(new Pow());
                    break;
                    
                case "+":
                    kolejka.dodaj(new Dodaj());
                    break;
                case "-":
                    kolejka.dodaj(new Odejmij());
                    break;
                case "*":
                    kolejka.dodaj(new Pomnoz());
                    break;
                case "/":
                    kolejka.dodaj(new Podziel());
                    break;
                    
                default:
                    try
                    {
                        Double d = Double.parseDouble(splited[i]);  //jak się udało, to jest to liczba
                        kolejka.dodaj(new Liczba(d));
                    }
                    catch(NumberFormatException e)  //to nie liczba, pozostaje jedyna opcja - to zmienna
                    {
                        try
                        {
                            kolejka.dodaj(new Zmienna(splited[i])); //jak się udało, to jest to zmienna, inaczej nieznany symbol
                            assert Zmienna.zmienne.contains(splited[i]) : "Nieznana zmienna!";
                        }
                        catch(ONP_NieznanySymbol e1)
                        {
                            throw e1; //nierozpoznano symbolu
                        }
                    } 
            }           
        }
        //obliczenie wyrażenia
        
        while(kolejka.rozmiar() > 0)
        {
            Symbol symbol = kolejka.delete();//ściągamy z początku kolejki symbol i go usuwamy
            
            if(symbol instanceof Operand)
            {
                if(symbol instanceof Liczba)
                {
                    Liczba l = (Liczba) symbol;
                    stos.push(l.obliczWartosc());
                }
                else
                {
                    Zmienna z = (Zmienna) symbol;
                    stos.push(z.obliczWartosc());
                }
            }
            else
            {
                Funkcja fun = (Funkcja) symbol;
                
                if(fun.arnosc() < 2) //argumenty trzeba dodawać w odwrotnej kolejności
                {
                    while (fun.brakujaceArgumenty()>0)
                    {                 
                        try {fun.dodajArgument(stos.pop());}
                        catch(ONP_PustyStos e)
                        {
                            throw new ONP_PustyStos();
                        }
                    }
                }
                else //tu odwracam kolejność argumentów, aby było poprawnie
                {
                    Stos s = new Stos();
                    int a = fun.arnosc();
                    while(a>0)
                    {
                        try {s.push(stos.pop());}
                        catch(ONP_PustyStos e)
                        {
                            throw new ONP_PustyStos();
                        }
                        a--;
                    }
                    while (fun.brakujaceArgumenty()>0)               
                        fun.dodajArgument(s.pop());
                }
                
                double wynik = fun.obliczWartosc();
                stos.push(wynik);
            }
        }
        
        if(stos.rozmiar() != 1)
            throw new ONP_BłędneWyrażenie();
        
        wartość = stos.pop();      
    }
    
    /**
     * Zwraca wynik obliczonego w konstruktorze wyrażenia ONP
     * @return Wartość wyrażenia ONP, czyli danego obiektu Wyrażenie
     */
    public double wynik()
    {
        return wartość;
    }


}