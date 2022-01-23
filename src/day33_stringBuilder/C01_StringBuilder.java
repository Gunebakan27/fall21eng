package day33_stringBuilder;

public class C01_StringBuilder {

	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.append(15);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		
		sb.append("AAA");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		sb.replace(0, 2, "XX");
		
		System.out.println(sb);
		
		sb.delete(0, 2);
		System.out.println(sb);
		
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
		
		StringBuilder sb2=new StringBuilder(sb);
		System.out.println(sb==sb2);
		System.out.println(sb.equals(sb2));
		
		sb2.append("AR");
		sb2.indexOf("A");
		
		System.out.println(sb2);
		System.out.println(sb.compareTo(sb2));
		
		sb2.insert(2, "XX");
		System.out.println(sb2);
		
		sb2.insert(3, "cok iyi", 0, 3);
		System.out.println(sb2);
		
		
	}

}
