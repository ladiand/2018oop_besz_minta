package tartalyos;

public class Tartaly extends Tarolo {

	private int nyomas;
	
	public Tartaly(int terfogat, int nyomas) {
		super(terfogat);
		this.setNyomas(nyomas);
	}
	
	
	@Override
	public boolean getVeszelyesE() {
		if (getTerfogat() * getNyomas() > 100) {
			return true;
		} else {
			return false;
		}
		
	}


	@Override
	public String toString() {
		return "Tartaly [nyomas=" + getNyomas() + ", getVeszelyesE()=" + getVeszelyesE() + ", Terfogat=" + getTerfogat()
				+ "]";
	}
	public boolean nagyobbNyomasuE(Tartaly masikTartaly) {
		return getNyomas() > masikTartaly.getNyomas();
	}
	public int nagyobb(Tartaly masikTartaly) {
		if (getTerfogat() > masikTartaly.getTerfogat()) {
			return getTerfogat();
		} else {
			return masikTartaly.getTerfogat();
		}
	}


	public int getNyomas() {
		return nyomas;
	}


	public void setNyomas(int nyomas) {
		this.nyomas = nyomas;
	}
	
}
