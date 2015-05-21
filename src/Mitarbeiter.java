
public class Mitarbeiter {

	private final String Vorname;
	private final String Nachname;
	
	public Mitarbeiter (String Vorname, String Nachname) {
		this.Vorname = Vorname;
		this.Nachname = Nachname;
	}
	
	public String getVorname (){
		return Vorname;
	}
	
	public String getNachname () {
		return Nachname;
	}
}
