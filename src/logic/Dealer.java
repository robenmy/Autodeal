package logic;

public class Dealer {
	private Vehiculos misVehiculos[];
	private Suministrador misSuminis[];
	private int cantV;
	private int cantS;
	

	public Dealer() {
		cantV = 0;
		cantS = 0;
		
		misSuminis = new Suministrador[50];
		misVehiculos = new Vehiculos[50];
		 
	}


	public Vehiculos[] getMisVehiculos() {
		return misVehiculos;
	}


	public void setMisVehiculos(Vehiculos[] misVehiculos) {
		this.misVehiculos = misVehiculos;
	}


	public Suministrador[] getMisSumunis() {
		return misSuminis;
	}


	public void setMisSumunis(Suministrador[] misSumunis) {
		this.misSuminis = misSumunis;
	}


	public int getCantV() {
		return cantV;
	}


	public void setCantV(int cantV) {
		this.cantV = cantV;
	}


	public int getCantS() {
		return cantS;
	}


	public void setCantS(int cantS) {
		this.cantS = cantS;
	}

	
	public void Reg(Vehiculos v){
		misVehiculos[cantV] = v; 
		cantV++;		
	}
	
	
	public void Sumi(Suministrador s){
		misSuminis[cantS] = s; 
		cantS++;		
	}
	public float Total(){
		float valor = 0;
		
		for (int i = 0; i < cantV; i++) {
			valor += misVehiculos[i].getValor();
		}
		return valor;
		
	}

}
