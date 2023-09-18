/**
 * 
 */
package Tickets;

/**
 * 	@LuisDavidCastilloCalvo
 */
public class TicketEspecial extends Ticket
{
	//	Variable for the kilometric point of the entrance
	private int kilometricPointEntrace ;
	
	//	Variable for the kilometric point out of the railroad
	private int kilometricPointOut ;
	
	//	Variable for the price per kilometer in the railroad
	private double pricePerKilometer ;
	
	/**
	 * 
	 */
	public TicketEspecial() 
	{
		Ticket ticket = Ticket(int kilometricPointEntrace, double pricePerKilometer);
	}

}
