/**
 * 
 */
package br.com.decimal.tarantula.function;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Vitor Hugo Oliveira
 *
 */
public class Function {
	
	private Function() {
		
	}
	
	public static String dateToString(Date date, String format) {
		DateFormat fmt = new SimpleDateFormat( format );
		return fmt.format( date );
	}

}
