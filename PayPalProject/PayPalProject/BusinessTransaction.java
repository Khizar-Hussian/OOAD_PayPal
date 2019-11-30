package  PayPalProject;
import java.util.*;

/**
 * 
 */
public class BusinessTransaction extends Transaction {

	/**
	 * Default constructor
	 */
	public BusinessTransaction() {
	}

	/**
	 * 
	 */
	public static Double feeRate;

	/**
	 * 
	 */
	public Shipment shipment = null;

	/**
	 * 
	 */
	public BusinessAcc merchant;

	/**
	 * 
	 */
	public UserAccount customer;




	/**
	 * @return
	 */
	public Double calculateFee() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public Boolean createShipment() {
		// TODO implement here
		return null;
	}

}