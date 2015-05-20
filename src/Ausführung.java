import java.util.Scanner;
public class Ausführung {
	
	Scanner sc = new Scanner (System.in);
	String Vorname = sc.nextLine ();
	String Nachname = sc.nextLine();
	
	public void eingabe () {

	System.out.println ("Bitte gebe deinen Vornamen und Nachnamen ein");
	Mitarbeiter mitarbeiter1 = new Mitarbeiter (Vorname,Nachname);
	System.out.println (mitarbeiter1.getNachname());
	}
	
	
}
