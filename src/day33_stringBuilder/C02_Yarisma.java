package day33_stringBuilder;

public class C02_Yarisma {

	public static void main(String[] args) {
//		Soru : For loop ile 1000 defa bir islem yapalim. 
//		Oncesinde ve sonrasinda zamani kontrol edip StringBuilder ve String class’larinin performanslarini karsilastiralim.   
//		Ipucu: long TimeSb = System.nanoTime(); kullanalim
		
		String str="Hello";
		StringBuilder sb=new StringBuilder("Hello");
		
		long time1=System.nanoTime();
				
		for (int i = 0; i < 1000; i++) {
			
			str+=" ";
		}
		long time2=System.nanoTime();
		System.out.println("str ile: "+(time2-time1));
		
		for (int i = 0; i < 1000; i++) {
			sb.append(" ");
		}
		long time3=System.nanoTime();
		
		System.out.println("sb ile: "+(time3-time2));
		
		System.out.println(" yüzde : "+((time2-time1)/(time3-time2)));
		
	}

}
