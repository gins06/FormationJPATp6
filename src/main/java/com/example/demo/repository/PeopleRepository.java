package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.demo.entity.People;
import com.example.demo.entity.Skills;

public interface PeopleRepository extends JpaRepositoryImplementation<People, Long>{

//	@Query(value = "Select people from People p where p.skills contains ?1")
//	List<People> findPeopleContainingSkill(Skills s);
}
