import java.util.ArrayList;
import java.util.List;

public class Flete {

	private String codigoFlete;
	private String descripcion;

	public float calcularValor() {
		// TODO - implement Flete.calcularValor
		throw new UnsupportedOperationException();
	}

	private List<Pack> packs = new ArrayList<>();

	public Flete(String codigoFlete, String descripcion) {
		this.codigoFlete = codigoFlete;
		this.descripcion = descripcion;
	}

	public void agregarPack(Pack pack) {
		packs.add(pack);
	}

	public void eliminarPack(Pack pack) {
		packs.remove(pack);
	}
}