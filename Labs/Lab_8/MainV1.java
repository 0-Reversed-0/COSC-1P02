import BasicIO.*;
import java.util.*;

public class MainV1
{

    private BasicForm         form;
    private ReportPrinter     report;
    private ASCIIDataFile     input;
    private ASCIIOutputFile   output;
    private Stock             s;

    public MainV1()
    {   
        form     = new BasicForm        ();
        input    = new ASCIIDataFile    ("data.txt");
        report   = new ReportPrinter    ();
        output   = new ASCIIOutputFile  ("data2.txt");
        
        setupForm   ();
        setupReport ();

        while(true)
        {
            s = new Stock(input);

            if( input.isEOF () )
            {
                break;   
            }

            fillForm                  (s);
            int button = form.accept  ();
            int shares = form.readInt ("newShares");
            s.increment               (shares);
            writeDetails              (s, shares);
            s.write                   (output);
        }

        form.close   ();
        input.close  ();
        report.close ();
        output.close ();
    }

    private void setupForm()
    {
        form.  addTextField ("id"         , "ID", 10, 20, 10);
        form.  addTextField ("shares"     , "Shares", 8 , 20 , 50);
        form . addTextField ("price"      , "Price", Formats.getCurrencyInstance(), 8, 20, 90);
        form . addTextField ("newShares"  , "New Shares" , 8, 20, 130);
        form . setEditable  ("id", false);
        form . setEditable  ("shares", false);
        form . setEditable  ("price", false);
    }

    private void setupReport()
    {
        report . setTitle ( " Data "      , Formats . getDateInstance (). format ( new Date ()));
        report . addField ( "id"         , " ID " , 4);
        report . addField ( "shares"     , " Shares " , 8);
        report . addField ( "price"      , " Price " , Formats . getCurrencyInstance () , 10);
        report . addField ( "invested"   , " New Shares " , 20);
    }

    private void fillForm(Stock s)
    {
        form.clearAll     ();
        form.writeString  ("id"    , s.getID());
        form.writeDouble  ("price" , s.getPrice());
        form.writeInt     ("shares", s.getShares());
    }

    private void writeDetails(Stock s, int investedShares)
    {
        report.writeString ("id"       ,   s.getID());
        report.writeInt    ("shares"   ,   s.getShares());
        report.writeDouble ("price"    ,   s.getPrice());
        report.writeInt    ("invested" ,   investedShares);
    }

}
