package logic;

public class Principal {

	public Principal() {
		
	}

	public static void main(String[] args) {
		Dealer miD = new Dealer();
		Suministrador  sum1 = new Suministrador();
		
		sum1.setMarca("Toyota");
		sum1.setNombre("Pepe");
		sum1.setPais("Japon");
		
		Vehiculos v1 = new Vehiculos();
		v1.setColor("Rojo");
		v1.setMarca(sum1.getMarca());
		v1.setModelo("xls");
		v1.setMysumini(sum1);
		v1.setTipo("Sedan");
		v1.setValor(650000);
		float[] ventas = new float[10];
		for (int i = 0; i < 10; i++) {
			ventas[i]= ((float) i+100000);
			
		}
		
		v1.setVentas(ventas);
		miD.Reg(v1);
		miD.Sumi(sum1);
		
		
		
		System.out.println("las ventas " +miD.Total());
		
	}

}
