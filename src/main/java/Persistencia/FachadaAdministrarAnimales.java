/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.util.List;
import objetosNegocio.Animal;

/**
 *
 * @author Equipo 3
 */
public class FachadaAdministrarAnimales {
    private ControlAdministrarAnimales controlAnimales;
    
    public FachadaAdministrarAnimales() {
        this.controlAnimales = new ControlAdministrarAnimales();
    }
    
    public List<Animal> consultarTodosLosAnimales() {
        return controlAnimales.consultarAnimales();
    }
    public void Agregar(Animal animal){
        this.controlAnimales.agregar(animal);
    }
}
