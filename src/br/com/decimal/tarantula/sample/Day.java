/**
 * 
 */
package br.com.decimal.tarantula.sample;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Classe que representa um dia.
 * 
 * @author Vitor Hugo Oliveira
 * 
 */
public class Day implements Serializable {

	private static final long serialVersionUID = -5145610013229733103L;
	private int day;
	private int month;
	private int year;
	
	public Day() {
		super();
		discoveryDate(new Date());
	}
	
	public Day(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Day(Date date) {
		super();
		discoveryDate(date);
	}

	private void discoveryDate(Date date) {
		Calendar calendar = GregorianCalendar.getInstance();
		
		// Adicionando a data atual
		calendar.setTime(date);
		
		// Capturando a data atual
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
		this.month = calendar.get(Calendar.MONTH) + 1;
		this.year = calendar.get(Calendar.YEAR);
	}
	
	public Day addDay() {
		Day day = this;
		day.day = this.day + 1;
		return day;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Day [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Day other = (Day) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

}
