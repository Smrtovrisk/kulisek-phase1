import java.io.File;
import java.io.FileWriter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Files {
	private static String filePath = "../kulisek-phase1/mock_files";

	static void addFile() throws Exception {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter name of file to add: ");
		String fileName = reader.next();
		String createFile = filePath + "/" + fileName;
		File newFile = new File(createFile);
		if (newFile.exists()) {
			System.out.println("File already exists. Going back..");
			Menu.secondaryMenu();
		} else {
			try (FileWriter fileWriter = new FileWriter(createFile)) {
				fileWriter.write("You have created file: " + fileName);
				fileWriter.flush();
			}
			System.out.println("You have created file: " + fileName);
			System.out.println("Going back..");
			Menu.secondaryMenu();

		}

	}

	static void searchFile() throws Exception {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter name of the file to search: ");
		String fileName = reader.next();
		String pathName = filePath + "/" + fileName;
		
		 File searchFile = new File(pathName); 
		 
		    if (searchFile.exists()) { 
				System.out.println("You have found file: " + fileName);
				System.out.println("Going back..");
				Menu.secondaryMenu();
		    	
		    } else {
				System.out.println("You have NOT found file: " + fileName);
				System.out.println("Going back..");
				Menu.secondaryMenu();
		    	
		    }
		
		
	}

	static void removeFile() throws Exception {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter name of the file to remove: ");
		String fileName = reader.next();
		String pathName = filePath + "/" + fileName;
		
		 File removeFile = new File(pathName); 
		    if (removeFile.delete()) { 
		      System.out.println("Deleted the file: " + removeFile.getName());
		      System.out.println("Going back..");
		      Menu.secondaryMenu();
		    } else {
		      System.out.println("File doesn't exist.");
		      System.out.println("Going back..");
		      Menu.secondaryMenu();
		    } 
	}

	static void listFolder() {
		File directory = new File(filePath);

		if (directory.isDirectory()) {

			List<String> listFile = Arrays.asList(directory.list());
			Collections.sort(listFile);
			System.out.println("-----------------(LIST-OF-FILES)------------------");

			for (String s : listFile) {
				System.out.println(s);
			}

		} else {
			System.out.println("Error: Provided directory doesn't exist.");
			System.out.println("Directory: " + directory.getAbsolutePath());
		}
	}

}
