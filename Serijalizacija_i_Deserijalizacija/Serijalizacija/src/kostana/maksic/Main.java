package kostana.maksic;

//klase:
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

public class Main {

	public static void main(String[] args) throws IOException {
		/*
		 * Serijalizacija -> proces pretvaranja objekata u linearni niz bajtova koji
		 * mogu biti pohranjeni ili prenošeni. Deserijalizacija -> proces pretvaranja
		 * prethodno serijalizovanog niza bajtova u objekat.
		 */

		/*
		 * Ukoliko se želi sačuvati objekat (ili više objekata) u datoteku za kasnije
		 * pretraživanje, pohranjuje se izlaz serijalizacije. Sledeći put kada se žele
		 * pročitati objekti, poziva se metoda deserijalizacije, a objekat je kreiran
		 * ponovo tačno onako kakav je i ranije bio. Isto tako, ako se želi poslati
		 * objekat aplikaciji u izvršavanju na drugom računaru, uspostavi se mrežna
		 * konekcija, serijalizuje objekat u tok, a zatim deserijalizuje objekat na
		 * udaljenoj aplikaciji. Teleportacija u naučnoj fantastici je dobar primer
		 * serijalizacije.
		 */

		Korisnik k = new Korisnik();

		k.ime = "Kostana";
		k.lozinka = "L123";

		FileOutputStream FileOut = new FileOutputStream("UserInfo.ser");

		ObjectOutputStream Out = new ObjectOutputStream(FileOut);

		Out.writeObject(k);
		Out.close();
		FileOut.close();

		System.out.println("Podaci su sačuvani!");
		
		/*
		 * serialVersionUID je identifikator koji se koristi za
		 * serijalizaciju/deserijalizaciju objekta klase Serializable. Jednostavno
		 * rečeno koristi se da zapamtimo verzije klase Serializable da bismo proverili
		 * da li su učitana klasa i serijalizovani objekat kompatibilni. Atributi
		 * serialVersionUID različitih klasa su nezavisni. Stoga nije neophodno da
		 * različite klase imaju jedinstvene vrednosti.
		 */
		
		long serialVersionUID = ObjectStreamClass.lookup(k.getClass()).getSerialVersionUID();
		System.out.println(serialVersionUID);

	}

}
