package com.ResuMate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ResuMate.entity.Resume;

public interface ResumeRepository extends JpaRepository<Resume, Long> {
    List<Resume> findByUserId(Long userId);
}
