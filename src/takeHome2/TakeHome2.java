package takeHome2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TakeHome2 {
	
	static String path;

	public static void main(String[] args) {
		
		doesFileExist(path);
		
	}
	
	public static void doesFileExist(String path) {
		path="Dictionary\\word.properties";
		Properties prop= new Properties();
		File f= new File(path);
		FileInputStream fi;
		
		try {
			String word1="MathWorkBook";
			String word2="ScienceWorkBook";
			String word3="HistoryWorkbook";
			String word4="ComputerScWorkBook";
			
			 fi= new FileInputStream(f);
				prop.load(fi);
				System.out.println(word1+":");
				System.out.println(prop.getProperty("MathWorkBook"));
				System.out.println("======================");
				System.out.println(word2+":");
				System.out.println(prop.getProperty("ScienceWorkBook"));
				System.out.println("======================");
				System.out.println(word3+":");
				System.out.println(prop.getProperty("HistoryWorkbook"));
				System.out.println("======================");
				System.out.println(word4+":");
				System.out.println(prop.getProperty("ComputerScWorkBook"));
				
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} 
		
		
	}

