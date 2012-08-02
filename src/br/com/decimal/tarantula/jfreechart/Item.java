/**
 * 
 */
package br.com.decimal.tarantula.jfreechart;


/**
 * @author Vitor Hugo Oliveira
 * 
 */
public class Item {

	private double tensao;
	private String periodo;
	private String product;

	public Item() {
		super();
	}

	public Item(double tensao, String periodo, String product) {
		super();
		this.tensao = tensao;
		this.periodo = periodo;
		this.product = product;
	}

	public double getTensao() {
		return tensao;
	}

	public void setTensao(double tensao) {
		this.tensao = tensao;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Item [tensao=" + tensao + ", periodo=" + periodo + ", product=" + product + "]";
	}

}
