package com.citasmedicas.Repository;

import com.citasmedicas.Entitys.Citas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCitas extends JpaRepository<Citas,Integer> {
}
