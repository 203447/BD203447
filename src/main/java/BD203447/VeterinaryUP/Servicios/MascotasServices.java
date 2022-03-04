package BD203447.VeterinaryUP.Servicios;
import BD203447.VeterinaryUP.model.Mascotas;
import BD203447.VeterinaryUP.repository.MascotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MascotasServices {
    @Autowired
    MascotasRepository mascotasRepository;


    public ArrayList<Mascotas> obtenerMascotas(){
        return (ArrayList<Mascotas>) mascotasRepository.findAll();
    }


    public Mascotas guardarMascotas(Mascotas mascotas){
        return mascotasRepository.save(mascotas);
    }

    public Optional<Mascotas> obtenerPorId(Long id){
        return mascotasRepository.findById(id);
    }

    public boolean eliminarMascotas(Long id) {
        try {
            mascotasRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }

    }
}
