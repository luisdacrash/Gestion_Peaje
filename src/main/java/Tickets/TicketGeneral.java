/**
 * 
 */
package Tickets;

/**
 * 	@LuisDavidCastilloCalvo
 */
public class TicketGeneral extends Ticket
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
	public TicketGeneral() 
	{
		kilometricPointEntrace = 0;
		
		kilometricPointOut = 0;
		
		pricePerKilometer = 0;
	}

}
