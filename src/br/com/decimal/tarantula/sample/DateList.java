/**
 * 
 */
package br.com.decimal.tarantula.sample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Vitor Hugo Oliveira
 *
 */
public class DateList {
	
	//FIXME: Construir um teste unitário
	
	private DateList() {
		
	}
	
	public static List<Day> listDatePeriod(Date start, Date end) {
		
		List<Day> listDay = new ArrayList<Day>();

		Day startDay = new Day( start );
		Day endDay = new Day( end );
		
		while( true ) {
			
			listDay.add(startDay);
			
			if(startDay.equals(endDay)) {
				break;
			} else {
				startDay = startDay.addDay();
			}
		}
		
		return listDay;
	}
	
	public static void main(String[] args) {
		
		final int DIA = 1;
		
		List<Day> listDay = listDatePeriod(new Date(), new Date(new Date().getTime() + ( 86400000 * DIA)));
		System.out.println( "Elementos da lista : " + listDay );
		System.out.println( "Tamanho da lista : " + listDay.size() );
		
	}

}
