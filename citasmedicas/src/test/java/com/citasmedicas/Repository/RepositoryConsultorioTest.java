package com.citasmedicas.Repository;

import com.citasmedicas.Entitys.Consultortio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class RepositoryConsultorioTest {
    @Autowired
    RepositoryConsultorio repositoryConsultorio;
    @Test
    public void saveConsultorio(){
        Consultortio consultortio = Consultortio.builder()
                .numeroConsultorio(322)
                .piso(1)
                .build();
        repositoryConsultorio.save(consultortio);

    }

}