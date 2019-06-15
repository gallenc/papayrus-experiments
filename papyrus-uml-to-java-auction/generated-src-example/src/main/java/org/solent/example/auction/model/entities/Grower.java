/*******************************************************************************
 * All rights reserved.
 *******************************************************************************/
package org.solent.example.auction.model.entities;

import java.util.HashSet;
import org.solent.example.auction.model.entities.Auctioneer;
import org.solent.example.auction.model.entities.BusinessEntiry;
import org.solent.example.auction.model.entities.Crop;
import org.solent.example.auction.model.entities.Field;
import org.solent.example.auction.model.entities.PickedFlowerBatch;
import org.solent.example.auction.model.entities.WarehouseStorageArea;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Grower.
 * 
 * @author sbegaudeau
 */
public class Grower extends BusinessEntiry {
	/**
	 * Description of the property field.
	 */
	public Field field = null;

	/**
	 * Description of the property auctioneer.
	 */
	public HashSet<Auctioneer> auctioneer = new HashSet<Auctioneer>();

	/**
	 * Description of the property pickedflowerbatch.
	 */
	public PickedFlowerBatch pickedflowerbatch = null;

	/**
	 * Description of the property crop.
	 */
	public Crop crop = null;

	/**
	 * Description of the property warehousestoragearea.
	 */
	public HashSet<WarehouseStorageArea> warehousestoragearea = new HashSet<WarehouseStorageArea>();

	// Start of user code (user defined attributes for Grower)

	// End of user code

	/**
	 * The constructor.
	 */
	public Grower() {
		// Start of user code constructor for Grower)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Grower)

	// End of user code

}
