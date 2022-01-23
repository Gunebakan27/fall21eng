package day29exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//How to read a text file line by line
public class ReadLineException {

	public static void main(String[] args) {
		
		
		
//		readTextFileLineByLine();
//
//
//	}
//	public static void readTextFileLineByLine() {
//		BufferedReader br=null;
//		try {
//			br=new BufferedReader(new FileReader("src/day28exceptions/TextFile"));
//			String line=br.readLine();
//			while(line!=null) {
//				System.out.println(line);
//				line=br.readLine();
//				
//			}
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("Path is wrong or file does not exist");
//
//		} catch (IOException e) {
//			System.out.println("Could not be read..");
//		}finally {
//			try {
//				br.close();
//			} catch (IOException e) {
//				System.out.println("br couldnot be closed");
//			}catch (NullPointerException e) {
//				System.out.println("Non-Existing File can not be closed");			}
//		}
		System.out.println("It starts?\n");
		readFileByLine();
		System.out.println("Does it Continue?");
	}
public static void readFileByLine(){
	BufferedReader br =null;
	
	try {
		String line;
		br = new BufferedReader(new FileReader("src/day28exceptions/TextFile"));
		line=br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
			
		}} catch (FileNotFoundException e) {
System.err.println("Path is wrong or file does not exist");	}
	 catch (IOException e) {
		System.out.println("Could not be read..");
	}
	
	finally {
		try {
			br.close();
			System.out.println("File is closed");
		} catch (IOException e) {
			System.out.println("File couldnot closed");
		}catch (NullPointerException e) {
System.out.println("Non-Existing File can not be closed");
		}
	}
	}
	
	
}

