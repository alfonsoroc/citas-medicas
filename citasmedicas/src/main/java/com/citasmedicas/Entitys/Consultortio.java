package com.citasmedicas.Entitys;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Consultortio {
    @Id
    @SequenceGenerator(
            name = "consultorio_sequence",
            sequenceName = "consultorio_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "consultorio_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private int id;
    @Column(name = "numero_consultorio",nullable = false)
    private int numeroConsultorio;
    @Column(name = "consultorio_piso",nullable = false)
    private int piso;

    @OneToMany
    @JoinColumn(
            name = "id_consultorio",
            referencedColumnName = "id"
    )
    private List<Citas> citasList;
}
