import Media.*;
import BasicIO.*;

public class Output_Files
{

    private ASCIIOutputFile file = new ASCIIOutputFile(); //creates a text file

    /**
     * Ascii output files dont have collumns like report printers do
     * instead we use new lines and tabs 
     */

    public Output_Files()
    {

        file.writeString("Hello");
        file.newLine(); // new lines will create new lines
        file.writeInt(19);
        file.writeDouble(8.0); // if theres no new line command its just a tab

        String name = "Aneeba ";
        int age = 18; 
        
        file.writeString(name+age);
        
        file.close();
                
    }
    
    
}