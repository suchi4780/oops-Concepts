class Bike 
{
	private String name;
	private int model;
	private int price;
	
	public Bike(String name,int model,int price)
	{
		this.name=name;
		this.model=model;
		this.price=price;
	}
	
	public void setDetails(String na,int mo,int price)
	{
		this.name=na;
		this.model=mo;
		this.price=price;
	}
	
	public String getDetails() {
        return " Name: " + name + ", Model: " + model + ", PRICE: " + price;
    }
}



public class Encapsulation {

	public static void main(String[] args) 
	{
		 Bike bike = new Bike("KTM", 2024, 301234);

	    
	        System.out.println(bike.getDetails());

	       
	        bike.setDetails("duke", 2023 ,240024);

	       
	        System.out.println(bike.getDetails());

	}

}