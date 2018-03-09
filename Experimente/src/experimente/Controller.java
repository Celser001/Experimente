package experimente;

public class Controller {

	public static void main(String[] args) {
		Auto meinAuto = new Auto();
		Farbe rot = new Farbe("rot");
		
		meinAuto.setFarbe(rot);
		System.out.println(rot.getFarbwert());
	
	}

}
