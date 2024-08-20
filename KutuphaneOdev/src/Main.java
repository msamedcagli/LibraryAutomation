import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Kutuphane kutuphane = new Kutuphane();
        Scanner scanner = new Scanner(System.in);
        int secim;
        do {
            System.out.println("\nKütüphane Otomasyonu");
            System.out.println("1. Kitap Ekle");
            System.out.println("2. Kitap Ara");
            System.out.println("3. Kitap Ödünç Al");
            System.out.println("4. Kitap Geri Al");
            System.out.println("5. Gecikme Ücreti Hesapla");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");     
            secim = scanner.nextInt();
            scanner.nextLine(); 
            switch (secim) 
            {
                case 1:// Kitap ekleme
                    System.out.print("Kitap Başlığı: ");
                    String baslik = scanner.nextLine();
                    System.out.print("Yazar: ");
                    String yazar = scanner.nextLine();
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    Kitap yeniKitap = new Kitap(baslik, yazar, id);
                    kutuphane.kitapEkle(yeniKitap);
                    System.out.println("Kitap başarıyla eklendi.");
                    break;
                case 2:// Kitap arama
                    System.out.print("Aramak istediğiniz kitabın başlığı: ");
                    String arananBaslik = scanner.nextLine();
                    Kitap arananKitap = kutuphane.kitapAra(arananBaslik);
                    if (arananKitap != null) 
                    {
                        System.out.println("Kitap bulundu: " + arananKitap.getBaslik() + " - " + arananKitap.getYazar());
                    } 
                    else 
                    {
                        System.out.println("Kitap bulunamadı.");
                    }
                    break;
                case 3:// Kitap ödünç verme
                    System.out.print("Ödünç almak istediğiniz kitabın ID'si: ");
                    int oduncId = scanner.nextInt();
                    if (kutuphane.kitapOduncVer(oduncId)) 
                    {
                        System.out.println("Kitap ödünç alındı.");
                    } 
                    else 
                    {
                        System.out.println("Kitap ödünç alınamadı.");
                    }
                    break;
                case 4:// Kitap geri alma
                    System.out.print("Geri almak istediğiniz kitabın ID'si: ");
                    int geriId = scanner.nextInt();
                    if (kutuphane.kitapGeriAl(geriId)) 
                    {
                        System.out.println("Kitap geri verildi.");
                    } 
                    else 
                    {
                        System.out.println("Kitap geri verilemedi.");
                    }
                    break;
                case 5:// Gecikme ücreti hesaplama
                    System.out.print("Gecikme gün sayısı: ");
                    int gecikmeGun = scanner.nextInt();
                    double ucret = kutuphane.gecikmeUcretiHesapla(gecikmeGun);
                    System.out.println("Gecikme ücreti: " + ucret + " TL");
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                    break;
            }
        } 
        while (secim != 0);
        scanner.close();
	}
}
