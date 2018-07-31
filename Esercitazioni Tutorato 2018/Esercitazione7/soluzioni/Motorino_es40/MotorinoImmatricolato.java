package Motorino;

public class MotorinoImmatricolato extends Motorino {

	float maxVelocit�;
	String targa;

	MotorinoImmatricolato(String colore, String tipo, float velocit�, float maxVelocit�, String targa) throws EccezioneVelocita {
		super(colore, tipo, velocit�);
		if (maxVelocit�<velocit�)
			throw new EccezioneVelocita(velocit�);
		this.maxVelocit� = maxVelocit�;
		this.targa = targa;
	}

	public void getMax() {
		System.out.println(maxVelocit�);
	}

	void accelera(float x) {
		float s = velocit� + x;
		if (antifurto == false)
			if (s < maxVelocit�)
				velocit� = s;
			else
				velocit� = maxVelocit�;
	}

}
