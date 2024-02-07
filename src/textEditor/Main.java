package textEditor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String pathToFile = scan.nextLine();
		
		int choose = scan.nextInt();
		
		switch (choose) {
		case 1:
			FileHandler.Write(pathToFile);
			break;
		case 2:
			FileHandler.Read(pathToFile);
			break;
		}
	}

}
