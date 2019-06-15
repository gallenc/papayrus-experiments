/*******************************************************************************
 * All rights reserved.
 *******************************************************************************/
package org.solent.example.auction.model.entities;

import org.solent.example.auction.model.entities.Bid;
import org.solent.example.auction.model.entities.PickedFlowerBatch;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Lot.
 * 
 * @author sbegaudeau
 */
public class Lot {
	/**
	 * Description of the property bid.
	 */
	public Bid bid = null;

	/**
	 * Description of the property batch.
	 */
	public PickedFlowerBatch batch = null;

	/**
	 * Description of the property id.
	 */
	public Long id = Long.valueOf(0L);

	/**
	 * Description of the property reservePrice.
	 */
	public Double reservePrice = Double.valueOf(0D);

	// Start of user code (user defined attributes for Lot)

	// End of user code

	/**
	 * The constructor.
	 */
	public Lot() {
		// Start of user code constructor for Lot)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Lot)

	// End of user code

}
