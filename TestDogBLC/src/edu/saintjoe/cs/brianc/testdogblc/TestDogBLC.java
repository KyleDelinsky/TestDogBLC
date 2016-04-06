package edu.saintjoe.cs.brianc.testdogblc;

public class TestDogBLC {

	    private String name;
	    // Creates a private data member that hold words, named "name"
	    
	    private int weight;
	    // Creates a private integer data member, named "weight"
	    
	    public void setName(String newName) {
	    	name = newName;
	    }
	    // This method allows outside classes to change the name without messing directly with the data members.
	   
	    public void setWeight(int newWeight) {
	    	weight = newWeight;
	    }
	    // This method does pretty much the same thing as above, but with its weight.

	    public String getName() {
	    	return name;
	    }
	    //This method allows outside classes to obtain the name from the private data members.
	    
	    public int getWeight() {
	    	return weight;
	    }
	    //This method allows outside classes to obtain the weight from the private data members.
	    
	    public void bark() {
	    // This is the bark method
	    	int pointless = 0;
	    	// Does nothing
	    	
	    	if (weight > 60 ) {
	          System.out.println("Woof!! Woof!! says " + name + " that weighs " + weight);
	    	} else if (weight > 14 ) {
	    		System.out.println("Ruff!! Ruff!! says " + name + " that weighs " + weight);
	    	} else
	    		System.out.println("Yip!! Yip!! says " + name + " that weighs " + weight);
	    }
	    // This takes the weight of the dog and runs it through to see what type of bark it has according to its weight and then prints out its bark along with its name.
	    
	    public int setBoth(String newName, int newWeight) {
	    // This is a method that combines both of the methods above	
	    	int oldWeight = weight;
	    	// This creates a new data member with "weight" as its reference.
	    	
	    	name = newName;
	    	// This does the same as above, but with its name.
	    	
	    	weight = newWeight;
	    	// Again, the same, but with weight
	    	return oldWeight;
	    	// Not sure
	    }
	  
	    	

	    public void eat() { }
	    // this is an unused method
	    public void chaseCat() { }
	    // This is an unused method
	}

