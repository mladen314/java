package datoteke01;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));

		File file = new File("Chr_IDs.txt");

		try {

			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Nije pronadjen " + e.getMessage());
		}
	}
}
