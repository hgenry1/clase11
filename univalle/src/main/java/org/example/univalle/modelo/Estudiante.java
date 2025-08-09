package org.example.univalle.modelo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.Required;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDate;
@Entity
@Getter
@Setter
public class Estudiante {
    @Id
    @Hidden
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")

    private String idEstudiante;
    @Column(name = "nombres_estudiante", length = 30, nullable = false)
    @Required(message = "El nombre del estudiante no puede quedar vacio")

    private String nombres;
    @Column(name = "apellidos_estudiante", length = 30, nullable = false)
    @Required(message = "El apellido del estudiante no puede quedar vacio")

    private String apellidos;
    @Column(name = "fecha_nac", nullable = false)
    @Required(message = "La fecha de nacimiento del estudiante no puede quedar vacio")

    private LocalDate fechanac;
    @ManyToOne
    @JoinColumn(name = "idcarrera")
    @Required(message = "Seleccione una carrera")

    private Carrera id_carrera;
    @Column(nullable = false)
    @Min(value = 0, message = "Promedio debe ser mayor o igual a 0")
    @Max(value = 100,message = "Promedio debe ser menor o igual a 100")

    private int promedio;

}
