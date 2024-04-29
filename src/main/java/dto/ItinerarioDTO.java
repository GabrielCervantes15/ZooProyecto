/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gaspa
 */
public class ItinerarioDTO {
    private int id;
    private String nombre;
    private int maxVisitantes;
    private int longitud;
    private int duracion;
    private List<ZonaDTO> zonasParques;
    private List<RecorridoDTO> recorridos;
    
     public ItinerarioDTO(String Itinerario, int maxVisitantes, int Longitud, int duracion) {
        this.nombre = Itinerario;
        this.maxVisitantes = maxVisitantes;
        this.longitud = Longitud;
        this.duracion = duracion;
        zonasParques= new ArrayList<>();
        recorridos = new ArrayList<>();

    }
    public ItinerarioDTO(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public List<RecorridoDTO> getRecorridos() {
        return recorridos;
    }

    public void setRecorridos(List<RecorridoDTO> recorridos) {
        this.recorridos = recorridos;
    }
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public List<ZonaDTO> getZonasParques() {
        return zonasParques;
    }

    public void setZonasParques(List<ZonaDTO> zonasParques) {
        this.zonasParques = zonasParques;
    }
    public int getMaxVisitantes() {
        return maxVisitantes;
    }

    public void setMaxVisitantes(int maxVisitantes) {
        this.maxVisitantes = maxVisitantes;
    }
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
