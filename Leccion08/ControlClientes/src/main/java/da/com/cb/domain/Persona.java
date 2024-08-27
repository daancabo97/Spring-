package da.com.cb.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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

    @NotEmpty
    private String nombre;

    @NotNull
    private Integer edad;

    @NotEmpty
    private String genero;

    @NotEmpty
    private String ocupacion;

    @NotEmpty
    private String nacionalidad;

    @NotEmpty
    private String apellido;

    private String celular;

    @NotEmpty
    @Email
    private String email;
}
