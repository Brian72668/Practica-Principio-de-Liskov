class Bicicleta extends Vehiculo {
	
	public Bicicleta() {
		this.kilometrosRecorridos = 0;
	}
	
	public void mover(double distancia) {
		kilometrosRecorridos += distancia;
		System.out.println("La bicicleta ha recorrido " + distancia + " km ");
	}
	
	public double calcularAutonomia() {
		return -1;
	}
}