/*******************************************************************************
 * All rights reserved.
 *******************************************************************************/
package org.solent.example.auction.model.entities;

import java.util.HashSet;
import org.solent.example.auction.model.entities.BankAccount;
import org.solent.example.auction.model.entities.BusinessEntiry;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Bank.
 * 
 * @author sbegaudeau
 */
public class Bank extends BusinessEntiry {
	/**
	 * Description of the property bankaccount.
	 */
	public HashSet<BankAccount> bankaccount = new HashSet<BankAccount>();

	// Start of user code (user defined attributes for Bank)

	// End of user code

	/**
	 * The constructor.
	 */
	public Bank() {
		// Start of user code constructor for Bank)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Bank)

	// End of user code

}
