package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Kalkulator
{
    public static void main(String[] args)
    {
        BufferedReader we = new BufferedReader(new InputStreamReader(System.in));
        Lista zmienne = new Lista();
        Zmienna.zmienne = zmienne;

        try
        {
            String linia = we.readLine().trim();
            String komenda, onp;
            Wyrażenie w;
            while(!linia.equals("exit"))
            {
                if(linia.length() >= 4 && linia.substring(0, 4).equals("calc"))
                {
                    String zmienna = "";
                    String reszta = linia.substring(linia.indexOf(" ") + 1);
                    if(reszta.contains("("))
                    {
                        onp = reszta.substring(0, reszta.indexOf("(")-1);
                        zmienna = reszta.substring(reszta.indexOf("(") + 1,reszta.indexOf("="));
                    }
                    else
                        onp = reszta;
                    try
                    {
                        System.out.println("onp:"+onp);
                        if(onp.trim().equals("")) throw new WyjatekONP();
                        w = new Wyrażenie(onp, zmienne);
                        double wynik = w.wynik();
                        if(!zmienna.equals(""))
                            zmienne.dodaj(new Para(zmienna, wynik));
                        System.out.println("Wynik: " + wynik);
                    }
                    catch(WyjatekONP e)
                    {
                        System.err.println(e.getMessage());
                    }
                }

                else if(linia.length() >= 5 && linia.substring(0, 5).equals("clear"))
                {
                    if(linia.contains("("))
                    {
                        String do_usuniecia[] = linia.substring(linia.indexOf("(") + 1, linia.indexOf(")")).split("\\s+");
                        for (String zm : do_usuniecia)
                        {
                            zmienne.usun(zm);
                        }
                    }
                    else
                        zmienne.wyczysc();//usunięcie wszystkich zmiennych
                }

                else
                    System.err.println("Nieznane polecenie!");
                
                linia = we.readLine().trim();
            }
        }
        catch(IOException e1)
        {
            System.err.println(e1.getMessage());
        }                  
    }
    
    public static double calc(String onp)
    {
        String zmienna = "";
        Lista zmienne = new Lista();
        if(onp.contains("("))
        {
            onp = onp.substring(0, onp.indexOf("(")-1);
            zmienna = onp.substring(onp.indexOf("(") + 1,onp.indexOf("="));
        }
        
        try
        {
            if(onp.trim().equals("")) throw new WyjatekONP();
            Wyrażenie w = new Wyrażenie(onp, zmienne);
            double wynik = w.wynik();
            if(!zmienna.equals(""))
                zmienne.dodaj(new Para(zmienna, wynik));
            
            return wynik;
        }
        catch(WyjatekONP e)
        {
            System.err.println(e.getMessage());
        }
        
        return 0;
    }
}
