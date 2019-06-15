/*******************************************************************************
 * All rights reserved.
 *******************************************************************************/
package org.solent.examples.auction.model.interfaces;

import org.solent.example.auction.model.entities.Lot;
import org.solent.example.auction.model.entities.WholesaleBuyer;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of RunAuction.
 * 
 * @author sbegaudeau
 */
public interface RunAuction {
	// Start of user code (user defined attributes for RunAuction)

	// End of user code

	/**
	 * Description of the method bidForLot.
	 * @param bidValue 
	 * @param lot 
	 * @param biddingBuyer 
	 */
	public void bidForLot(Double bidValue, Lot lot, WholesaleBuyer biddingBuyer);

	/**
	 * Description of the method registerForAuctionMessages.
	 */
	public void registerForAuctionMessages();

	/**
	 * Description of the method getLotDetails.
	 * @param lotId 
	 * @return 
	 */
	public Lot getLotDetails(long lotId);

	// Start of user code (user defined methods for RunAuction)

	// End of user code

}
