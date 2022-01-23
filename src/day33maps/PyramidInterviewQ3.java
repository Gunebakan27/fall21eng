package day33maps;
/*
 * Ask user to enter the number of lines of an inverted pyramid.
	  	Type a program to create the inverted pyramid.
  	    For example; if the number of lines is 5, the pyramid will be like; * * * * * * * * *
																			  * * * * * * *
																			    * * * * *
																			      * * *
 */
public class PyramidInterviewQ3 {

	public static void main(String[] args) {

		int rows=5;
		
			
		for (int i = rows; i >=1; i--) {
		
			for (int space = rows-i; space >=1; space--) {
				System.out.print("  ");
			}
			for(int k=0;k<2*i-1;k++) {
				System.out.print("* ");
			}
//			while(k!=2*i-1) {
//				System.out.print("* ");
//				k++;
//			}
			System.out.println();
							
			
		}
	}

}
