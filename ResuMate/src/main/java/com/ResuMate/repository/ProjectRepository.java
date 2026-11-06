package com.ResuMate.repository;
import com.ResuMate.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface ProjectRepository extends JpaRepository<Project, Long> {
}