package newSet;

import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileIO {

	public static void main(String[] args) {
		//readFromFileOutputTerminal();
		//readFromFileOutputFile();
	}
	
	public static void readFromFileOutputTerminal(){
		try {
			File file = new File("/Users/keshavsaraogi/Desktop/sampleIn.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException e){
			System.out.println("File Not Found");
			e.printStackTrace();
		}
	}
	
	public static void readFromFileOutputFile() {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("/Users/keshavsaraogi/Desktop/sampleIn.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println("SampleIn File Not Found");
			e.printStackTrace();
		}
		try {
			fw = new FileWriter("/Users/keshavsaraogi/Desktop/sampleOut.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("SampleOut File Not Found");
			e.printStackTrace();
		}
		
		String str = "";
		int i;
		
		try {
			while ((i = fr.read()) != -1) {
				str += (char)i;
			}
			fw.write(str);
			
			fr.close();
			fw.close();
			
		} catch (IOException e) {
			System.out.println("Read And Write Operation Failed");
			e.printStackTrace();
		}
	}
}