package BD203447.VeterinaryUP.repository;

import BD203447.VeterinaryUP.model.Duenios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DueniosRepository extends CrudRepository <Duenios, Long> {

}
