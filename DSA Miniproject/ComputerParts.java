
public class ComputerParts implements Comparable<ComputerParts> {

	private String partName;
	private String brand;
	private String type;
	private double price;
	private int quant;

	public ComputerParts(String pn, String b, String t, double p, int q) {

		this.partName = pn;
		this.brand = b;
		this.type = t;
		this.price = p;
		this.quant = q;
	}
// getpartName Returns the name of the part
 	
	public String getPartName() {
		return partName;
	}
 
	//partName  Sets the name of the part
 
	public void setPartName(String partName) {
		this.partName = partName;
	}

 //Returns the name of the brand

	public String getBrand() {
		return brand;
	}
 
	//Sets the name of the brand
 
	public void setBrand(String brand) {
		this.brand = brand;
	}

 // Return the type of the part 
 
	public String getType() {
		return type;
	}

   //Sets the type of the part
 
	public void settype(String type) {
		this.type = type;
	
	}
 // Returns the price of the part

	public double getPrice() {
		return price;
	}

//	sets the price of the part

	public void setPrice(double price) {
		this.price = price;
	}

  //Returns the quantity of the part
 
	public int getQuant() {
		return quant;
	}

 //sets the quantity of the part
 
	public void setQuant(int quant) {
		this.quant = quant;
	}
  //compare ComputerParts object
//true if the names are equal
 	//	  false if the names are not equal						    
 
	public boolean Eequals(ComputerParts obj) {

		if (obj instanceof ComputerParts) {

		

			return (obj.partName.equalsIgnoreCase(partName));

		}

		else
			return false;

	}
	
/**public int compareTo(ComputerParts Cp)
 * 
 * the method is based on the implementation form  the interface compareTo
 * Compare two Strings and return an integer value  
 * 
 */
public int compareTo(ComputerParts Cp){
		
		return (this.partName.compareToIgnoreCase(Cp.partName));
		
	}


	
	/** toString()
	 * Converts object to String
	 * @return	attributes of ComputerParts as one string
	 */
	public String toString() {

		return this.partName + "\t " + this.brand + "\t " + this.type + "\t$ " + this.price + "\t " + this.quant;

	}

}	
