/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import objetosNegocio.Habitat;
import org.bson.types.ObjectId;

/**
 *
 * @author Equipo 3
 */
public class HabitatDTO {
   

        public HabitatDTO() {
        this.continentes = new ArrayList<>();
        this.habitatOcupada =new ArrayList<>();
    }
    private ObjectId id;
    private String nombre;
    private ClimaDTO clima;
    private VegetacionDTO vegetacion;
    private List<ContinenteDTO> continentes;
    private List<HabitatOcupadaDTO> habitatOcupada;

    public HabitatDTO(String nombre, ClimaDTO clima, VegetacionDTO vegetacion) {
        this.nombre = nombre;
        this.clima = clima;
        this.continentes = new ArrayList<>();
        this.vegetacion = vegetacion;
        this.habitatOcupada =new ArrayList<>();
    }

    public List<HabitatOcupadaDTO> getHabitatOcupada() {
        return habitatOcupada;
    }

    public void setHabitatOcupada(List<HabitatOcupadaDTO> habitatOcupada) {
        this.habitatOcupada = habitatOcupada;
    }

   
    public HabitatDTO(String nombre) {
        this.nombre = nombre;
    }

    public ClimaDTO getClima() {
        return clima;
    }

    public void setClima(ClimaDTO clima) {
        this.clima = clima;
    }

    public VegetacionDTO getVegetacion() {
        return vegetacion;
    }

    public void setVegetacion(VegetacionDTO vegetacion) {
        this.vegetacion = vegetacion;
    }
    



    public List<ContinenteDTO> getContinentes() {
        return continentes;
    }

    public void setContinentes(List<ContinenteDTO> continentes) {
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
