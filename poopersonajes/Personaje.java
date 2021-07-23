package programacion;

abstract class Personaje {
	
	private String nombre;
	
	private int vida;
	
	public void getNombre(String nombres) {
		this.nombre = nombres;
	}

	public void getVida(int vida) {
		this.vida = vida;
	}
	
	public abstract  int modificarVida();

}
