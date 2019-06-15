/*******************************************************************************
 * All rights reserved.
 *******************************************************************************/
package org.solent.examples.auction.model.interfaces;

import java.util.LinkedHashSet;
import org.solent.example.auction.model.entities.Auction;
import org.solent.example.auction.model.entities.FlowerDescription;
import org.solent.example.auction.model.entities.Grower;
import org.solent.example.auction.model.entities.Lot;
import org.solent.example.auction.model.entities.PickedFlowerBatch;
import org.solent.example.auction.model.entities.WholesaleBuyer;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of PlanAuction.
 * 
 * @author sbegaudeau
 */
public interface PlanAuction {
	// Start of user code (user defined attributes for PlanAuction)

	// End of user code

	/**
	 * Description of the method growerRequestAuction.
	 * @param dateRipe 
	 * @param flowerBatch 
	 */
	public void growerRequestAuction(String dateRipe, PickedFlowerBatch flowerBatch);

	/**
	 * Description of the method buyerRequestAuction.
	 * @param dateNeeded 
	 * @param flowerType 
	 */
	public void buyerRequestAuction(String dateNeeded, FlowerDescription flowerType);

	/**
	 * Description of the method searchAuctionSchedule.
	 * @param fromDate 
	 * @param toDate 
	 * @param flowerDescription 
	 * @return 
	 */
	public LinkedHashSet<Auction> searchAuctionSchedule(String fromDate, String toDate,
			FlowerDescription flowerDescription);

	/**
	 * Description of the method registerGrowerForAuction.
	 * @param grower 
	 * @param auctionInstance 
	 */
	public void registerGrowerForAuction(Grower grower, Auction auctionInstance);

	/**
	 * Description of the method registerBuyerForAuction.
	 * @param auctionInstance 
	 * @param buyer 
	 */
	public void registerBuyerForAuction(Auction auctionInstance, WholesaleBuyer buyer);

	/**
	 * Description of the method addLotToAuction.
	 * @param flowerBatch 
	 * @param reservePrice 
	 * @return 
	 */
	public Lot addLotToAuction(PickedFlowerBatch flowerBatch, Double reservePrice);

	// Start of user code (user defined methods for PlanAuction)

	// End of user code

}
