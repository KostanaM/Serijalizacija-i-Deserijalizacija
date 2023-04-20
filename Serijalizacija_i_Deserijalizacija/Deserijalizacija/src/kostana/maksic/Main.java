package kostana.maksic;
//klase:
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Korisnik k = null;

		FileInputStream FileInput = new FileInputStream(
				"D:\\Strucna praksa\\Serijalizacija_i_Deserijalizacija\\Serijalizacija\\UserInfo.ser");
		ObjectInputStream Input = new ObjectInputStream(FileInput);
		
		k = (Korisnik) Input.readObject();
		Input.close();
		FileInput.close();

		System.out.println(k.ime);
		System.out.println(k.lozinka);
		k.Pozdrav();
		
	}

}
