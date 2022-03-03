package BD203447.VeterinaryUP.model;
import javax.persistence.*;

@Entity
@Table(name = "duenos")
public class Duenios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "correo")
    private String correo;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "municipio")
    private String municipio;

    @Column(name = "codigo_postal")
    private int codigo_postal;

    public Duenios(String nombre, String apellidos, String correo, String telefono, String direccion, String municipio, int codigo_postal) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.municipio = municipio;
        this.codigo_postal = codigo_postal;
    }

    public Duenios(){
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){

        this.direccion = direccion;
    }

    public String getMunicipio(){
        return municipio;
    }

    public void setMunicipio(String municipio){
        this.municipio = municipio;
    }

    public int getCodigo_postal(){
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal){
        this.codigo_postal = codigo_postal;
    }


   // @Override
   // public String toString(){
      //  return
   // }












}

