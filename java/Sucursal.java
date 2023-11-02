public class Sucursal {
    private String codigo;
    private String region;

    // Constructor para crear una sucursal con un código y una región
    public Sucursal(String codigo, String region) {
        this.codigo = codigo;
        this.region = region;
    }

    // Getters y setters
    public String getCodigo() {
        return this.codigo;
    }

    public String getRegion() {
        return this.region;
    }

}