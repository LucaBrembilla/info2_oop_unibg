package Motorino;

public class Motorino {

	String colore;
	float velocit�;
	String tipo;
	boolean antifurto = false;

	Motorino(String colore, String tipo, float velocit�) {
		this.colore = colore;
		this.tipo = tipo;
		this.velocit� = velocit�;
	}

	public float getVelocit�() {
		return velocit�;
	}

	void accelera(float x) {
		if (antifurto == false)
			velocit� += x;
	}
	
	void inserisciAntifurto() {
		antifurto=true;
	}
}
