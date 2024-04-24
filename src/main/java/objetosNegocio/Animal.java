/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import dto.AnimalDTO;



/**
 *
 * @author Equipo 3
 */
public class Animal {
    private String nombre;
    private String sexo;
    private int edad;
    
    public Animal(String nombre, String sexo, int edad){
        this.nombre=nombre;
        this.sexo=sexo;
        this.edad=edad;
    }
    public String getAnimal(AnimalDTO animal){
        return "ID: " + animal.getId() + ", Nombre: " + animal.getNombre() + ", sexo: " + animal.getSexo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
