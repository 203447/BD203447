package BD203447.VeterinaryUP.controller;
import BD203447.VeterinaryUP.Servicios.MascotasServices;
import BD203447.VeterinaryUP.model.Mascotas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/mascotas")
public class Mascotascontroller {
    @Autowired
    MascotasServices mascotasServices;

    // Aca podemos  ver la lista de los duenos
    @GetMapping()
    public ArrayList<Mascotas> obtenerMascotas() {
        return mascotasServices.obtenerMascotas();
    }

    // aca podemos guardar los duenos en este caso agregamos con el postman
    @PostMapping()
    public Mascotas guardarMascotas(@RequestBody Mascotas mascotas) {
        return this.mascotasServices.guardarMascotas(mascotas);
    }

    // aca buscarmos el dueno por medio del ID
    @GetMapping(path = "/{id}")
    public Optional<Mascotas> obtenerMascotasPorId(@PathVariable("id") Long id) {
        return this.mascotasServices.obtenerPorId(id);
    }

    // Aca eliminamos el usuario por medio el ID
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.mascotasServices.eliminarMascotas(id);
        if (ok) {
            return "Se ha eliminado el usuario con el id: " + id;
        } else {
            return "No se pudo eliminar el id " + id;
        }
    }
}
