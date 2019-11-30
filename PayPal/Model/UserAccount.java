
import java.util.*;

/**
 * 
 */
public class UserAccount extends Account {

	/**
	 * Default constructor
	 */
	public UserAccount() {
	}

	/**
	 * 
	 */
	public String address;

	/**
	 * 
	 */
	public List<CreditCard> cards;

	/**
	 * 
	 */
	public List<Invoice> invoices;

	/**
	 * 
	 */
	public List<Transaction> transaction;

	/**
	 * 
	 */
	public List<Shipment> orders;

	/**
	 * 
	 */
	public String status;

	/**
	 * 
	 */
	public List<Request> sentRequests;

	/**
	 * 
	 */
	public List<MonetaryReq> receivedRequests;





	/**
	 * @return
	 */
	public void printTransactionHistory() {
		// TODO implement here
		return null;
	}

	/**
	 * @param message 
	 * @return
	 */
	public boolean sendRequest(String message) {
		// TODO implement here
		return false;
	}

	/**
	 * @param act 
	 * @param message 
	 * @param amount 
	 * @return
	 */
	public boolean requestMoney(UserAccount act, String message, Double amount) {
		// TODO implement here
		return false;
	}

	/**
	 * @param act 
	 * @param message 
	 * @return
	 */
	public boolean reportUser(UserAccount act, String message) {
		// TODO implement here
		return false;
	}

	/**
	 * @param cardNum 
	 * @param cvv 
	 * @param doe 
	 * @return
	 */
	public boolean bindCard(String cardNum, int cvv, Date doe) {
		// TODO implement here
		return false;
	}

	/**
	 * @param card 
	 * @return
	 */
	public boolean unbindCard(CreditCard card) {
		// TODO implement here
		return false;
	}

	/**
	 * @return
	 */
	public void printCards() {
		// TODO implement here
		return null;
	}

	/**
	 * @param trans 
	 * @return
	 */
	public Boolean requestShipment(BusinessTransaction trans) {
		// TODO implement here
		return null;
	}

	/**
	 * @param order 
	 * @return
	 */
	public String trackShipment(Shipment order) {
		// TODO implement here
		return "";
	}

	/**
	 * @return
	 */
	public void deleteMyAcc() {
		// TODO implement here
		return null;
	}

}