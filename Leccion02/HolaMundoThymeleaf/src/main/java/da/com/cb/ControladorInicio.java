package da.com.cb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/inicio")
    public String inicio(){
        log.info("Ejecutando el servidor rest");
        return "HolaMundo con Spring Boot";
    }
    
}

/*
 * http://localhost:8080/inicio
 */
