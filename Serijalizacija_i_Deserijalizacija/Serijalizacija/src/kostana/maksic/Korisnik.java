package kostana.maksic;

/*Interfejs koji se može serijalizirati je prisutan u java.io paketu. 
Nema metode i polja. Stoga klase koje ga implementiraju ne moraju implementirati nikakve metode.
Klase ga implementiraju ako žele da njihove instance budu serijalizirane ili deserializirane. */
import java.io.Serializable;

//implementiramo Serializable interfejs
public class Korisnik implements Serializable {

	String ime;
	String lozinka;

	public void Pozdrav() {
		System.out.println("Zdravo " + ime);
	}
}