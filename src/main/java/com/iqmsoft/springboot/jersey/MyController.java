package com.iqmsoft.springboot.jersey;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "objects")
@Path("/")
public class MyController {

	@GET
	@Produces("application/json")
	public MyObjectList getAllObjects() {

		ArrayList<MyObject> myList = new ArrayList<>();
		myList.add(new MyObject(1, "abc"));
		myList.add(new MyObject(2, "def"));
		myList.add(new MyObject(3, "ghi"));

		MyObjectList myObjectList = new MyObjectList();
		myObjectList.setMyObjectList(myList);

		return myObjectList;
	}
}
