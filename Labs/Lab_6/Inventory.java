import BasicIO.*;

public class Inventory 
{

    private ReportPrinter file = new ReportPrinter();
    private ASCIIDataFile txt = new ASCIIDataFile();

    public Inventory() 
    {
        setupInventory();

        readingFile();

        file.close();
    }

    private void setupInventory()
    {
        file.setTitle("Tinderbox Ltd.", "Nov 4, 2024");
        file.addField("1","SKU", 7);
        file.addField("2","Product", 18);
        file.addField("3","#", 3);
        file.addField("4","Price", 10);
        file.addField("5","Value", 16);

    }

    private void readingFile()
    {

        double total = 0;

        while(true) 
        {   

            String SKU = txt.readString();

            if(txt.isEOF()) 
            {
                break; 
            }

            String Product = txt.readString();
            int num = txt.readInt();
            double Price = txt.readDouble();
            double Value = Price*num;

            file.writeString("1", SKU);  
            file.writeString("2", Product);

            if (num > 1)
            {
                file.writeInt("3", num);
            }

            if(num > 1 && Price > 1000)
            {
                file.writeDouble("4", Price);
            }
            
            file.writeDouble("5", Value);

            total = total + Value;

        } 

        file.writeString("2", "Total: ");
        file.writeDouble("5", total);

    }
}