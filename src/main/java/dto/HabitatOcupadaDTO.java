/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author Gabriel
 */
public class HabitatOcupadaDTO {
   private ObjectId id;
    private ObjectId habitat;
    private ObjectId especie;
    public HabitatOcupadaDTO(){
        
    }
    public HabitatOcupadaDTO(ObjectId habitat, ObjectId especie) {
        this.habitat = habitat;
        this.especie = especie;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getHabitat() {
        return habitat;
    }

    public void setHabitat(ObjectId habitat) {
        this.habitat = habitat;
    }

    public ObjectId getEspecie() {
        return especie;
    }

    public void setEspecie(ObjectId especie) {
        this.especie = especie;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final HabitatOcupadaDTO other = (HabitatOcupadaDTO) obj;
        return Objects.equals(this.id, other.id);
    }
      
}
