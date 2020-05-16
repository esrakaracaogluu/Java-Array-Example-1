
public class Ogretmen extends Kisi {
	private int sicilNo;

	public Ogretmen(int sicilNo, String kisiTipi, String isim, String soyisim, long tckNo) {
		super();
		this.sicilNo = sicilNo;
		this.setKisiTipi(kisiTipi);
		this.setIsim(isim);
		this.setSoyisim(soyisim);
		this.setTckNo(tckNo);

	}

	public int getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(int sicilNo) {
		this.sicilNo = sicilNo;
	}

	@Override
	public String toString() {
		return "Ogretmen [sicilNo=" + sicilNo + ", " + super.toString();
	}

}
