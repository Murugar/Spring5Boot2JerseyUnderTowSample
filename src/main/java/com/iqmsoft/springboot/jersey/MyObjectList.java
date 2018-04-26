package com.iqmsoft.springboot.jersey;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "myObjectList")
public class MyObjectList {

	@XmlElement(name = "myObject")
	private ArrayList<MyObject> myObjectList;

	public ArrayList<MyObject> getMyObjectList() {
		return myObjectList;
	}

	public void setMyObjectList(ArrayList<MyObject> myObjectList) {
		this.myObjectList = myObjectList;
	}

}
