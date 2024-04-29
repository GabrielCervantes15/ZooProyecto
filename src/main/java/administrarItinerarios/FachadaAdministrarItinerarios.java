/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administrarItinerarios;

import dto.ItinerarioDTO;

/**
 *
 * @author gaspa
 */
public class FachadaAdministrarItinerarios {
    private ControlAdministrarItinerarios controlitinerario;
    public FachadaAdministrarItinerarios(){
        this.controlitinerario = new ControlAdministrarItinerarios();
    }
    public boolean registrarItinerario(ItinerarioDTO itinerario){
        return controlitinerario.registrarItinerario(itinerario);
    }
    public ItinerarioDTO verificarItinerario(String nombre){
        return controlitinerario.verificarItinerario(nombre);
    }
}
