package com.example.demo_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.servics.ifs.Active;

@SpringBootTest
class DemoProjectApplicationTests {
@Autowired
private Active active;
	@Test
	public void iui() {
		active.fly("mum");
	}

}

