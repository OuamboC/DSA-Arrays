public class FindTheLowestValueInAnArray{
    public static void main (String [] args ){
        /**
         * PseudoCode :
         * 1. Create a variable 'minVal' and set it equal to the first value of the array 
         * 2. Go through every element in the array 
         * 3. If the current element has a  lower value than 'minVal', update 'minVal' to this value.
         * After looking at all the elements in the array, the 'minVal' variable now contains the Lowest value 
         */
    
         // Step 1 : Initialise an array 
    
         int [] array = {7,12,45,90,2}; 
         int minVal = array[0];
        for (int val : array){
            if(val < minVal){
                minVal = val ;
            }
        }
        System.out.println( "The Lowest value is : " + minVal);
    }
}