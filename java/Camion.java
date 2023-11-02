public class Camion {
    private String codigoCamion;
    private String patente;
    private String descripcion;
    private String estado;

    public Camion(String codigo, String patente, String descripcion) {
        this.codigoCamion = codigo;
        this.patente = patente;
        this.descripcion = descripcion;
        this.estado = "OUT OF SERVICE";
    }

    // getters y setters
    public String getCodigo() {
        return codigoCamion;
    }

    public void setCodigo(String codigo) {
        this.codigoCamion = codigo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
