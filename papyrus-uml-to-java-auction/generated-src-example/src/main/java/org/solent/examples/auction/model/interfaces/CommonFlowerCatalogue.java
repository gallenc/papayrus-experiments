/*******************************************************************************
 * All rights reserved.
 *******************************************************************************/
package org.solent.examples.auction.model.interfaces;

import java.util.HashSet;
import org.solent.example.auction.model.entities.FlowerDescription;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of CommonFlowerCatalogue.
 * 
 * @author sbegaudeau
 */
public interface CommonFlowerCatalogue {
	// Start of user code (user defined attributes for CommonFlowerCatalogue)

	// End of user code

	/**
	 * Description of the method deleteFlower.
	 * @param name 
	 */
	public void deleteFlower(FlowerDescription name);

	/**
	 * Description of the method createFlower.
	 * @param name 
	 */
	public void createFlower(FlowerDescription name);

	/**
	 * Description of the method findFlower.
	 * @param typeLike this selects a type using natural language
	 * @param colour 
	 * @return 
	 */
	public HashSet<FlowerDescription> findFlower(String typeLike, String colour);

	// Start of user code (user defined methods for CommonFlowerCatalogue)

	// End of user code

}
