public class Menu {

	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	static void main() throws Exception {
		TextUtils.printMainMenu();

		String userResponse = TextUtils.readPrompt();

		if (userResponse.length() > 0 && isNumeric(userResponse)) {

			byte parsed = Byte.parseByte(userResponse);

			primaryMenu(parsed);
		} else {
			TextUtils.printWrongInput();
			main();
		}
	}

	static void primaryMenu(byte action) throws Exception {

		if (action == 1) {
			Files.listFolder();

			String userResponse = TextUtils.readPrompt("~Press enter to exit");

			if (userResponse.length() >= 0) {
				main();
			}
		} else if (action == 2) {
			secondaryMenu();
		} else if (action == 3) {
			TextUtils.print("~Exiting application..");
			System.exit(0);
		} else {
			TextUtils.printWrongInput();
			main();
		}

	}

	static void secondaryMenu() throws Exception {
		TextUtils.printSecondaryMenu();
		String userResponse = TextUtils.readPrompt();

		if (userResponse.length() == 0) {
			main();
		} else {
			if (!isNumeric(userResponse)) {
				TextUtils.printWrongInput();
				secondaryMenu();
			}
			byte parsed = Byte.parseByte(userResponse);
			switch (parsed) {
			case 1:
				Files.addFile();
				break;
			case 2:
				Files.removeFile();
				break;
			case 3:
				Files.searchFile();
				break;
			}
		}
	}

}
