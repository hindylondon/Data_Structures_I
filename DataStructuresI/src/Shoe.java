package map;


public class Shoe {
	private String manufact;
	private String name;
	
	public Shoe(String manufact, String name) {
		this.manufact = manufact;
		this.name = name;
	}


	public String getManufact() {
		return manufact;
	}
	

	public String getName() {
		return name;
	}
	
	public String toString()
    {
        return manufact;
    }
}

