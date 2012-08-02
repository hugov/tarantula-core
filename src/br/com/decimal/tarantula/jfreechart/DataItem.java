/**
 * 
 */
package br.com.decimal.tarantula.jfreechart;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vitor Hugo Oliveira
 * 
 */
public class DataItem {

	private List<Item> array = new ArrayList<Item>();

	public DataItem() {
		loadData();
	}

	public void loadData() {
		array.add(new Item(12.0d, "20/01/2012 00:00", "Tensão da bateria"));
		array.add(new Item(10.0d, "00:30", "Tensão da bateria"));
		array.add(new Item(9.0d, "21/01/2012 00:00", "Tensão da bateria"));
		array.add(new Item(8.5d, "00:30", "Tensão da bateria"));
	}

	public List<Item> getArray() {
		return array;
	}

	public void setArray(List<Item> array) {
		this.array = array;
	}

}
