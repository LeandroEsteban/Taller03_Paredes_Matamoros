import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class Pack {

	private String codigoPack;
	private List<Productos> productos = new ArrayList<>();

	public Pack(String codigoPack, List<Productos> productos ) {
		this.codigoPack = codigoPack;
		this.productos = productos;
	}
	public void agregarProducto(Productos producto) {
		if (productos.size() < 20) {
			productos.add(producto);
		} else {
			System.out.println("El pack está completo, no se pueden agregar más productos.");
		}
	}

	public static Pack agregarPack(Scanner scanner) {
		System.out.println("Ingrese el código del paquete:");
		String codigoPack = scanner.next();
		scanner.nextLine();

		List<Productos> productos = new ArrayList<>();
		int productosPorPack = 20;

		for (int i = 0; i < productosPorPack; i++) {
			System.out.println("Ingrese el código del producto:");
			String codigoProducto = scanner.next();
			scanner.nextLine();
			System.out.println("Ingrese el tipo del producto:");
			String tipoProducto = scanner.nextLine();

			Productos producto = new Productos(codigoProducto, tipoProducto);
			productos.add(producto);
		}

		return new Pack(codigoPack, productos);
	}


	public List<Productos> getProductos() {
		return productos;
	}
	public void eliminarProducto() {
		// TODO - implement Productos.eliminarProducto
		throw new UnsupportedOperationException();
	}

}