package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;

public class Testo {

	public static void main(String[] args) {
		
		System.out.println(LocalDateTime.now());
		
		LocalDateTime event = LocalDateTime.of(2050, 6, 5, 14, 30, 0);
		
		
		
		
		LocalDateTime prizeCeremony = LocalDateTime.parse("2050-06-05T14:00:00");
		if (prizeCeremony.getMonthValue()==6)
		System.out.println("no president");
		else
			System.out.println("president invited");
		
		LocalDateTime chiefGuestDeparture = LocalDateTime.parse("2050-06-05T14:30:00");
		
		if (prizeCeremony.plusHours(2).isAfter(chiefGuestDeparture))
		System.out.println("not working");
		
		
		
		/*LocalTime startTime = LocalTime.of(5,7,9);
		
		if (startTime.getHour()<30){
			startTime= startTime.withMinute(3);
			System.out.println(startTime);
		}
		
		
		LocalTime tob= LocalTime.of(13, 5,34, 5748);
		System.out.println(tob.getHour());
		System.out.println(tob.getMinute());
		System.out.println(tob.getSecond());
		System.out.println(tob.getNano());
		
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		LocalTime dob = LocalTime.parse("13:06:45");
		System.out.println(dob.getHour());
		
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MIDNIGHT);
		System.out.println(LocalTime.NOON);
		//int x = Integer.parseInt("123");
		*/
	
		
		
		
		
		
		LocalDate date1 = LocalDate.of(1985, 06, 13);
		
		
		
		/**LocalDate nitz = LocalDate.of(1984, Month.JANUARY, 11);
		LocalDate closeepoch = LocalDate.of(1970, 01, 15);
		LocalDate sysDate = LocalDate.now();
		System.out.println("the system date is "+ sysDate);
		System.out.println(date1.isAfter(nitz));
		System.out.println(date1.isBefore(nitz));
		System.out.println(date1.minusDays(5));  //minus
		System.out.println(date1.minusWeeks(2));
		
		LocalDate dob = LocalDate.parse("1985-06-13");
		System.out.println(dob.getDayOfWeek());
		System.out.println(date1.plusDays(6));   //plus	
		
		System.out.println(date1.withDayOfMonth(15));   //with
		System.out.println(date1.withYear(1984));
		
		System.out.println(date1.toEpochDay());   //to epoch day 
		System.out.println(closeepoch.toEpochDay());
		
		
		System.out.println(date1.isAfter(nitz));
		
		
		
		
		System.out.println(date1.getDayOfMonth());
		System.out.println(date1.getDayOfYear());
		System.out.println(date1.getMonthValue());
		System.out.println(date1.getYear());
		System.out.println(date1.isLeapYear());
		System.out.println(date1.lengthOfMonth());
		
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(date3);
		
		/*Logger log = Logger.getLogger("Log4j");
				
		PropertyConfigurator.configure("log4j.properties");
	   
		System.out.println("we are rocking");
		log.info("ist log message");
		
		System.out.println("we are double rocking");
		log.info("2nd log message");
	
		System.out.println("we are triple rocking");
		log.info("3nd log message");
	}*/
	}
}
