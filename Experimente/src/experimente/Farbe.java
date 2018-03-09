package experimente;

/**
 * Diese Klasse dient dazu, Farbobjekte zu erstellen / beschreiben.
 * 
 * @author asdas
 * @since V1.0
 */
public class Farbe {
	
	/**
	 * Die Konstante fuer die Farbe "rot".
	 */
	public static final String rot = "red";
	
	/**
	 * Instanzvariable, die den Farbwert haelt.
	 */
	private String farbwert;
	
	/**
	 * Konstruktor
	 * 
	 * @param wert Ein String, welcher die Farbe beschreibt. Z.B. <code>rot</code>.
	 */
	public Farbe(String wert) {
		farbwert = wert;
	}
	
	/**
	 * Liefert den Farbwert als String.
	 * 
	 * @return Farbwert als String
	 */
	public String getFarbwert() {
		return farbwert;
	}
}
