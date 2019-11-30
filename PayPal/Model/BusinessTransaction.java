
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
	public Double static feeRate;

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