package dto;


public class QuejaDTO {
    private int id;
    private String itinerario;
    private String fecha;
    private String guia;
    private String correo;
    private String nombre;
    private String telefono;
    private String texto;

    public QuejaDTO( String itinerario, String fecha, String guia, String correo, String nombre, String telefono, String texto) {
        this.itinerario = itinerario;
        this.fecha = fecha;
        this.guia = guia;
        this.correo = correo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.id;
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
        final QuejaDTO other = (QuejaDTO) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "QuejaDTO{" + "id=" + id + ", itinerario=" + itinerario + ", fecha=" + fecha + ", guia=" + guia + ", correo=" + correo + ", nombre=" + nombre + ", telefono=" + telefono + ", texto=" + texto + '}';
    }
    
    
    
    
}
