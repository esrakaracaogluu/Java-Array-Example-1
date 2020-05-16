import java.util.Scanner;

public class KisiApp {
	static Scanner input = new Scanner(System.in);
	static Kisi[] kisilerim = new Kisi[50];
	static int kisiCount = 0;

	public static void main(String[] args) {
		kisiEkleOtomatik("Ogretmen", "Nurtaç ", "Gürses ", (11223344558L));
		kisiEkleOtomatik("Ogretmen", "Muhammed ", "Girgin ", (15664244455L));
		kisiEkleOtomatik("Ogretmen", "Hülya ", "Zincir ", (2122334455L));
		kisiEkleOtomatik("Ogretmen", "Ercüment ", "Ýþleyen ", (2912894455L));
		kisiEkleOtomatik("Ogretmen", "Nevin ", "Doðrusöz ", (27123634455L));

		kisiEkleOtomatik("Ogrenci", "Esra ", "Karacaoðlu ", (31198745632L));
		kisiEkleOtomatik("Ogrenci", "Ezgi ", "Baþ ", (51583455457L));

		int islem = 0;

		while (islem != 5) {
			islem = menu();
			switch (islem) {
			case 1:
				System.out.println("Öðretmen ekle: ");
				ogretmenEkle();
				break;
			case 2:
				System.out.println("Öðrenci ekle: ");
				ogrenciEkle();
				break;
			case 3:
				System.out.println("Kiþiler Listeleniyor");
				kisiListele();
				break;
			case 4:
				System.out.print("Kiþi tipini seçiniz(Ogretmen/Ogrenci) : ");
				String kisiTipi = input.next();
				filtreliListele(kisiTipi);
				break;
			case 5:
				System.out.println("Çýkýþ yapýldý.");
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
		System.out.println(kisiTipi + " sýnýfýndaki kiþiler: ");
		for (int i = 0; i < kisiCount; i++) {
			if (kisilerim[i].getKisiTipi().equals(kisiTipi)) {
				System.out.println((i + 1) + ".Kiþi: " + kisilerim[i]);

			}

		}

	}

	private static void kisiListele() {
		for (int i = 0; i < kisiCount; i++) {
			System.out.println((i + 1) + ".Kiþi: " + kisilerim[i]);
		}

	}

	private static void ogrenciEkle() {
		Kisi kisi;
		System.out.print("Kiþi tipini giriniz: ");
		String kisiTipi = input.next();

		System.out.print("Ýsim giriniz: ");
		String isim = input.next();

		System.out.print("Soyisim giriniz: ");
		String soyisim = input.next();

		System.out.print("TC Kimlik No giriniz: ");
		long tckNo = input.nextLong();

		System.out.print("Okul numarasý giriniz: ");
		int okulNo = input.nextInt();

		System.out.print("Sýnýf bilgisi giriniz: ");
		int sinifBilgisi = input.nextInt();

		kisi = new Ogrenci(okulNo, sinifBilgisi, kisiTipi, isim, soyisim, tckNo);
		kisilerim[kisiCount++] = kisi;
	}

	private static void ogretmenEkle() {
		Kisi kisi;
		System.out.print("Kiþi tipini giriniz: ");
		String kisiTipi = input.next();

		System.out.print("Ýsim giriniz: ");
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
		System.out.println("1.Öðretmen Ekle");
		System.out.println("2.Öðrenci Ekle");
		System.out.println("3.Listele");
		System.out.println("4.Filtreli Listele");
		System.out.println("5.Çýkýþ");

		System.out.print("Seçim yapýnýz: ");
		int secim = input.nextInt();
		return secim;

	}

}
