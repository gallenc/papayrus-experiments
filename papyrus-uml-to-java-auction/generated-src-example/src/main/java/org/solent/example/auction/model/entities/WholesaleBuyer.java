/*******************************************************************************
 * All rights reserved.
 *******************************************************************************/
package org.solent.example.auction.model.entities;

import java.util.HashSet;
import org.solent.example.auction.model.entities.Auctioneer;
import org.solent.example.auction.model.entities.Bid;
import org.solent.example.auction.model.entities.BusinessEntiry;
import org.solent.example.auction.model.entities.Retailer;
import org.solent.example.auction.model.entities.WarehouseStorageArea;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of WholesaleBuyer.
 * 
 * @author sbegaudeau
 */
public class WholesaleBuyer extends BusinessEntiry {
	/**
	 * Description of the property auctioneer.
	 */
	public HashSet<Auctioneer> auctioneer = new HashSet<Auctioneer>();

	/**
	 * Description of the property bid.
	 */
	public Bid bid = null;

	/**
	 * Description of the property retailer.
	 */
	public HashSet<Retailer> retailer = new HashSet<Retailer>();

	/**
	 * Description of the property warehousestoragearea.
	 */
	public WarehouseStorageArea warehousestoragearea = null;

	// Start of user code (user defined attributes for WholesaleBuyer)

	// End of user code

	/**
	 * The constructor.
	 */
	public WholesaleBuyer() {
		// Start of user code constructor for WholesaleBuyer)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for WholesaleBuyer)

	// End of user code

}
