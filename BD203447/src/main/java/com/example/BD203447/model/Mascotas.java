package com.example.BD203447.model;

import javax.persistence.*;

@Entity
@Table(name = "mascotas")
public class  Mascotas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idmascota;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "peso")
    private double peso;

    @Column(name = "tipo_mascota")
    private String tipo_mascota;

    @Column(name = "id_duenio")
    private int id_duenio;

    @Column(name = "edad")
    private String edad;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "dueño")
    private String duenio;

    public Mascotas(Long idmascota, String nombre, double peso, String tipo_mascota, int id_duenio, String edad, String sexo, String duenio) {
        this.idmascota = idmascota;
        this.nombre = nombre;
        this.peso = peso;
        this.tipo_mascota = tipo_mascota;
        this.id_duenio = id_duenio;
        this.edad = edad;
        this.sexo = sexo;
        this.duenio = duenio;
    }

    public Mascotas() {

    }

    public Long getIdmascota() {
        return idmascota;
    }

    public void setIdmascota(Long idmascota) {
        this.idmascota = idmascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getTipo_mascota() {
        return tipo_mascota;
    }

    public void setTipo_mascota(String tipo_mascota) {
        this.tipo_mascota = tipo_mascota;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }
}