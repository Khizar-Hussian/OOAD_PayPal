package  PayPalProject;
import java.util.*;

/**
 * 
 */
public class Transaction {

	/**
	 * Default constructor
	 */
	public Transaction() {
	}

	/**
	 * 
	 */
	public int id;

	/**
	 * 
	 */
	public Date datePerformed;

	/**
	 * 
	 */
	public Double amount;

	/**
	 * 
	 */
	public Invoice invoice;

	/**
	 * 
	 */
	public String status;

	/**
	 * 
	 */
	public Boolean instant;

	/**
	 * 
	 */
	public static Double instantFee;






	/**
	 * @return
	 */
	public void printDetails() {
		// TODO implement here

	}

	/**
	 * @return
	 */
	public void generateInvoice() {
		// TODO implement here

	}

	/**
	 * @return
	 */
	public Boolean rollback() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public Boolean executeTransaction() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public Boolean Notify() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public Boolean processInstantly() {
		// TODO implement here
		return null;
	}

}