package day30_immutableClasses;

public class C03_DoubleEqual {

	public static void main(String[] args) {

		String str1="";
		String str2="Mustafa";
		str2="Ali";
		str2+="Mustafa";
		String str5="AliMustafa";
		
		System.out.println(str2);
		System.out.println(str5);
		
		System.out.println(str2==str5);
		str1+=2;
		str1+='c';
		str1+=false;
		
		
		System.out.println(str1.equals("2cfalse"));
		
		
		String str3=new String("Mustafa");
		String str4=new String("Mustafa");
//		str3="Mustafa";
		
		System.out.println(str1==str3);//false
		System.out.println(str1.equals(str3));//true
		System.out.println(str1==str2);//true
	}

}
