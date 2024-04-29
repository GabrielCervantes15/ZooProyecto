/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import dto.ZonaDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gaspa
 */
public class Zona {
    private List<dto.ZonaDTO> zonas;
    public Zona(){
        zonas = new ArrayList<>();
        guardar(new dto.ZonaDTO("Acuario"));
        guardar(new dto.ZonaDTO("Safari"));
        guardar(new dto.ZonaDTO("Aviario"));
    }
    public void guardar(dto.ZonaDTO zona){
        zonas.add(zona);
    }
    public List<ZonaDTO> getZonas() {
        List<ZonaDTO> zonasDTO  = new ArrayList<>();
        for (dto.ZonaDTO zona : zonas) {
            zonasDTO.add(new ZonaDTO(zona.getNombre()));
        }
        return zonasDTO ;
    }
}
