package org.sample.test.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	private String _Name;

	public Customer() {

	}

	public String get_Name() {
		return _Name;
	}

	public void set_Name(String _Name) {
		this._Name = _Name;
	}
    @Override
    public String toString() {
        return "JsonExample [title=" + get_Name() + "]";
    }	

}
