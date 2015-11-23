
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
     * 
     */
    public int gibJahr()
    {
        return jahr;
    }
    
    /**
     * 
     */
    public int gibMonat()
    {
        return monat;
    }
    
    /**
     * 
     */
    public int gibTag()
    {
        return tag;
    }
    
    /**
     * 
     */
    public int gibStunde()
    {
        return stunde;
    }
    
    /**
     * 
     */
    public int gibMinute()
    {
        return minute;
    }
    
    /**
     * 
     */
    public void neueUhrzeit()
    {
    
    }
    
    /**
     * 
     */
    public void neuesDatum()
    {
    }
}
