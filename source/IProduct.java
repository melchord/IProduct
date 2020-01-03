package source;

/**
 * Main class that will handle all of the logic for receiving an input array
 * where a new array will be returned that takes the product of all elements in the array
 * except the array at the current position
 * @author - Melchor Dominguez
 * @version - 12/3/2019
 */
public class IProduct{
    
    /**
     * Takes an array and will return a new array which will be the product of all
     * elements in the array except the element at the current position
     * @param array - untampered original array
     * @return - array with element products minus position i
     */
    public static int[] iProduct(int[] array){
        int total = 1;
        for(int num: array){
            total = num * total;
        }

        int[] returnArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            returnArray[i] = total/array[i];
        }

        return returnArray;
    }
    
    /**
     * Takes an array and will return a new array which will be the product of 
     * all elements in the array except the element at the current position
     * CONSTRAINT: NO DIVISION 
     * @param - untampered original array
     * @return - array with element products minus position i
     */
    public static int[] iProductNoDiv(int[] array){
        
        int[] returnArray = new int[array.length];
        
        //load the array with the constant 1
        //This allows multiplication with eaze 
        for(int i = 0; i < array.length; i++){
            returnArray[i] = 1;
        }
        
        //multiply all products
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < returnArray.length; j++){
                if(i !=j){//check if the position is the same
                    returnArray[j]  = returnArray[j] * array[i];
                }
            }
        }

        return returnArray;
    }

}
