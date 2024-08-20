
public class OduncVerilebilir {
    private boolean oduncAlindi;

    public OduncVerilebilir() 
    {
        this.oduncAlindi = false;
    }

    public boolean isOduncAlindi() 
    {
        return oduncAlindi;
    }

    public void oduncAl() 
    {
        this.oduncAlindi = true;
    }

    public void geriAl() 
    {
        this.oduncAlindi = false;
    }
}
