package objetosNegocio;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import objetosNegocio.Animal;
import org.bson.types.ObjectId;

/**
 *@author Diego Robles Rojas
 */
public class Especie {

    /**
     * Default constructor
     */
    public Especie() {
    }

    
    private ObjectId id;
    private String nombre;
    private String nombreCientifico;
    private String descripcion;
    
    private List<Animal> animales;   
    // esta no estoy seguro
    
   
   String cuidadorEspecie="";

    public Especie(String nombre, String nombreCientifico, String descripcion, String Cuidador) {
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        animales = new ArrayList<>();
        cuidadorEspecie=Cuidador;
        
    }

  

    public String getcuidadorEspecie() {
        return cuidadorEspecie;
    }

  public void setcuidadorEspecie(String nombreCuidador) {
        this.nombreCientifico = nombreCientifico;
    }
    

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
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

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id);
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
        final Especie other = (Especie) obj;
        return Objects.equals(this.id, other.id);
    }

    
    
}