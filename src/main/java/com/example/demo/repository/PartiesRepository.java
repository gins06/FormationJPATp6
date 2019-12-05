package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.demo.entity.Parties;
import com.example.demo.entity.People;

public interface PartiesRepository extends JpaRepositoryImplementation<Parties, Long>{

	
}
