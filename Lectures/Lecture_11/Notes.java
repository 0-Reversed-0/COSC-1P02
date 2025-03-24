import Media.*;
import BasicIO.*;
import java.io.*; 

public class Notes 
{

    final int balls = 7;

    BinaryOutputFile output = new BinaryOutputFile("new.bin");
    BinaryDataFile reader = new BinaryDataFile("new.bin");
    Classes input = new Classes();

    private int x;
    private double y;
    private String z;

    public Notes()
    {
        // balls = 8; //if you uncomment the command then you will see the erro of final cant be changed
        /**
         * We want to save written objects as .bin 
         * Binary files write a complete objects by converting them to binary
         */
        
        input.setX(11);
        
        writingToBinary();
        readingBinary();
        
    }

    private void writingToBinary()
    {
        //output.writeInt(69); // you can write ints/doubles/string/etc. in bin files
        output.writeObject(input); //this is how you save an object 
        output.close();
    }

    private void readingBinary()
    {
        while(true)
        {
            Classes x = (Classes)reader.readObject();
            if(reader.isEOF()){break;}
            System.out.println(x);
        }
        reader.close();
    }
    
}