package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_FileInputStream {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("src/day40_exceptions/yazi.txt");
		
		int k=0;
		try {
			while ((k=fis.read())!=-1) {
				System.out.print((char)k);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
