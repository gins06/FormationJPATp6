package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.People;
import com.example.demo.entity.Skills;
import com.example.demo.repository.PartiesRepository;
import com.example.demo.repository.PeopleRepository;
import com.example.demo.repository.SkillsRepository;

@SpringBootApplication
public class Tp6Application implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(Tp6Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		People p1 = new People("test", 18);
//		People p2 = new People("toto", 22);
//		People p3 = new People("titi", 52);
//		List<Skills> skillsList = new ArrayList<Skills>();
//		skillsList.addAll(new Collection<Skills>() {
//		})
//		p1.setSkills(new ArrayList<Skills>(new));
		
	}

}
