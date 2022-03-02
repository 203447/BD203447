package BD203447.VeterinaryUP.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity()
@Table(name = "dueños")
public class Duenios {

    @Column(name = "nombre")
    private char nombre;

    @Column(name = "apellidos")
    private char apellidos;

    @Column(name = "correo")
    private char correo;

    @Column(name = "telefono")
    private char telefono;

    @Column(name = "direccion")
    private char direccion;

    @Column(name = "municipio")
    private char municipio;

    @Column(name = "codigo_postal")
    private int codigo_postal;

    public Duenios(char nombre, char apellidos, char correo, char telefono, char direccion, char municipio, int codigo_postal) {
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

    public char getNombre(){
        return nombre;
    }

    public void setNombre(char nombre){
        this.nombre = nombre;
    }

    public char getApellidos(){
        return apellidos;
    }

    public void setApellidos(char apellidos){
        this.apellidos = apellidos;
    }

    public char getCorreo(){
        return correo;
    }

    public void setCorreo(char correo){
        this.correo = correo;
    }

    public char getTelefono(){
        return telefono;
    }

    public void setTelefono(char telefono){
        this.telefono = telefono;
    }

    public char getDireccion(){
        return direccion;
    }

    public void setDireccion(char direccion){

        this.direccion = direccion;
    }

    public char getMunicipio(){
        return municipio;
    }

    public void setMunicipio(char municipio){
        this.municipio = municipio;
    }

    public int getCodigo_postal(){
        return codigo_postal;
    }

    public void setCodigo_postal(char codigo_postal){
        this.codigo_postal = codigo_postal;
    }

}
