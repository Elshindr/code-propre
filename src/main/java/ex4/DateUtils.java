package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The type Date utils.
 */
public class DateUtils {

	/**
	 * Formatage string.
	 *
	 * @param date    the date
	 * @param pattern the pattern
	 * @return the string
	 */
	public static String formatage(Date date, String pattern) {

		SimpleDateFormat formateur;

		if(pattern == null || pattern.equals("")){
			 formateur = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		}
		else{
			 formateur = new SimpleDateFormat(pattern);
		}

		return formateur.format(date);
	}
}
