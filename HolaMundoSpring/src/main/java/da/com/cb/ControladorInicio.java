package da.com.cb;

import da.com.cb.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model) {
        var mensaje = "Mensaje con Thymelead";

        var persona = new Persona();
        persona.setNombre("Daniel");
        persona.setApellido("Caicedo");
        persona.setEmail("danielcaicedo285@gmail.com");
        persona.setCelular("3508311662");

        var persona2 = new Persona();
        persona2.setNombre("Andres");
        persona2.setApellido("Bohorquez");
        persona2.setEmail("AndresBohorquez285@gmail.com");
        persona2.setCelular("3508311662");
        

//      var personas = new ArrayList();
//      personas.add(persona);
//      personas.add(persona);


        var personas = Arrays.asList(persona, persona2);
//      var personas = new ArrayList();

        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
//      model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);

        return "index";
    }
}

/*
 * http://localhost:8080/inicio
 */
