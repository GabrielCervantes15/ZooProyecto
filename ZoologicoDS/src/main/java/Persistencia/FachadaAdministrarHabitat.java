/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.util.List;
import objetosNegocio.Habitat;

/**
 *
 * @author Equipo 3
 */

public class FachadaAdministrarHabitat {
    private ControlAdministrarHabitat controlHabitat;
    
    public FachadaAdministrarHabitat() {
        this.controlHabitat = new ControlAdministrarHabitat();
    }
    
    
    public List<Habitat> consultarTodasLasHabitat() {
        return controlHabitat.consultarHabitat();
    }
    public void Agregar(Habitat habitat){
        this.controlHabitat.agregar(habitat);
    }
    

   
   
}
