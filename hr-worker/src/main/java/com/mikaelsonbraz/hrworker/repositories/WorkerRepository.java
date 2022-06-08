package com.mikaelsonbraz.hrworker.repositories;

import com.mikaelsonbraz.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
