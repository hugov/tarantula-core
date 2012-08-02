/**
 * 
 */
package br.com.decimal.tarantula.jfreechart;

import java.io.Serializable;

public class ModeloGraficoItem implements Serializable {

	private String mes;

	private String produto;

	private int quantidade;

	public ModeloGraficoItem() {

	}

	public ModeloGraficoItem(String mes, String produto, int quantidade) {

		this.mes = mes;

		this.produto = produto;

		this.quantidade = quantidade;

	}

	public String getMes() {

		return mes;

	}

	public void setMes(String mes) {

		this.mes = mes;

	}

	public String getProduto() {

		return produto;

	}

	public void setProduto(String produto) {

		this.produto = produto;

	}

	public int getQuantidade() {

		return quantidade;

	}

	public void setQuantidade(int quantidade) {

		this.quantidade = quantidade;

	}

}
