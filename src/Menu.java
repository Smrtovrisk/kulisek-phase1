import java.util.Scanner;

public class Menu {
	 void print (String textToPrint) {
		System.out.println(textToPrint);
	}
	 void main () {
		print("Welcome to demo Application of FSD course, Phase 1");
		print("Author: Martin Kulisek, martin.kulisek@vodafone.com");
		print("---------------------------------------------------");
		print("You can choose from these options:");
		print("1. Add file");
		print("2. Search file");
		print("3. Delete file");
		
		
	    Scanner reader = new Scanner(System.in);
	    System.out.println("Enter number");
	    String userResponse = reader.nextLine();
	    reader.close();
	    
	   byte parsed = Byte.parseByte(userResponse);

	    secondary(parsed);

}
	 void secondary(byte action) {
		 
		 if (action == 1) {
			 print("Add file");
		 }
		 else if (action == 2) {
			 print("Search file");
		 }
		 else if (action == 3) {
			 print("Delete file");
		 } else {print("You have not chosen option correctly!");}
		 
		 
	 }
	


}
