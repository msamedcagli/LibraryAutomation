
public class Kitap extends OduncVerilebilir 
{
    private String baslik;
    private String yazar;
    private int id;

    public Kitap(String baslik,String yazar,int id) 
    {
        super(); // OduncVerilebilir'in constructor'ını çağırır
        this.baslik = baslik;
        this.yazar = yazar;
        this.id = id;
    }

    public String getBaslik() 
    {
        return baslik;
    }

    public String getYazar() 
    {
        return yazar;
    }

    public int getId() 
    {
        return id;
    }

    @Override
    public void oduncAl() 
    {
        super.oduncAl();
        System.out.println(baslik + " ödünç alındı.");
    }

    @Override
    public void geriAl() 
    {
        super.geriAl();
        System.out.println(baslik + " geri alındı.");
    }
}
