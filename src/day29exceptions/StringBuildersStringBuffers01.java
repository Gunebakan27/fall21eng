package day29exceptions;
/*
 * 1)StringBuffer and StringBuilder are mutable classes
 * 2)StringBuffer(Java 1) is created before StringBuilder(Java 5) in Java
 * 3)StringBuffer is thread-safe and synchronized class, but sB is not.
 * 	i)thread-safe means: Multiple tasks can be done at the same time without any issue.
 * 	ii=synchronize: If you dont want Java to execute multi-thread in random order, you need to synchronized the multi-threads.
 */
public class StringBuildersStringBuffers01 {

	public static void main(String[] args) {
		
		StringBuffer sbf1=new StringBuffer();
		System.out.println(sbf1.capacity());//16
		
		StringBuffer sbf2=new StringBuffer("Java");
		System.out.println(sbf2.capacity());//16+4=20

		StringBuffer sbf3=new StringBuffer(7);
		System.out.println(sbf3.capacity());//7
		
		sbf3.append("Java");
		System.out.println(sbf3.capacity());//7
		
		sbf3.append(" is good");
		System.out.println(sbf3.capacity());//7*2+2=16
		
	}

}
