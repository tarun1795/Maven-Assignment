package com.accolite.miniau.ApiProject;

import java.util.ArrayList;
import java.util.List;

public class API {

	List<Person> list;

	public API()
	{
		list = new ArrayList<Person>();
		list.add(new Person("tarun", 22));
		list.add(new Person("sathya",23));
		list.add(new Person("piyush",25));
	}

	public List<Person> getList() {
		return list;
	}
	
}

