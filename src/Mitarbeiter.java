
public class Mitarbeiter {

	private String Vorname;
	private String Nachname;
	
	public Mitarbeiter (String a, String b) {
		this.Vorname = a;
		this.Nachname = b;
	}
	
	public String getVorname (){
		return Vorname;
	}
	
	public String getNachname () {
		return Nachname;
	}
}
