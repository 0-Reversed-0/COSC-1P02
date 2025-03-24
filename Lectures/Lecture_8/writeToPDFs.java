import Media.*;
import BasicIO.*;

public class writeToPDFs
{
    private ReportPrinter report = new ReportPrinter();
    private ASCIIDataFile balls = new ASCIIDataFile();

    public writeToPDFs()
    {
        setupReport(); //this wll create the report

        writeToPDF();

        report.close(); 
    }

    private void setupReport()
    {

        report.setTitle("Grade Report"/*Main Title*/, "Brock Student" /*Second Title*/); // just the simple Title to the file

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
    
    private void writeToPDF()
    {
        String name;
        int age;
        double grade;

        for(;;)
        {
            name = balls.readString();
            if(balls.isEOF()) //EOF stands for end of file essentially it checks whether or not its at the end of the file
            {
                break; //if theres no name left to read then your at the end of the file
            }
            age = balls.readInt();
            grade = balls.readDouble();
            writeDetail(name,age,grade);
        }

    }

    private void writeDetail(String name,int age, double grade)
    {
        /**
         * How to write into pdf files
         * Notation: report.writeDatatype("colName", dataValue);
         */

        report.writeString("L", name);
        report.writeInt("M", age);
        report.writeDouble("R", grade);

    }

}