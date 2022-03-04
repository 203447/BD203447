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
public class Duenioscontroller {
    @Autowired
    DueniosServicios dueniosServicios;

    //  ver la lista de los duenios
    @GetMapping()
    public ArrayList<Duenios> obtenerDuenios(){
        return dueniosServicios.obtenerDuenios();
    }

    // se guardan los duenios y agregamos con el postman
    @PostMapping()
    public Duenios guardarDuenios(@RequestBody Duenios duenios){
        return this.dueniosServicios.guardarDuenios(duenios);
    }

   // buscamos el duenio por medio del ID
    @GetMapping( path = "/{id}")
    public Optional<Duenios> obtenerDueniosPorId(@PathVariable("id") Long id) {
        return this.dueniosServicios.obtenerPorId(id);
    }

    //  eliminamos el duenio por medio el ID
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
