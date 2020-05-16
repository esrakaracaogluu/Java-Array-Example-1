import java.util.Scanner;

public class KisiApp {
	static Scanner input = new Scanner(System.in);
	static Kisi[] kisilerim = new Kisi[50];
	static int kisiCount = 0;

	public static void main(String[] args) {
		kisiEkleOtomatik("Ogretmen", "Nurta� ", "G�rses ", (11223344558L));
		kisiEkleOtomatik("Ogretmen", "Muhammed ", "Girgin ", (15664244455L));
		kisiEkleOtomatik("Ogretmen", "H�lya ", "Zincir ", (2122334455L));
		kisiEkleOtomatik("Ogretmen", "Erc�ment ", "��leyen ", (2912894455L));
		kisiEkleOtomatik("Ogretmen", "Nevin ", "Do�rus�z ", (27123634455L));

		kisiEkleOtomatik("Ogrenci", "Esra ", "Karacao�lu ", (31198745632L));
		kisiEkleOtomatik("Ogrenci", "Ezgi ", "Ba� ", (51583455457L));

		int islem = 0;

		while (islem != 5) {
			islem = menu();
			switch (islem) {
			case 1:
				System.out.println("��retmen ekle: ");
				ogretmenEkle();
				break;
			case 2:
				System.out.println("��renci ekle: ");
				ogrenciEkle();
				break;
			case 3:
				System.out.println("Ki�iler Listeleniyor");
				kisiListele();
				break;
			case 4:
				System.out.print("Ki�i tipini se�iniz(Ogretmen/Ogrenci) : ");
				String kisiTipi = input.next();
				filtreliListele(kisiTipi);
				break;
			case 5:
				System.out.println("��k�� yap�ld�.");
				break;
			}
			System.out.println("");

		}
	}

	private static void kisiEkleOtomatik(String kisiTipi, String isim, String soyisim, long tckNo) {
		Kisi kisi;
		if (kisiTipi.equals("Ogretmen")) {
			kisi = new Ogretmen(123456, kisiTipi, isim, soyisim, tckNo);
		} else
			kisi = new Ogrenci(111, 5, kisiTipi, isim, soyisim, tckNo);

		kisilerim[kisiCount++] = kisi;
	}

	private static void filtreliListele(String kisiTipi) {
		Kisi kisi;
		System.out.println(kisiTipi + " s�n�f�ndaki ki�iler: ");
		for (int i = 0; i < kisiCount; i++) {
			if (kisilerim[i].getKisiTipi().equals(kisiTipi)) {
				System.out.println((i + 1) + ".Ki�i: " + kisilerim[i]);

			}

		}

	}

	private static void kisiListele() {
		for (int i = 0; i < kisiCount; i++) {
			System.out.println((i + 1) + ".Ki�i: " + kisilerim[i]);
		}

	}

	private static void ogrenciEkle() {
		Kisi kisi;
		System.out.print("Ki�i tipini giriniz: ");
		String kisiTipi = input.next();

		System.out.print("�sim giriniz: ");
		String isim = input.next();

		System.out.print("Soyisim giriniz: ");
		String soyisim = input.next();

		System.out.print("TC Kimlik No giriniz: ");
		long tckNo = input.nextLong();

		System.out.print("Okul numaras� giriniz: ");
		int okulNo = input.nextInt();

		System.out.print("S�n�f bilgisi giriniz: ");
		int sinifBilgisi = input.nextInt();

		kisi = new Ogrenci(okulNo, sinifBilgisi, kisiTipi, isim, soyisim, tckNo);
		kisilerim[kisiCount++] = kisi;
	}

	private static void ogretmenEkle() {
		Kisi kisi;
		System.out.print("Ki�i tipini giriniz: ");
		String kisiTipi = input.next();

		System.out.print("�sim giriniz: ");
		String isim = input.next();

		System.out.print("Soyisim giriniz: ");
		String soyisim = input.next();

		System.out.print("TC Kimlik No giriniz: ");
		long tckNo = input.nextLong();

		System.out.print("Sicil No Giriniz: ");
		int sicilNo = input.nextInt();
		kisi = new Ogretmen(sicilNo, kisiTipi, isim, soyisim, tckNo);
		kisilerim[kisiCount++] = kisi;

	}

	static int menu() {
		System.out.println("1.��retmen Ekle");
		System.out.println("2.��renci Ekle");
		System.out.println("3.Listele");
		System.out.println("4.Filtreli Listele");
		System.out.println("5.��k��");

		System.out.print("Se�im yap�n�z: ");
		int secim = input.nextInt();
		return secim;

	}

}
