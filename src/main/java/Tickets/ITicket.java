/**
 * 
 */
package Tickets;

/**
 * 	@LuisDavidCastilloCalvo
 * 
 * 	Interface for the tickets
 */
public interface ITicket 
{
	// Method for calculating the price
	public double PriceCalculator (int kilometricPointEntrace, int kilometricPointOut, double pricePerKilometer);
	
}
