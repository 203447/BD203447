package BD203447.VeterinaryUP.model;
import javax.persistence.*;
import javax.persistence.Column;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity()
@Table (name = "citas")
public class Citas {

    @Column(name = "fecha")
    private char fecha;

    @Column(name = "hora")
    private char hora;

    @Column(name = "motivo")
    private char motivo;

    public Citas(char fecha, char hora, char motivo) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
    }

    public Citas(){
    }

    public char getFecha(){
        return fecha;
    }

    public void setFecha(char fecha){
        this.fecha = fecha;
    }

    public char getHora(){
        return hora;
    }

    public void setHora(char hora){
        this.hora = hora;
    }

    public char getMotivo(){
        return motivo;
    }

    public void setMotivo(char motivo){
        this.motivo = motivo;
    }




}
