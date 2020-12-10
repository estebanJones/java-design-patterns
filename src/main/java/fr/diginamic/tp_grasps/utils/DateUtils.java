package fr.diginamic.tp_grasps.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class DateUtils {
	
	
	public DateUtils() {
		// TODO Auto-generated constructor stub
	}
	
	/** Transforme une date au format String en {@link LocalDateTime}
	 * @param dateStr date au format String
	 * @return LocalDateTime
	 */
	public LocalDateTime toDate(String dateStr) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return LocalDateTime.parse(dateStr, formatter);
	}
}
