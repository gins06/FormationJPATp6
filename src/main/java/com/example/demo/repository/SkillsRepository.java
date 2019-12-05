package com.example.demo.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.demo.entity.Skills;

public interface SkillsRepository extends JpaRepositoryImplementation<Skills, Long> {

}
