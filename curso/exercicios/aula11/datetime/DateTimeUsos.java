package aula11.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUsos {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2020-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2020-07-20T20:30:26");
		
		Instant d06 = Instant.parse("2020-07-20T20:30:26Z");
		Instant d07 = Instant.parse("2020-07-20T20:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2020 01:30", fmt2);
		
		LocalDateTime d10 = LocalDateTime.parse("20/07/2020 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		LocalDate d11 = LocalDate.of(2022, 7, 20);
		LocalDateTime d12 = LocalDateTime.of(2022, 7, 20, 16, 50);
		
		System.out.println("LocalDate d01............. " + d01);
		System.out.println("LocalDateTime d02......... " + d02);
		System.out.println("Instant d03............... " + d03);
		System.out.println("LocalDate.Parse d04....... " + d04);
		System.out.println("LocalDateTime.Parse d05... " + d05);
		System.out.println("Instant d06............... " + d06);
		System.out.println("Instant d07............... " + d07);
		System.out.println("DateTimeFormatter d08..... " + d08);
		System.out.println("DateTimeFormatter d09..... " + d09);
		System.out.println("DateTimeFormatter d10..... " + d10);
		System.out.println("LocalDate d11............. " + d11);
		System.out.println("LocalDate d12............. " + d12);
	}

}
