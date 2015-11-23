
/**
 * Es soll eine Klasse erstellt werden, die das aktuelle Datum und die Uhrzeit kapselt. Die
 * Klasse soll über Methoden verfügen, die auf Grund des Datums (und ggf. der Uhrzeit)
 * erkennen, um welche Jahreszeit es sich handelt und welche anderen Merkmale mit diesem
 * Datum verbunden sind. Zum Erkennen der Merkmale sollen boolesche Ausdrücke
 * eingesetzt werden.
 * 
 * @author (Jan-René Grünhagen) 
 * @version (tt.mm.yyyy)
 */
public class Datum
{
    private int tag;
    private int monat;
    private int jahr;
    private int stunde;
    private int minute;
    /**
     * Konstruktor für Objekte der Klasse Datum
     */
     public Datum()
    {
        // Initialisierung der Instanzvariablen
        tag = 1;
        monat = 1;
        jahr = 2015;
        stunde = 0;
        minute = 1;
    }
    
    /**
     * b. Erstellen Sie einen Konstruktor, mit dessen Hilfe die Datenfelder initialisiert werden.
     * Erstellen Sie sondierende Methoden gibJahr(), gib Monat(), … , mit deren Hilfe die
     * Werte der einzelnen Datenfelder abgefragt werden können.
     */
    public int gibJahr()
    {
        return jahr;
    }
    
    /**
     * b. Erstellen Sie einen Konstruktor, mit dessen Hilfe die Datenfelder initialisiert werden.
     * Erstellen Sie sondierende Methoden gibJahr(), gib Monat(), … , mit deren Hilfe die
     * Werte der einzelnen Datenfelder abgefragt werden können.
     */
    public int gibMonat()
    {
        return monat;
    }
    
    /**
     * b. Erstellen Sie einen Konstruktor, mit dessen Hilfe die Datenfelder initialisiert werden.
     * Erstellen Sie sondierende Methoden gibJahr(), gib Monat(), … , mit deren Hilfe die
     * Werte der einzelnen Datenfelder abgefragt werden können.
     */
    public int gibTag()
    {
        return tag;
    }
    
    /**
     * b. Erstellen Sie einen Konstruktor, mit dessen Hilfe die Datenfelder initialisiert werden.
     * Erstellen Sie sondierende Methoden gibJahr(), gib Monat(), … , mit deren Hilfe die
     * Werte der einzelnen Datenfelder abgefragt werden können.
     */
    public int gibStunde()
    {
        return stunde;
    }
    
    /**
     * b. Erstellen Sie einen Konstruktor, mit dessen Hilfe die Datenfelder initialisiert werden.
     * Erstellen Sie sondierende Methoden gibJahr(), gib Monat(), … , mit deren Hilfe die
     * Werte der einzelnen Datenfelder abgefragt werden können.
     */
    public int gibMinute()
    {
        return minute;
    }
    
    /**
     * c. Erstellen Sie eine Methode neuesDatum() mit deren Hilfe eine neues Datum und eine
     * Methode neueUhrzeit() mit deren Hilfe eine neue Uhrzeit eingestellt werden können.
     * Die Methoden sollen über formale Parameter verfügen, welche die notwendigen Informationen
     * enthalten. Die Methoden sollen sicher stellen, dass die übergebenen Informationen
     * im zulässigen Wertebereich liegen. Nehmen Sie der Einfachheit halber an, dass jeder
     * Monat 30 Tage hat.
     */
    public void neueUhrzeit(int neueStunde,int neueMinute)
    {
        if (neueMinute >= 0 && neueMinute <=59)
        {
            minute = neueMinute;
        }
        else
        {
           System.err.println("Bitte einen korrekten Minutenwert eingeben");
        }
        
        if (neueStunde >= 0 && neueStunde <= 23)
        {
            stunde = neueStunde;
        }
        else
        {
           System.err.println("Bitte einen korrekten Stundenwert eingeben");
        }
    }
    
    /**
     * c. Erstellen Sie eine Methode neuesDatum() mit deren Hilfe eine neues Datum und eine
     * Methode neueUhrzeit() mit deren Hilfe eine neue Uhrzeit eingestellt werden können.
     * Die Methoden sollen über formale Parameter verfügen, welche die notwendigen Informationen
     * enthalten. Die Methoden sollen sicher stellen, dass die übergebenen Informationen
     * im zulässigen Wertebereich liegen. Nehmen Sie der Einfachheit halber an, dass jeder
     * Monat 30 Tage hat.
     */
    public void neuesDatum(int neuerTag, int neuerMonat, int neuesJahr)
    {
        if (neuerTag >= 1 && neuerTag <=30)
        {
            tag = neuerTag;
        }
        else
        {
           System.err.println("Bitte einen korrekten Tag eingeben");
        }
        
        if (neuerMonat >= 0 && neuerMonat<=12)
        {
            monat = neuerMonat;
        }
        else
        {
           System.err.println("Bitte einen korrekten Monat eingeben");
        }
        
        jahr = neuesJahr;
    }
    
    /**
     * d. Erstellen Sie eine sondierende Methode istWinter(), die true zurück gibt, wenn das aktuelle
     * Datum im Winter liegt, false sonst. Die Methode soll keine Verzweigung enthalten.
     */
    public boolean istWinter()
    {
        // von Oktober bis März
        return (monat % 10)< 4;
    }
    
    /**
     * e. Erstellen Sie eine Methode kannDraussenBaden(), die true zurück gibt, wenn das aktuelle
     * Datum in einer Jahreszeit liegt, in der man draußen baden kann. (In Deutschland sind
     * Freibäder von Mitte Mai bis Mitte September geöffnet.) Die Methode soll keine Verzweigung
     * enthalten.
     */
    public boolean kannDraussenBaden()
    {
        return (monat >= 5 && monat < 10)&&(monat < 10 && tag <= 15) && (monat > 5 && tag >= 15);
    }
}
