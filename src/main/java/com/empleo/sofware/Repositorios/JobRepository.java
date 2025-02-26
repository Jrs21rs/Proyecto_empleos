package com.empleo.sofware.Repositorios;
import com.empleo.sofware.Entidades.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {}