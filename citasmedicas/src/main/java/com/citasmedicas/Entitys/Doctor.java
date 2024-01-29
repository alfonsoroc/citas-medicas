package com.citasmedicas.Entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(
        name = "doctor"
)
public class Doctor {
    @Id
    @SequenceGenerator(name = "doctor_sequence",
            sequenceName = "doctor_sequence",
            allocationSize = 1)
    @GeneratedValue(
            generator = "doctor_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private int id;
    @Column(
            name = "nombre_doctor",
            nullable = false
    )
    private String nombre;
    @Column(
            name = "apellido_doctor",
            nullable = false
    )
    private String apellido;
    @Column(
            name = "especialidad_doctor",
            nullable = false
    )
    private String especialidad;

    @OneToMany
    @JoinColumn(
            name = "id_doctor",
            referencedColumnName = "id"
    )
    private List<Citas> citasList;
}
