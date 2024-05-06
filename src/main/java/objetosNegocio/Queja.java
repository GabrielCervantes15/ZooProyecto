package objetosNegocio;

public class Queja {
    String itinerario;
    String fecha;
    String guia;
    String correo;
    String nombre;
    String telefono;
    String texto;

    public Queja(String itinerario, String fecha, String guia, String correo, String nombre, String telefono, String texto) {
        this.itinerario = itinerario;
        this.fecha = fecha;
        this.guia = guia;
        this.correo = correo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.texto = texto;
    }

    
    public String getItinerario() {
        return itinerario;
    }

    public void setItinerario(String itinerario) {
        this.itinerario = itinerario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Queja{" + "itinerario=" + itinerario + ", fecha=" + fecha + ", guia=" + guia + ", correo=" + correo + ", nombre=" + nombre + ", telefono=" + telefono + ", texto=" + texto + '}';
    }
    
    
}
