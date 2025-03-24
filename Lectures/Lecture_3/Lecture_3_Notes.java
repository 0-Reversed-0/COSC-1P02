public class Lecture_3_Notes
{
    
    private int x = 81; //instance varible exists throughout the entire class
    
    public Lecture_3_Notes() // primitive types 
    {
        int x = 5+2+1; // x= 8
        int y = x+2; // = 10
        int z = 2*y; // = 20
        double aneeba = 3*Math.PI/2; // (3Pi)/2 MUST ALWAYS HAVE A DECIMAL even if its a whole number
        System.out.println(aneeba); // prints the first 16 decimal places
        
        System.out.println(this.x); // prints the instance varible x, 81
        System.out.println(x); //prints 8
        
        // int x = 2.89 wont work 
        int yz = (int /** This is casting it into a integer */ ) 2.89; // takes only the whole number
        System.out.println(yz);// Prints 2 if it was double then 2.89
        
        int t = (int) 2.1 /** ONLY CASTS 2.1*/ + (int) 5.9;
        int tyz = (int) (2.1 + 5.9); // This is more precise since it does the (2.1 +5.9) First        
        
        // double a = (int) 2; wouldnt work either since doubles will always have a decimal
        
        /**
         * Wouldn't make sense to mutltiply object types
         * yertle*mertle+5 makes zero sense
         * need to use the 'new' keyword for making objects
         */
        
    }
    
    

}
