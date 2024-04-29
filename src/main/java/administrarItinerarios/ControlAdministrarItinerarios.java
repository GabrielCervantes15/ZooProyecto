/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administrarItinerarios;

import dto.ItinerarioDTO;
import java.util.ArrayList;
import java.util.List;
import objetosNegocio.Itinerario;


/**
 *
 * @author gaspa
 */
public class ControlAdministrarItinerarios {
    private List<Itinerario> itinerarios;
    private Itinerario itinerario;
    public ControlAdministrarItinerarios(){
         this.itinerarios = new ArrayList<>();
         itinerario = new Itinerario();
    }
    
    public boolean registrarItinerario(ItinerarioDTO itinerarioDTO){
        
        return itinerario.guardar(itinerarioDTO);
    }
    public ItinerarioDTO verificarItinerario(String nombre){
        return this.itinerario.buscarPorNombre(nombre);
    }
}
