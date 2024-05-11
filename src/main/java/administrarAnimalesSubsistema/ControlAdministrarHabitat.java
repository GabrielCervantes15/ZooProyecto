/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administrarAnimalesSubsistema;

import dto.HabitatDTO;
import java.util.ArrayList;
import java.util.List;
import objetosNegocio.Habitat;

/**
 *
 * @author Equipo 3
 */
public class ControlAdministrarHabitat {
    private List<Habitat> habitat;
    
    public ControlAdministrarHabitat() {
        this.habitat = new ArrayList<>();
        // Inicialización con algunos datos de ejemplo
        this.habitat.add(new Habitat("Habitat tierra", "Seco", "Selvacaducifolia","America"));
        this.habitat.add(new Habitat("Pedro", "Humedo", "Tropical","Africa"));
   
    }
    
    protected List<Habitat> consultarHabitat() {
        // Lógica para consultar y devolver todos los animales
        return this.habitat;
    }
    public void agregar(Habitat habitat){
        this.habitat.add(habitat);
    }

}
