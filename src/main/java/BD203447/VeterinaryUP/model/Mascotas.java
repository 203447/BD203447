package BD203447.VeterinaryUP.model;
import javax.persistence.*;

@Entity
@Table(name = "mascotas")
public class Mascotas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idmascota;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "peso")
    private double peso;

    @Column(name = "raza")
    private String raza;

    @Column(name = "edad")
    private String edad;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "dueño")
    private String duenio;

    public Mascotas(Long idmascota, String nombre, double peso, String raza, String edad, String sexo, String duenio) {
        this.idmascota = idmascota;
        this.nombre = nombre;
        this.peso = peso;
        this.raza = raza;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
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
}