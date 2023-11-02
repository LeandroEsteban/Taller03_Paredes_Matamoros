import java.util.ArrayList;

public class Sucursal {
    private String codigo;
    private String region;
    private ArrayList<Camion> camiones;

    // Constructor para crear una sucursal con un código y una región
    public Sucursal(String codigo, String region) {
        this.codigo = codigo;
        this.region = region;
        this.camiones = new ArrayList<>();
    }

    // Getters y setters
    public String getCodigo() {
        return this.codigo;
    }

    public String getRegion() {
        return this.region;
    }

    public ArrayList<Camion> getCamiones() {
        return this.camiones;
    }

    // Métodos para agregar y eliminar camiones
    public void agregarCamion(String codigoCamion, String patente, String descripcion) {
        this.camiones.add(new Camion(codigoCamion, patente, descripcion, "OUT OF SERVICE"));
    }

    public void eliminarCamion(String codigoCamion) {
        this.camiones.removeIf(camion -> camion.getCodigoCamion().equals(codigoCamion));
    }
}
