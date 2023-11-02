
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private final String nombre = "EmpresaUfro";
	private final String direccion = "Francisco Salazar 123";
	private Sucursal[] sucursales;
	public Empresa() {
		this.sucursales = new Sucursal[] {
				new Sucursal("sucursal1", "BioBio"),
				new Sucursal("sucursal2", "La Araucania")
		};
	}

	public String getNombre() {
		return this.nombre;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public Sucursal[] getSucursales() {
		return this.sucursales;
	}

	public void mostrarSucursales() {
		int i = 1;
		for (Sucursal sucursal : this.sucursales) {
			System.out.println("Sucursal " + i + ":");
			System.out.println("Código: " + sucursal.getCodigo());
			System.out.println("Región: " + sucursal.getRegion());
			if (sucursal.getCamiones().isEmpty()) {
				System.out.println("No hay camiones");
			} else {
				System.out.println("Camiones: " + sucursal.getCamiones().size());
			}
			System.out.println();
			i++;
		}
	}

}