/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import dto.HorarioDTO;
import dto.GuiaDTO;

/**
 *
 * @author gaspa
 */
public class RecorridoDTO {
    private HorarioDTO horario;
    private GuiaDTO guia;
    
    public RecorridoDTO(HorarioDTO horario, GuiaDTO guia) {
        this.horario = horario;
        this.guia = guia;
    }
    
    public GuiaDTO getGuia() {
        return guia;
    }

    public void setGuia(GuiaDTO guia) {
        this.guia = guia;
    }

    

    public HorarioDTO getHorario() {
        return horario;
    }

    public void setHorario(HorarioDTO horario) {
        this.horario = horario;
    }
}
