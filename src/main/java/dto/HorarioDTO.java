/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author gaspa
 */
public class HorarioDTO {
    private DiasDTO dia;
    private String hora;
    public HorarioDTO(DiasDTO dia, String hora) {
        this.dia = dia;
        this.hora = hora;
    }

    public DiasDTO getDia() {
        return dia;
    }

    public void setDia(DiasDTO dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
