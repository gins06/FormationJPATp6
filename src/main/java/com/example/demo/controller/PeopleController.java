package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Parties;
import com.example.demo.entity.People;
import com.example.demo.entity.Skills;
import com.example.demo.repository.PeopleRepository;

@RestController
public class PeopleController {

	@Autowired
	private PeopleRepository peopleRepository;
	
	@GetMapping("/peoples")
	public ResponseEntity<List<People>> getAllPeoples() {
		return new ResponseEntity<>(peopleRepository.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/people/{id}")
	public ResponseEntity<People> getPeopleById(@PathVariable(name = "id") Long id){
		return ResponseEntity.of(peopleRepository.findById(id));

	}
	
	@GetMapping("/people/{id}/parties")
	public ResponseEntity<List<Parties>> getPeopleParties(@PathVariable(name = "id") Long id){
		People people = peopleRepository.findById(id).get();
		if(people != null) {
			return new ResponseEntity<>(people.getPartiesList(), HttpStatus.OK);
		}
		return null;

	}
	
	@PostMapping("/people")
	public ResponseEntity<People> createPeople(People people) {
		return new ResponseEntity<>(peopleRepository.save(people), HttpStatus.CREATED);
	}
	
//	@GetMapping
//	public ResponseEntity<List<People>> getPeopleBySkills(Skills s){
//		return new ResponseEntity<>(peopleRepository.findPeopleContainingSkill(s), HttpStatus.OK);
//	}
	
}
