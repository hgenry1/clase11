package org.example.univalle.modelo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.Required;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Carrera {
    @Id
    @Hidden
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")

    private String idcarrera;

    @Column(name = "nombre_carrera", length = 50, nullable = false)
    @Required(message = "El campo nombres es obligatorio")

    private String nombre;

    @Override
    public String toString() {
        return nombre;
    }
}
