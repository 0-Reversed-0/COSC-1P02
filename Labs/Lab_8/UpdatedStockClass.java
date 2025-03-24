````import BasicIO.*;

public class UpdatedStockClass
{

    ASCIIOutputFile  file;
    ASCIIDataFile    input;
    private String   id;
    private double   price;
    private int      numOfShares;
    private double   shareValue;

    public UpdatedStockClass(ASCIIDataFile input)
    {
       
        id = input.readString();
        
        if(!input.isEOF())
        {
            price         = input.readDouble();
            numOfShares   = input.readInt();
        }
        
        updateShareValue();
        
    }
    
    public void write(ASCIIOutputFile file)
    {
        file.writeString (id);
        file.writeInt    (numOfShares);
        file.writeDouble (price);
        file.newLine     ();
    }

    public void buy(int amount)
    {
        if (amount > 0)
        {
            numOfShares = numOfShares + amount; 
            updateShareValue();
        }
    }

    public void sell(int amount)
    {
        if (amount > 0)
        {
            numOfShares = numOfShares - amount; 
            updateShareValue();
        }
    }
    
    private void updateShareValue()
    {
        shareValue = numOfShares*price;
    }
    
    public String getID()
    {
        return id;
    }

    public double getPrice()
    {
        return price;
    }

    public int getShares()
    {
        return numOfShares;
    }
    
    public double getShareValue()
    {     
        return shareValue;
    }
    
}
