package arrays;

public class IstenenToplam {

	public static void main(String[] args) {
		/*
		 * verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
		 * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
		 * int istenenToplam=9;
		 */
		int[] arr= {5,7,-6,4,2,15,3,8,1};
		int istenenToplam=9;
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int k = i+1; k < arr.length; k++) {
				if(arr[k]+arr[i]==istenenToplam) {
					System.out.println(arr[k]+" + "+arr[i]+" = "+istenenToplam);
				}
			}
			
			
		}
	}

}
