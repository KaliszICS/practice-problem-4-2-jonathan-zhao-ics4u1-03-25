/**
 * @author Jonathan Z
 * @version 17.0.1
 */

public class Dog {
    // instance variables
    private String name;
    private String breed;
    private int weight;

    /**
     * 
     * @param name // name of the dog
     * @param breed // breed of the dog
     * @param weight // weight of the dog in pounds
     */

    public Dog(String name, String breed, int weight) {
        // constructor 
        this.name = name;
        this.breed = breed;
        this.weight = weight;

    }

    /**
     * @return returns the name of the dog
     */

    public String getName() {
        return this.name;
    }

    /**
     * @return returns the breed of the dog
     */

    public String getBreed() {
        return this.breed;
    }

    /**
     * @return returns the weight of the dog 
     */
    public int getWeight() {
        return this.weight;
    }

    /**
     * @return returns the name of the dog 
     * 
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * @return returns the breed of the dog 
     * 
     */
    public void setBreed(String newBreed) {
        this.breed = newBreed;
    }

    /**
     * @return returns the weight of the dog 
     * 
     */

    public void setWeight(int newWeight) {
        if (newWeight > 0) {
            this.weight = newWeight;

        }
    }
}
