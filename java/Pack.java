import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class Pack {

	private String codigoPack;
	private List<Productos> productos = new ArrayList<>();

	public Pack(int codigoPack, int productos) {
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

	public List<Productos> getProductos() {
		return productos;
	}
	public void eliminarProducto() {
		// TODO - implement Productos.eliminarProducto
		throw new UnsupportedOperationException();
	}

}