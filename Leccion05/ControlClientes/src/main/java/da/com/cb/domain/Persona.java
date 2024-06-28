package da.com.cb.domain;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    private String nombre;
    private Integer edad;
    private String genero;
    private String ocupacion;
    private String nacionalidad;
    private String apellido;
    private String celular;
    private String email;
}
