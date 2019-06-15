/*******************************************************************************
 * All rights reserved.
 *******************************************************************************/
package org.solent.examples.auction.model.messages;

import org.solent.example.auction.model.entities.WholesaleBuyer;
import org.solent.examples.auction.model.messages.AuctionMessage;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of AuctionClosed.
 * 
 * @author sbegaudeau
 */
public class AuctionClosed extends AuctionMessage {
	/**
	 * Description of the property highestBid.
	 */
	public Double highestBid = Double.valueOf(0D);

	/**
	 * Description of the property soldTo.
	 */
	public WholesaleBuyer soldTo = null;

	// Start of user code (user defined attributes for AuctionClosed)

	// End of user code

	/**
	 * The constructor.
	 */
	public AuctionClosed() {
		// Start of user code constructor for AuctionClosed)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for AuctionClosed)

	// End of user code

}
