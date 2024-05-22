package da.com.cb.web;

import da.com.cb.dao.PersonaDao;
import da.com.cb.servicio.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
        @Autowired
        private PersonaService personaService;

        @GetMapping("/")
        public String inicio(Model model) {   
                var personas = personaService.listarPersonas();
                log.info("Ejecutando el controlador Spring MVC");
                model.addAttribute("personas", personas);
                return "index";
        }
}

/*
 * http://localhost:8080/inicio
 */
