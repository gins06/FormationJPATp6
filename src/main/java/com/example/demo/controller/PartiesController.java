package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Parties;
import com.example.demo.repository.PartiesRepository;

@RestController
public class PartiesController {

	@Autowired
	private PartiesRepository partiesRepository;
	
	@GetMapping("/parties")
	public ResponseEntity<List<Parties>> getAllParties() {
		return new ResponseEntity<>(partiesRepository.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/parties/{id]")
	public ResponseEntity<Parties> getPartiesById(@PathVariable(name = "id") Long id){
		return ResponseEntity.of(partiesRepository.findById(id));
	}
	
	@PostMapping("/parties")
	public ResponseEntity<Parties> createParties(@RequestBody Parties parties){
		return new ResponseEntity<>(partiesRepository.save(parties), HttpStatus.CREATED);
	}
}
