
/**
 *@author (Yocheved Philip)
  @version (208664433)
 */

 
public class Weight {
    private int _kilos; 
    private int _grams; 
    
    /**
     * Weight constructor - If the given weight is valid - creates a new Weight object,
     * otherwise if one of the parameters in not valid initialize it to 1.
     * @param kilos the number of kilos in Weight (greater or equal to 1)
     * @param grams the number of grams in Weight (0-999)
     */
    public Weight(int kilos, int grams){
        
    }
    /**
     * Copy constructor
     * @param other the weight to be copied
     */
    public Weight (Weight other){
        
    }
    /**
     * Constructor with only one parameter
     * @param totalGrams the total number of grams
     */
    public Weight(int totalGrams){
        
    }
    /**
     * Gets the kilos
     * @return the number of kilos for this weight
     */
    public int getKilos(){
        return -1;
    } 
    
    /**
     * Gets the grams
     * @return the number of grams for this weight
     */
    public int getGrams(){
        return -1; 
    }
    
    /**
     * Checks if two weights are the same
     * @param other the weight to compare this weight to
     * @return true if the weights are the same
     */
    public boolean equals (Weight other){
        return true; 
    }
    /**
     * Checks if this weight is lighter than another weight
     * @param other weight to compare this weight to
     * @return true if this weight is lighter than the other weight
     */
    public boolean lighter (Weight other){
        return true;
    }
    
    /**
     * Checks if this weight is heavier than another weight
     * @param other weight to compare this weight to
     * @return true if this weight is heavier than the other weight
     */
    public boolean heavier (Weight other){
        return true; 
    }
    
    /**
     * Returns a String that represents this weight
     * @return a String that represents this weight in the following format: kiols.grmas(3 digits) 
     * for example: 4.07 or 3.055 or 4.005
     */
    public String toString(){
        return "";
    } 
    /**
     * Return a new weight with the additional grams given as parameter
     * @param other the additional grams to add to the new returned weight
     * @return a new weight with the additional grams given as parameter
     */
    public Weight add (int grams){
        return new Weight();
    }


    
}
