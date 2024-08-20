import java.util.ArrayList;
public class Kutuphane 
{
    private ArrayList<Kitap> kitaplar;

    public Kutuphane() 
    {
        kitaplar = new ArrayList<>();
    }
    public void kitapEkle(Kitap kitap) 
    {
        kitaplar.add(kitap);
    }
    public Kitap kitapAra(String baslik) 
    {
        for (Kitap kitap : kitaplar) 
        {
            if (kitap.getBaslik().equalsIgnoreCase(baslik)) 
            {
                return kitap;
            }
        }
        return null;
    }
    public boolean kitapOduncVer(int id) 
    {
        for (Kitap kitap : kitaplar) 
        {
            if (kitap.getId() == id && !kitap.isOduncAlindi()) 
            {
                kitap.oduncAl();           
                return true;
            }
        }
        return false;
    }
    public boolean kitapGeriAl(int id) 
    {
        for (Kitap kitap : kitaplar) 
        {
            if (kitap.getId() == id && kitap.isOduncAlindi()) 
            {
                kitap.geriAl();
                return true;
            }
        }
        return false;
    }
    public double gecikmeUcretiHesapla(int gun) 
    {
        double gunlukUcret = 2.0;
        return gun * gunlukUcret;
    }
}
