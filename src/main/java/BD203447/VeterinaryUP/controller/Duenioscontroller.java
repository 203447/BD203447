package BD203447.VeterinaryUP.controller;

import BD203447.VeterinaryUP.Servicios.DueniosServicios;
import BD203447.VeterinaryUP.model.Duenios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class Duenioscontroller {
    @Autowired
    DueniosServicios dueniosServicios;

    // Aca podemos  ver la lista de los duenos
    @GetMapping()
    public ArrayList<Duenios> obtenerDuenios(){
        return dueniosServicios.obtenerDuenios();
    }

    // aca podemos guardar los duenos en este caso agregamos con el postman
    @PostMapping(path = "/addDuenio")
    public Duenios guardarDuenios(@RequestBody Duenios duenios){
        return this.dueniosServicios.guardarDuenios(duenios);
    }

   // aca buscarmos el dueno por medio del ID
    @GetMapping( path = "/{id}")
    public Optional<Duenios> obtenerDueniosPorId(@PathVariable("id") Long id) {
        return this.dueniosServicios.obtenerPorId(id);
    }

    // Aca eliminamos el usuario por medio el ID
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.dueniosServicios.eliminarDuenios(id);
        if( ok){
            return "Se ha eliminado el usuario con el id: " + id;
        }else{
            return "No se pudo eliminar el id " + id;
        }
    }
















}
