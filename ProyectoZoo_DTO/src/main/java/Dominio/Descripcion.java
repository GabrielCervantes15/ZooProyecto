/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.Date;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author Gabriel
 */
public class Descripcion {
    
    
  public Descripcion() {
    }


    private String Descripcion;
    private String Nombreespecie;

   
    
    public Descripcion(String Descripcion, String Nombreespecie) {
      
        this.Descripcion = Descripcion;
        this.Nombreespecie = Nombreespecie;
    }



    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripción) {
        this.Descripcion = Descripción;
    }

    public String getNombreespecie() {
        return Nombreespecie;
    }

    public void setNombreespecie(String Nombreespecie) {
        this.Nombreespecie = Nombreespecie;
    }
    
        @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Descripcion other = (Descripcion) obj;
        if (!Objects.equals(this.Descripcion, other.Descripcion)) {
            return false;
        }
        return Objects.equals(this.Nombreespecie, other.Nombreespecie);
    }

 
    
    @Override
    public String toString() {
        return "Descripcion{" +  ", Descripcion=" + Descripcion + ", Nombre especie=" + Nombreespecie + '}';
    }
} 