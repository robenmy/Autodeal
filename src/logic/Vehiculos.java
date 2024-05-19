package logic;

public class Vehiculos {
	private String marca;
	private String modelo;
	private String color;
	private String tipo;
	private float valor;
	private float ventas[];
	private Suministrador mysumini;
	
	

	public Vehiculos() {
		ventas = new float[10];
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public float getValor() {
		return valor;
	}



	public void setValor(float valor) {
		this.valor = valor;
	}



	public float[] getVentas() {
		return ventas;
	}



	public void setVentas(float[] ventas) {
		this.ventas = ventas;
	}


	public Suministrador getMysumini() {
		return mysumini;
	}

	public void setMysumini(Suministrador mysumini) {
		this.mysumini = mysumini;
	}
	
	/*public float TotalVenta(){
		float valor = 0;
		
		for (int i = 0; i < ventas.length; i++) {
			valor += ventas[i];
		}
		return valor;
		
	}*/
}
