package day28exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*1)If you get red underline while you type code, it can be Compile Time Exception
 * 2)Compile Time Exceptions are called "checked" exception. 
 * 	Run Time Exceptions are called "unchecked" exception.
 * 3)The most common "checked exceptions are:
 * i)FileNotFoundException: The path is wrong or file does not exist
 * ii)IOException: It is related with all input-output issues
 * 4)If there is IOException, no need to use FileNotFoundException.
 * 5)If you need to use them in try-catch blocks, then type FileNotFoundException at top
 * 6)e.printStackTrace(): It gives detailed technical information about error.
 * 
 */
public class Exception02 {
	//how to read a text file
	

	public static void main(String[] args)  {
		readTextFiles2();
		

		
	}
	public static void readTextFiles1() throws IOException {
		FileInputStream fis=new FileInputStream("src/day28exceptions/TextFile");
		int i=0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		fis.close();
	}
	
	public static void readTextFiles2() {
		FileInputStream fis=null;
		
		try {
			fis = new FileInputStream("src/day28exceptions/TextFile");
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			System.err.println("File not found: "+e.getMessage());
		} catch (IOException e) {
			System.err.println("File couldn't be read: "+e.getMessage());
		}finally {
		try {
			fis.close();
			System.out.println("fis is closed");
		} catch (Exception e) {
			System.err.println("Could not closed or file was not opened.."+e.getMessage());
		}}
		
		
	}

}
