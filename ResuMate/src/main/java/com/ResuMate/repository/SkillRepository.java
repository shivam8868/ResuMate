package com.ResuMate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ResuMate.entity.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}