package com.iqmsoft.springboot.jersey;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "myObject")
public class MyObject implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlAttribute(name = "myInt")
	private int myInt;

	@XmlAttribute(name = "myString")
	private String myString;

	public MyObject(int myInt, String myString) {
		super();
		this.myInt = myInt;
		this.myString = myString;
	}

	public int getMyInt() {
		return myInt;
	}

	public void setMyInt(int myInt) {
		this.myInt = myInt;
	}

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}

}
