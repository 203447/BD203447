package BD203447.VeterinaryUP.Servicios;

import BD203447.VeterinaryUP.model.Duenios;
import BD203447.VeterinaryUP.repository.DueniosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DueniosServicios {
    @Autowired
    DueniosRepository dueniosRepository;

    // Mostrar los Duenos En la base

    public ArrayList<Duenios> obtenerDuenios(){
        return (ArrayList<Duenios>) dueniosRepository.findAll();
    }

    // Guarada los duenos en la base

    public Duenios guardarDuenios(Duenios duenios){
        return dueniosRepository.save(duenios);
    }

    // muestra los duenos por medio de su ID
    public Optional<Duenios> obtenerPorId(Long id){
        return dueniosRepository.findById(id);
    }

    public boolean eliminarDuenios(Long id) {
        try {
            dueniosRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }

    }
}
