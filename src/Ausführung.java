import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ausführung {
	
	Scanner sc = new Scanner (System.in);
	
	
	public void ersteAusführung () {
		System.out.println ( "Bitte gebe deinen Namen ein");
		
		eingabe ();
	}
	
	public void eingabe () {

	String vorname = sc.nextLine ();
	String nachname = sc.nextLine();
	Mitarbeiter mitarbeiter1 = new Mitarbeiter (vorname,nachname);
	
	
	System.out.println("mein Name lautet " + mitarbeiter1.getVorname() + mitarbeiter1.getNachname());

	zweiteAusführung ();
	}
	
	public void zweiteAusführung () {
	
	
	}
	
	
}
