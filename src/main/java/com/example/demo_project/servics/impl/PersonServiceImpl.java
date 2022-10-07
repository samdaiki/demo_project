package com.example.demo_project.servics.impl;

import com.example.demo_project.entity.Person;
import com.example.demo_project.servics.ifs.PersonSevice;

public class PersonServiceImpl implements PersonSevice {

	@Override
	public Person getPersonInfo(String id){
		Person per = new Person();
		per.setId("FBK");
		per.setAge(25);
		per.setName("SSS");
		per.setCity("Nagoya");
		return per;
	}

	//public String getPersonInfo() {
	//		String str = "BOT"
	//		return str;
	//}
	public String getPersonId(Person person) {
		return person.getId();
	}
	public String getPersonName(Person person) {
		return person.getName();
}
}
