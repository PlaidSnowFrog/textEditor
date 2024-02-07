package textEditor;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {
	public static void Write(String path) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(path));
			Scanner scanner = new Scanner(System.in);
			
			while (true) {
				String input = scanner.nextLine();
				
                if ("exit".equalsIgnoreCase(input.trim())) {
    				writer.close();
                    break;
                }
				
				writer.write(input);
				writer.newLine();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void Read(String path) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
