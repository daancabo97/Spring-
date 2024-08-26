package da.com.cb.dao;

import da.com.cb.domain.Persona;
import org.springframework.data.repository.CrudRepository;


public interface PersonaDao extends CrudRepository<Persona, Long> {
    
}
