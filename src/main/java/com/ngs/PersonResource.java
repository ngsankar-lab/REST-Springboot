package com.ngs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonResource {
	
	@RequestMapping("persons")
	public List<Person> getPersons(){
		
		List<Person> persons=new ArrayList<Person>();
		Person p1=new Person();
		p1.setId(1);
		p1.setName("Dhruv");
		persons.add(p1);
		
		Person p2=new Person();
		p2.setId(2);
		p2.setName("Sreshta");
		persons.add(p2);
		
		return persons;
		
	}
	

}
