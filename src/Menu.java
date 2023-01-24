import java.util.Scanner;

public class Menu {
	public static void print(String textToPrint) {
		System.out.println(textToPrint);
	}

	static void main() throws Exception {
		print(" ");
		print("-------------------(MAIN-MENU)--------------------");
		print("You can choose from these options:");
		print("(1) List Folder");
		print("(2) File operations");
		print("(3) Exit");

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter number: ");
		String userResponse = reader.nextLine();

		if (userResponse.length() > 0) {
			byte parsed = Byte.parseByte(userResponse);

			primaryMenu(parsed);
		}
	}

	static void primaryMenu(byte action) throws Exception {

		if (action == 1) {
			Files.listFolder();

			Scanner reader = new Scanner(System.in);
			System.out.print("Press ENTER to go back to main menu: ");
			String userResponse = reader.nextLine();

			if (userResponse.length() >= 0) {
				main();
			}
		} else if (action == 2) {
			secondaryMenu();
		} else if (action == 3) {
			print("Exiting application..");
			System.exit(0);
		} else {
			print("You have not chosen option correctly!");
		}

	}

	static void secondaryMenu() throws Exception {
		print(" ");
		print("-----------------(FILE-OPERATIONS)------------------");
		print("You can choose from these options or press ENTER to go back:");
		print("(1) Add file");
		print("(2) Remove file");
		print("(3) Search File");
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter number: ");
		String userResponse = reader.nextLine();

		if (userResponse.length() > 0) {
			byte parsed = Byte.parseByte(userResponse);
			if (parsed == 1) {
				Files.addFile();
			} else if (parsed == 2) {
				Files.removeFile();
			} else if (parsed == 3) {
				Files.searchFile();
			} else {
				print("You have not chosen option correctly!");
			}
		} else {
			main();
		}
	}

}
