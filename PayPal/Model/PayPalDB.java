
import java.util.*;

/**
 * 
 */
public class PayPalDB {

	/**
	 * Default constructor
	 */
	public PayPalDB() {
	}

	/**
	 * 
	 */
	public Connection con;

	/**
	 * @param acc
	 */
	public void storeAccount(UserAccount acc) {
		// TODO implement here
	}

	/**
	 * @param acc
	 */
	public void storeAccount(BusinessAccount acc) {
		// TODO implement here
	}

	/**
	 * @param acc
	 */
	public void storeAccount(AdminAccount acc) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public List<Account> getAllAccounts() {
		// TODO implement here
		return null;
	}

	/**
	 * @param id 
	 * @return
	 */
	public Account getAccount(int id) {
		// TODO implement here
		return null;
	}

	/**
	 * @param BusinessTransaction
	 */
	public void storeTransaction(void BusinessTransaction) {
		// TODO implement here
	}

	/**
	 * @param StandardTransaction
	 */
	public void storeTransaction(void StandardTransaction) {
		// TODO implement here
	}

	/**
	 * @param id 
	 * @return
	 */
	public Transaction getTransaction(int id) {
		// TODO implement here
		return null;
	}

	/**
	 * @param Account 
	 * @return
	 */
	public List<Transaction> getAllTransactions(void Account) {
		// TODO implement here
		return null;
	}

	/**
	 * @param Request
	 */
	public void storeRequest(void Request) {
		// TODO implement here
	}

	/**
	 * @param MonetaryReq
	 */
	public void storeRequest(void MonetaryReq) {
		// TODO implement here
	}

	/**
	 * @param Report
	 */
	public void storeRequest(void Report) {
		// TODO implement here
	}

	/**
	 * @param id 
	 * @return
	 */
	public Request getRequest(int id) {
		// TODO implement here
		return null;
	}

	/**
	 * @param Account 
	 * @return
	 */
	public List<Request> getAllRequests(void Account) {
		// TODO implement here
		return null;
	}

	/**
	 * @param Invoice
	 */
	public void storeInvoice(void Invoice) {
		// TODO implement here
	}

	/**
	 * @param Shipment
	 */
	public void storeShipmentInfo(void Shipment) {
		// TODO implement here
	}

	/**
	 * @param Account 
	 * @return
	 */
	public List<Invoice> getAllInvoice(void Account) {
		// TODO implement here
		return null;
	}

	/**
	 * @param id
	 */
	public void deleteAccount(int id) {
		// TODO implement here
	}

	/**
	 * @param id
	 */
	public void deleteTransaction(int id) {
		// TODO implement here
	}

	/**
	 * @param id
	 */
	public void deleteInvoice(int id) {
		// TODO implement here
	}

	/**
	 * @param id
	 */
	public void deleteRequest(int id) {
		// TODO implement here
	}

	/**
	 * @param id
	 */
	public void deleteShipmentInfo(int id) {
		// TODO implement here
	}

	/**
	 * @param card
	 */
	public void storeCard(CreditCard card) {
		// TODO implement here
	}

	/**
	 * @param acc
	 */
	public void getAllCards(UserAccount acc) {
		// TODO implement here
	}

	/**
	 * @param id
	 */
	public void removeCard(int id) {
		// TODO implement here
	}

}