package com.example.BD203447.repository;
import com.example.BD203447.model.Mascotas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotasRepository extends CrudRepository <Mascotas, Long> {

}