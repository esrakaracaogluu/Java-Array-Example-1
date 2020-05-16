
public class Ogrenci extends Kisi {
	private int okulNo;
	private int sinifBiligisi;

	public Ogrenci(int okulNo, int sinifBilgisi, String kisiTipi, String isim, String soyisim, long tckNo) {
		super();
		this.okulNo = okulNo;
		this.sinifBiligisi = sinifBilgisi;
		this.setKisiTipi(kisiTipi);
		this.setIsim(isim);
		this.setSoyisim(soyisim);
		this.setTckNo(tckNo);

	}

	public int getOkulNo() {
		return okulNo;
	}

	public void setOkulNo(int okulNo) {
		this.okulNo = okulNo;
	}

	public int getSinifBiligisi() {
		return sinifBiligisi;
	}

	public void setSinifBiligisi(int sinifBiligisi) {
		this.sinifBiligisi = sinifBiligisi;
	}

	@Override
	public String toString() {
		return "Ogrenci [okulNo=" + okulNo + ", sinifBiligisi=" + sinifBiligisi + ", " + super.toString();
	}

}
