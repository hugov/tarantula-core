/**
 * 
 */
package br.com.decimal.tarantula.jfreechart;

import java.util.ArrayList;

public class ComposicaoDadosItemGrafico {

	protected ArrayList array = new ArrayList();

	public ComposicaoDadosItemGrafico() {

		array.add(new ModeloGraficoItem("JANEIRO", "CD", 20));

		array.add(new ModeloGraficoItem("FEVEREIRO", "CD", 30));

		array.add(new ModeloGraficoItem("MARCO", "CD", 40));

		array.add(new ModeloGraficoItem("ABRIL", "CD", 50));

		array.add(new ModeloGraficoItem("MAIO", "CD", 60));

		array.add(new ModeloGraficoItem("JUNHO", "CD", 70));

		array.add(new ModeloGraficoItem("JANEIRO", "DVD", 10));

		array.add(new ModeloGraficoItem("FEVEREIRO", "DVD", 70));

		array.add(new ModeloGraficoItem("MARCO", "DVD", 140));

		array.add(new ModeloGraficoItem("ABRIL", "DVD", 10));

		array.add(new ModeloGraficoItem("MAIO", "DVD", 54));

		array.add(new ModeloGraficoItem("JUNHO", "DVD", 23));

	}

	public ArrayList getArray() {

		return array;

	}

	public void setArray(ArrayList array) {

		this.array = array;

	}

}
