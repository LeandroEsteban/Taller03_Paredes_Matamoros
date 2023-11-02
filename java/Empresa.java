public class Empresa {
    private final String nombre = "EmpresaUfro";
    private final String direccion = "Francisco Salazar 123";
    private Sucursal[] sucursales;

    // Constructor
    public Empresa() {
        this.sucursales = new Sucursal[] {
                new Sucursal("sucursal1", "BioBio"),
                new Sucursal("sucursal2", "La Araucania")
        };
    }

    // Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public Sucursal[] getSucursales() {
        return this.sucursales;
    }

    // Método para mostrar las sucursales
    public void mostrarSucursales() {
        for (Sucursal sucursal : this.sucursales) {
            System.out.println("Código: " + sucursal.getCodigo());
            System.out.println("Región: " + sucursal.getRegion());
        }
    }
}