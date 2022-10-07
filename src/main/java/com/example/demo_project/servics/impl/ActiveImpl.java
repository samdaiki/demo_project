package com.example.demo_project.servics.impl;
import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Bird;
import com.example.demo_project.servics.ifs.Active;
@Service
public class ActiveImpl implements Active{

	@Override
	public Bird fly(String name) {
		Bird bird = new Bird();
		bird.setName(name);
		bird.setAge(11);
		System.err.println(bird.getName());
		System.err.println(bird.getAge());
		return bird;
	}
	public void printBirdAttributes(Bird bird) {
		System.err.println(bird.getName());
		System.err.println(bird.getAge());
	}

	}


