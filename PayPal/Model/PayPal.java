
import java.util.*;

/**
 * 
 */
public class PayPal {

	/**
	 * Default constructor
	 */
	public PayPal() {
	}

	/**
	 * 
	 */
	public List<UserAccounts> accounts;

	/**
	 * 
	 */
	public List<AdminAccount> admins;

	/**
	 * 
	 */
	public List<Account> online;




	/**
	 * @param email 
	 * @param password 
	 * @return
	 */
	public Boolean login(String email, String password) {
		// TODO implement here
		return null;
	}

	/**
	 * @param email 
	 * @return
	 */
	public Boolean logout(String email) {
		// TODO implement here
		return null;
	}

	/**
	 * @param email 
	 * @param password 
	 * @param name 
	 * @param address 
	 * @param phoneNum 
	 * @return
	 */
	public Boolean signup(Email email, String password, String name, String address, String phoneNum) {
		// TODO implement here
		return null;
	}

	/**
	 * @param req 
	 * @return
	 */
	public void addRequest(Request req) {
		// TODO implement here
		return null;
	}

	/**
	 * @param String 
	 * @param String 
	 * @param UserAccount 
	 * @param date 
	 * @param date 
	 * @param String 
	 * @param double 
	 * @return
	 */
	public Shipment generateShipment(void String, void String, void UserAccount, void date, void date, void String, void double) {
		// TODO implement here
		return null;
	}

	/**
	 * @param UserAccount a1 
	 * @param UserAccount a2 
	 * @return
	 */
	public Boolean initiateTransaction(void UserAccount a1, void UserAccount a2) {
		// TODO implement here
		return null;
	}

	/**
	 * @param UserAccount a 
	 * @param BusinessAccount b 
	 * @return
	 */
	public Boolean initiateTransaction(void UserAccount a, void BusinessAccount b) {
		// TODO implement here
		return null;
	}

	/**
	 * @param Report 
	 * @return
	 */
	public void assignReportToAdmin(void Report) {
		// TODO implement here
		return null;
	}

}