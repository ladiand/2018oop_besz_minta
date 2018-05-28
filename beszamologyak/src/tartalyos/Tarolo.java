package tartalyos;

public abstract class Tarolo {

	private int terfogat;


	public Tarolo(int terfogat) {
		this.setTerfogat(terfogat);
	}
	
	public abstract boolean getVeszelyesE();
	
	

	private int getAlapterulet() {
		return 0;
	}

	public int getTerfogat() {
		return terfogat;
	}

	public void setTerfogat(int terfogat) {
		this.terfogat = terfogat;
	}

}
