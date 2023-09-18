/**
 * 
 */
package Tickets;

import java.util.Objects;

/**
 * 	@LuisDavidCastilloCalvo
 */
public abstract class Ticket implements ITicket
{
	//	Variable for the kilometric point of the entrance
	private int kilometricPointEntrace ;
	
	//	Variable for the kilometric point out of the railroad
	private int kilometricPointOut ;
	
	//	Variable for the price per kilometer in the railroad
	private double pricePerKilometer ;
	
//	Variable for the total price
	private double totalPrice ;
	
	/**
	 * 
	 */
	protected Ticket(int kilometricPointEntrace, double pricePerKilometer) 
	{
		//Inicialization of the variable kilometricPointEntrace
		this.kilometricPointEntrace = kilometricPointEntrace;
		
		//Inicialization of the variable kilometricPointOut
		this.kilometricPointOut = -1;
		
		//Inicialization of the variable pricePerKilometer
		this.pricePerKilometer = pricePerKilometer;
		
		//Inicialization of the variable totalPrice
		this.totalPrice = -1;
	}

	@Override
	public double PriceCalculator(int kilometricPointEntrace, int kilometricPointOut, double pricePerKilometer) 
	{
		int kilometersDriven = kilometricPointOut - kilometricPointEntrace;
		double totalPrice = kilometersDriven * pricePerKilometer;
		return totalPrice;
	}

	public int getKilometricPointEntrace() 
	{
		return kilometricPointEntrace;
	}

	public void setKilometricPointEntrace(int kilometricPointEntrace) 
	{
		this.kilometricPointEntrace = kilometricPointEntrace;
	}

	public int getKilometricPointOut() 
	{
		return kilometricPointOut;
	}

	public void setKilometricPointOut(int kilometricPointOut) 
	{
		this.kilometricPointOut = kilometricPointOut;
	}

	public double getPricePerKilometer() 
	{
		return pricePerKilometer;
	}

	public void setPricePerKilometer(double pricePerKilometer) 
	{
		this.pricePerKilometer = pricePerKilometer;
	}

	public double getTotalPrice() 
	{
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) 
	{
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() 
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Ticket [kilometricPointEntrace=");
		builder.append(kilometricPointEntrace);
		builder.append(", kilometricPointOut=");
		builder.append(kilometricPointOut);
		builder.append(", pricePerKilometer=");
		builder.append(pricePerKilometer);
		builder.append(", totalPrice=");
		builder.append(totalPrice);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(kilometricPointEntrace, kilometricPointOut, pricePerKilometer, totalPrice);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return kilometricPointEntrace == other.kilometricPointEntrace && kilometricPointOut == other.kilometricPointOut
				&& Double.doubleToLongBits(pricePerKilometer) == Double.doubleToLongBits(other.pricePerKilometer)
				&& Double.doubleToLongBits(totalPrice) == Double.doubleToLongBits(other.totalPrice);
	}
	
	
	
	
}
