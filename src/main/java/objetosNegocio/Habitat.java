package objetosNegocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * @author Gabriel Cervantes Trujillo
 */
public class Habitat {

    /**
     * Default constructor
     */
    public Habitat() {
       
    }

    /**
     * 
     */
    private ObjectId id;
    private String nombre;
    private String clima;
    private String vegetacion;
    private String continentes;
  

    public Habitat(String nombre, String clima, String vegetacion, String continentes) {
        this.nombre = nombre;
        this.clima = clima;
        this.continentes = continentes;
        this.vegetacion = vegetacion;
      
    }



   
    public Habitat(String nombre) {
        this.nombre = nombre;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getVegetacion() {
        return vegetacion;
    }

    public void setVegetacion(String vegetacion) {
        this.vegetacion = vegetacion;
    }
    



    public String getContinentes() {
        return continentes;
    }

    public void setContinentes(String continentes) {
        this.continentes = continentes;
    }
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Habitat other = (Habitat) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return nombre;
    }

    

    
    
}