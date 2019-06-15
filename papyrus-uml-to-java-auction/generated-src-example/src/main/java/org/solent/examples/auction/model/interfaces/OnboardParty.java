/*******************************************************************************
 * All rights reserved.
 *******************************************************************************/
package org.solent.examples.auction.model.interfaces;

import org.solent.example.auction.model.entities.Grower;
import org.solent.example.auction.model.entities.WholesaleBuyer;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of OnboardParty.
 * 
 * @author sbegaudeau
 */
public interface OnboardParty {
	// Start of user code (user defined attributes for OnboardParty)

	// End of user code

	/**
	 * Description of the method addGrower.
	 * @param grower 
	 */
	public void addGrower(Grower grower);

	/**
	 * Description of the method removeGrower.
	 * @param grower 
	 */
	public void removeGrower(Grower grower);

	/**
	 * Description of the method addBuyer.
	 * @param wholesaleBuyer 
	 */
	public void addBuyer(WholesaleBuyer wholesaleBuyer);

	/**
	 * Description of the method removeBuyer.
	 * @param wholesaleBuyer 
	 */
	public void removeBuyer(WholesaleBuyer wholesaleBuyer);

	// Start of user code (user defined methods for OnboardParty)

	// End of user code

}
