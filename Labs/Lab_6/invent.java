import BasicIO.*;

public class invent 
{

    private ReportPrinter file = new ReportPrinter();
    private ASCIIDataFile txt = new ASCIIDataFile();

    public invent() 
    {
        tara();
    
        arhum();

        file.close();
    }
    
    private void tara() //setup method
    {
        
        file.setTitle("Assholes:");
        
        file.addField("T", "Arhum", 20);
        file.addField("A", "Arhum", 15);
        file.addField("R", "Arhum", 7);
        
    }
    
    private void arhum()
    {
        file.writeString("A","total");
        
        
    }
    
}