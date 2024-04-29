/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import dto.GuiaDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gaspa
 */
public class Guia {
    private List<GuiaDTO> guias;
    public Guia(){
        guias = new ArrayList<>();
        agregarGuia(new GuiaDTO("Pedro"));
        agregarGuia(new GuiaDTO("Marlon"));
        agregarGuia(new GuiaDTO("Patricia"));
    }
    public void agregarGuia(GuiaDTO guia) {
        guias.add(guia);
    }
    public List<GuiaDTO> getGuias() {
        List<GuiaDTO> guiasDTO = new ArrayList<>();
        for (GuiaDTO guia : guias) {
            guiasDTO.add(new GuiaDTO(guia.getNombre()));
        }
        return guiasDTO;
    }
}
