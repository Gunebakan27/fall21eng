package day31_dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class C01_DateTime {

	public static void main(String[] args) {

		LocalDate tarih=LocalDate.now();
		
		System.out.println(tarih);
		
		System.out.println(tarih.getDayOfYear());
		System.out.println(tarih.getDayOfWeek());
		
		System.out.println(tarih.plusDays(5));
		System.out.println(tarih.minusYears(5).minusMonths(5));
		
		LocalDate dt=LocalDate.of(2000, 2,12);
		
	}

}
