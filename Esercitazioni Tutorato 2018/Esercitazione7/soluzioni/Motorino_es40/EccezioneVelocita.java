package Motorino;

public class EccezioneVelocita extends Exception{
	
	public EccezioneVelocita(float velocita) {
		super("La massima velocit� � inferiore alla velocit�, pu� essere minimo "+velocita + " km/h");
	}

}
