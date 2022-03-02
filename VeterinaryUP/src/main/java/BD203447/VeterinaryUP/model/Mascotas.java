package BD203447.VeterinaryUP.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity()
@Table(name = "mascotas")
public class Mascotas {

    @Column(name = "nombre")
    private char nombre;

    @Column(name = "peso")
    private double peso;

    @Column(name = "raza")
    private char raza;

    @Column(name = "edad")
    private int edad;

    @Column(name = "sexo")
    private char sexo;

    @Column(name = "duenio")
    private char duenio;


    public Mascotas(char nombre, double peso, char raza, int edad, char sexo, char duenio) {
        this.nombre = nombre;
        this.peso = peso;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.duenio = duenio;
    }

    public Mascotas(){
    }

    public char getNombre(){
        return nombre;
    }

    public void setNombre(char nombre){
        this.nombre = nombre;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public char getRaza(){
        return raza;
    }

    public void setRaza(char raza){
        this.raza = raza;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(char edad){
        this.edad = edad;
    }

    public char getSexo(){
        return sexo;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public int getDuenio(){
        return duenio;
    }

    public void setDuenio(char duenio){
        this.duenio = duenio;
    }

}
