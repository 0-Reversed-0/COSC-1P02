import BasicIO.*;

public class Stock
{

    ASCIIOutputFile  file;
    ASCIIDataFile    input;
    private String   id;
    private double   price;
    private int      numOfShares;

    public Stock(ASCIIDataFile input)
    {
       
        id = input.readString();
        
        if(!input.isEOF())
        {
            price         = input.readDouble();
            numOfShares   = input.readInt();
        }
        
    }
    
    public void write(ASCIIOutputFile file)
    {
        file.writeString (id);
        file.writeInt    (numOfShares);
        file.writeDouble (price);
        file.newLine     ();
    }

    public void increment(int amount)
    {
        if (amount > 0)
        {
            numOfShares = numOfShares + amount; 
        }
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
}
