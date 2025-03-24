import Media.*;
import BasicIO.*; // package for I/O Tools aka input output

public class Notes
{

    private ASCIIPrompter DICK = new ASCIIPrompter(); // this is how you declare user inputter
    private ASCIIDisplayer display = new ASCIIDisplayer(); // this shows a white box where you can display ASCII text
    private ASCIIDataFile balls = new ASCIIDataFile();

    public Notes()
    {
        //Input();
        //Output();
        //readingFiles();
        //doWhileLoops();
        //foreverLoop();
        //String();
        DICK.close();
    }

    /**
     * Forever and Do-While Loops
     */

    private void doWhileLoops()
    {
        //normal while loop
        int x = 0;
        while (x==1)
        {
            System.out.println("blowjob");
            //code wont run since condition is false
            // condition THEN code
        }

        //do while loop

        do
        {
            System.out.println("blowjob");
            // do while is CODE then CONDITION then code again IF the condition is correct
        }
        while(x==1); 
    }

    private void foreverLoop()
    {
        for(;;) // goes forever since no condition
        {
            System.out.println("boobs");
            break; // only way to stop a forever loop and go on to the next code in this case "dick"
        }

        while(true){
            System.out.println("dick");
            break; //The break command destroys the loop in a sense to make it run once
        }

        for(int i = 0; i <5; i++)
        {
            for( int j = 0; j<1010100101; j++)
            {
                System.out.println("dick");
                break; // here the break makes it loop once rather than a billion times
            }
            System.out.println("boobs"); 
            break;
        }

        /**
         * Application
         */

        int counter = 0;

        for(;;) //here the forever loop works like a while loop 
        {
            int r = (int)(Math.random()*100);
            if(r==69)
            {
                System.out.println(counter);
                break; //break is applied on the forever loop NOT if
            }

            counter++;
        }

    }

    /**
     * String object
     */

    private void String() // Strings are the collection of characters
    {

        char balls = '@'; // a lot less effecient than using a string

        String s = "footjob"; // Strings are treated like a primitive type not like Turtle
        String nWord = new String("footjob"); // this is also valid but no one typing that shit

        s = "blowjob"; //can be replaced like primitive Ex: int x = 0, x++;

        String a = s; //same value as blowjob

        System.out.println(a); // will print the same thing
        System.out.println(s);

        if(a.equals(s)) // we can do this for whatevver reason
        {
            System.out.println("dick");
        }

    }

    /**
     * Input/Output
     */

    private void Output()
    {

        /**
         * ASCII displayer
         * does not take input 
         * displays output 
         */

        display.writeString("DICK");
        display.newLine();
        display.writeInt(40);
        display.newLine();
        display.writeDouble(0.0);

    }

    private void Input()
    {
        /**
         * ASCII prompters 
         * they can only read a specific data type
         * it stores user input and the coder chooses what to do with it
         */

        DICK.setLabel("Aura?"); 
        int x = DICK.readInt(); //intially at 0
        System.out.println(x + " is the number chosen");

        for(;;)        
        {
            int r = (int)(Math.random()*100);
            if(r==x)
            {
                break;
            }
        } 

    }

    private void readingFiles()
    {

        /**
         * How to read ASCII data file
         */

        for(;;) //ASCII date files cannot be read using while loops exclusively forever loops
        {   

            String name = balls.readString(); //read the first cell

            if(balls.isEOF()) //EOF stands for end of file essentially it checks whether or not its at the end of the file
            {
                break; //if theres no name left to read then your at the end of the file
            }

            int age = balls.readInt(); // read second cell
            double grade = balls.readDouble(); // read last cell then loop back up

            System.out.println(name + "-" + age + "-" + grade);
        } // you can also use a while(true) instead if you like

    }
}
