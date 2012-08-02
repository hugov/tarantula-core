/**
 * 
 */
package br.com.decimal.tarantula.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author Vitor Hugo Oliveira
 * 
 */
public class DataViewObject implements Serializable {

	private static final long serialVersionUID = 65293483456994644L;
	private String text;
	private String image;
	private List<DataViewObject> listDataViewObject;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<DataViewObject> getListDataViewObject() {
		return listDataViewObject;
	}

	public void setListDataViewObject(List<DataViewObject> listDataViewObject) {
		this.listDataViewObject = listDataViewObject;
	}

}
