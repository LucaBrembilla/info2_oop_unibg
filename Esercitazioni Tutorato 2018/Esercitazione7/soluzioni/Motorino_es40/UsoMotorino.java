package Motorino;

public class UsoMotorino {

	public static void main(String[] args) throws EccezioneVelocita {
		Motorino m = new Motorino("grigio", "Piagio", 40.5f);
		System.out.println(m.getVelocit�());
		
		MotorinoImmatricolato mI= new MotorinoImmatricolato("rosso", "Aprilia", 30.5f,60.0f,"CV1234");
		
		mI.getMax();
		mI.accelera(30.7f);
		m.accelera(30.7f);
		System.out.println(mI.getVelocit�());
		System.out.println(m.getVelocit�());
	}
}
