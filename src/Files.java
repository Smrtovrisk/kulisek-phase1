import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Files {
	private static String filePath = "mock_files";

	static void addFile() throws Exception {

		String fileName = TextUtils.readPrompt("Enter name of file to add: ");
		String createFile = filePath + "/" + fileName;
		File newFile = new File(createFile);
		if (newFile.exists()) {

			TextUtils.printSuccessfulInput("~File already exists");

			Menu.secondaryMenu();
		} else {
			try (FileWriter fileWriter = new FileWriter(createFile)) {
				fileWriter.write("~You have created file: " + fileName);
				fileWriter.flush();
			}
			TextUtils.printSuccessfulInput("~You have created file: " + fileName);
			Menu.secondaryMenu();

		}

	}

	static void searchFile() throws Exception {

		String fileName = TextUtils.readPrompt("Enter name of the file to search: ");
		String pathName = filePath + "/" + fileName;

		File searchFile = new File(pathName);

		if (searchFile.exists()) {
			TextUtils.printSuccessfulInput("~You have found file: " + fileName);
			Menu.secondaryMenu();

		} else {
			TextUtils.printSuccessfulInput("~You have NOT found file: " + fileName);
			Menu.secondaryMenu();

		}

	}

	static void removeFile() throws Exception {

		String fileName = TextUtils.readPrompt("Enter name of the file to remove: ");
		String pathName = filePath + "/" + fileName;

		File removeFile = new File(pathName);
		if (removeFile.delete()) {
			TextUtils.printSuccessfulInput("~Deleted the file: " + removeFile.getName());
			Menu.secondaryMenu();
		} else {
			TextUtils.printSuccessfulInput("~File doesn't exist.");
			Menu.secondaryMenu();
		}
	}

	static void listFolder() {
		File directory = new File(filePath);

		if (directory.isDirectory()) {

			List<String> listFile = Arrays.asList(directory.list());
			Collections.sort(listFile);
			TextUtils.print("-----------------(LIST-OF-FILES)------------------");

			for (String s : listFile) {
				TextUtils.print(s);
			}

		} else {
			TextUtils.print("Error: Provided folder doesn't exist. Please create one in project directory");
			TextUtils.print("Folder: " + directory.getAbsolutePath());
		}
	}

}
