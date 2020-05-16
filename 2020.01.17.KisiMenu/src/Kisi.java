
public class Kisi {
	private String kisiTipi;
	private String isim;
	private String soyisim;
	private long tckNo;

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public long getTckNo() {
		return tckNo;
	}

	public void setTckNo(long tckNo) {
		this.tckNo = tckNo;
	}

	public String getKisiTipi() {
		return kisiTipi;
	}

	public void setKisiTipi(String kisiTipi) {
		this.kisiTipi = kisiTipi;
	}

	@Override
	public String toString() {
		return "Kisi [kisiTipi=" + kisiTipi + ", isim=" + isim + ", soyisim=" + soyisim + ", tckNo=" + tckNo + "]";
	}

}
