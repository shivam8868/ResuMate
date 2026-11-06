package com.ResuMate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ResuMate.entity.Certification;

public interface CertificationRepository extends JpaRepository<Certification, Long> {
}