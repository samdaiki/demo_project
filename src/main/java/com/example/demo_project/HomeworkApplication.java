package com.example.demo_project;

import com.example.demo_project.entity.Bird;

import com.example.demo_project.servics.impl.ActiveImpl;


public class HomeworkApplication {
	public static void main(String[] args) {
		ActiveImpl active = new ActiveImpl();
		Bird bird = active.fly("sasf");
		active.printBirdAttributes(bird);
		
	}
}
