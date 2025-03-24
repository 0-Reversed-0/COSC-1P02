import Media.*;
import BasicIO.*;

public class PDFs
{
    private ReportPrinter report = new ReportPrinter();
    public PDFs()
    {
        setupReport(); //this wll create the report
        
        writeDetail();
        
        report.close(); 
    }

    private void setupReport()
    {
        
        report.setTitle("Main Title", "Second Title"); 
        // just the simple Title to the file

        /**
         * How to make Fields or Cells or Columns
         * Format: report.addField("colName", "Column Name", width);
         * colName: NEEDS TO BE UNIQUE otherwise computer cant distinct colNames only characters too
         * Column Title: Just what its called name it what you like
         * width: can be length from 8-15 and is the space between each collumn
         */
        
        report.addField("L", "Left Column", 15);
        report.addField("M", "Middle Column", 15);
        report.addField("R", "Right Column", 15);

        
    }
    
    private void writeDetail()
    {
        /**
         * How to write into pdf files
         * Notation: report.writeDatatype("colName", dataValue);
         */
        
        report.writeString("L", "balls");
        report.writeString("L", "footjob");        
    }

}