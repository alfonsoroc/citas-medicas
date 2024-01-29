package com.citasmedicas.Entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "citas")
public class Citas {
    @Id
    @SequenceGenerator(
            name = "citas_sequence",
            sequenceName = "citas_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "citas_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private int id;
    @Temporal(
           TemporalType.DATE
    )
    @Column(
            name = "fecha_cita",
            nullable = false
    )
    private Date fecha;

    @Temporal(TemporalType.TIME)
    @Column(name = "hora_inicio",nullable = false)
    private Date horaInicio;

    @Temporal(TemporalType.TIME)
    @Column(name = "hora_fin",nullable = false)
    private Date horafin;

    @Column(
            name = "nombre_paciente"
    )

    private String nombrePaciente;

    @ManyToOne
    @JoinColumn
            (name = "id_consultorio")
    private Consultortio consultortio;

    @ManyToOne
    @JoinColumn
            (name = "id_doctor")
    private Doctor doctor;

}
