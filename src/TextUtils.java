import java.util.Scanner;

public class TextUtils {

	public static void print(String textToPrint) {
		System.out.println(textToPrint);
	}

	public static void printMainMenu() {
		print(" ");
		print("-------------------(MAIN-MENU)--------------------");
		print("You can choose from these options:");
		print("(1) List Folder");
		print("(2) File operations");
		print("(3) Exit");
	}

	public static void printSecondaryMenu() {
		print(" ");
		print("-----------------(FILE-OPERATIONS)------------------");
		print("You can choose from these options or press ENTER to go back:");
		print("(1) Add file");
		print("(2) Remove file");
		print("(3) Search File");
	}

	public static void printWrongInput() {
		print("~You have not chosen option correctly!");
		print("~Try again..");
	}

	public static void printSuccessfulInput(String consoleOutput) {
		print(consoleOutput);
		print("~Going back..");
	}

	public static String readPrompt(String consolePrint) {
		Scanner reader = new Scanner(System.in);
		System.out.print(consolePrint);
		String userResponse = reader.nextLine();

		return userResponse;
	}

	public static String readPrompt() {
		Scanner reader = new Scanner(System.in);
			System.out.print("Enter number: ");
			String userResponse = reader.nextLine();

			return userResponse;
		

	}

}
