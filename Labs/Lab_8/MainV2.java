import BasicIO.*;
import java.util.*;

public class MainV2
{

    private BasicForm             form;
    private ReportPrinter         report;
    private ASCIIDataFile         input;
    private ASCIIOutputFile       output;
    private UpdatedStockClass     s;

    public MainV2()
    {   
        form     = new BasicForm        ("Buy", "Sell", "Skip");
        input    = new ASCIIDataFile    ("data.txt");
        report   = new ReportPrinter    ();
        output   = new ASCIIOutputFile  ("data2.txt");

        setupForm   ();
        setupReport ();

        double  counter = 0;
        double  total;

        while(true)
        {
            s = new UpdatedStockClass            (input);

            if( input.isEOF () )
            {
                break;   
            }

            fillForm                              (s);
            int button = form.accept              ();
            int shares = form.readInt             ("newShares");

            if(button == 0)
            {
                s.buy(shares);
            }
            else if(button == 1)
            {
                s.sell(shares);
            }

            double sv  = s.getShareValue();
            counter = counter + sv;

            writeDetails              (s);
            s.write                   (output);
        }

        total = counter;
        writeTotalMarketValue(total);

        form.close   ();
        input.close  ();
        report.close ();
        output.close ();
    }

    private void setupForm()
    {
        form.  addTextField ("id"         , "ID"         , 10, 20, 10);
        form.  addTextField ("shares"     , "Shares"     , 8 , 20 , 50);
        form . addTextField ("price"      , "Price"      , Formats.getCurrencyInstance(), 8, 20, 90);
        form . addTextField ("newShares"  , "New Shares" , 8, 20, 130);
        form . setEditable  ("id"         , false);
        form . setEditable  ("shares"     , false);
        form . setEditable  ("price"      , false);
    }

    private void setupReport()
    {
        report . setTitle ( "Stock Data" , Formats . getDateInstance (). format ( new Date ()));
        report . addField ( "id"         , " ID "    , 4);
        report . addField ( "shares"     , " Shares ", 8);
        report . addField ( "price"      , " Price "     , Formats.getCurrencyInstance(), 10);
        report . addField ( "SV"         , " Share Value", Formats.getCurrencyInstance(), 12);
    }

    private void fillForm(UpdatedStockClass s)
    {
        form.clearAll     ();
        form.writeString  ("id"    , s.getID());
        form.writeDouble  ("price" , s.getPrice());
        form.writeInt     ("shares", s.getShares());
    }

    private void writeDetails(UpdatedStockClass s)
    {
        report.writeString ("id"       ,   s.getID() );
        report.writeInt    ("shares"   ,   s.getShares() );
        report.writeDouble ("price"    ,   s.getPrice() );
        report.writeDouble ("SV"       ,   s.getShareValue() );
    }

    private void writeTotalMarketValue(double marketValue)
    {
        report.newLine  ();
        report.writeLine("Total Market Value: " + marketValue);
    }

}
