/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import dto.ItinerarioDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gaspa
 */
public class Itinerario {
    private List<ItinerarioDTO> itinerarios;
    public Itinerario(){
        this.itinerarios = new ArrayList<>();
    }
    public boolean guardar(ItinerarioDTO itinerarioDTO) {
        ItinerarioDTO itinerario = new ItinerarioDTO(itinerarioDTO.getNombre(),itinerarioDTO.getMaxVisitantes(),itinerarioDTO.getLongitud(),itinerarioDTO.getDuracion());
        itinerarios.add(itinerario);
        System.out.println("Itinerario registrado: " + itinerarioDTO.getNombre());
        return true;
        
    }
    public ItinerarioDTO buscarPorNombre(String nombre) {
    for (ItinerarioDTO itinerario : itinerarios) {
        if (itinerario.getNombre() != null && itinerario.getNombre().equals(nombre)) {
            return itinerario;
        }
    }
    return null;
    }
}
