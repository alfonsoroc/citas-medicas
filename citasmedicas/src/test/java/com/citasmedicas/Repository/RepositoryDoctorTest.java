package com.citasmedicas.Repository;

import com.citasmedicas.Entitys.Doctor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class RepositoryDoctorTest {
    @Autowired
    RepositoryDoctor repositoryDoctor;
    @Test
    public void saveDoctor(){
        Doctor doctor = Doctor.builder()
                .nombre("Alfonso")
                .apellido("Rocha")
                .especialidad("General")
                .build();
        repositoryDoctor.save(doctor);
    }

}