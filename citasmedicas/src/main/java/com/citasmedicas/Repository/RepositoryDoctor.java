package com.citasmedicas.Repository;

import com.citasmedicas.Entitys.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryDoctor extends JpaRepository<Doctor,Integer> {
}
