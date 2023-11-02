public class Productos {

	private String codigoProducto;
	private String tipoProducto;

	public Productos(String codigoProducto, String tipoProducto) {
		this.codigoProducto = codigoProducto;
		this.tipoProducto = tipoProducto;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}
}