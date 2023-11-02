public class Camion {
    private String codigoCamion;
    private String patente;
    private String descripcion;
    private String estado;

    // Constructor para crear un camión con un código, patente, descripción y estado
    public Camion(String codigoCamion, String patente, String descripcion, String estado) {
        this.codigoCamion = codigoCamion;
        this.patente = patente;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    // Getters y setters
    public String getCodigoCamion() {
        return this.codigoCamion;
    }

    public String getPatente() {
        return this.patente;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getEstado() {
        return this.estado;
    }
}