package  PayPalProject;
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
	public List<UserAccount> accounts;

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
	public Boolean signUp(String email, String password, String name, String address, String phoneNum) {
		// TODO implement here
		return null;
	}

	/**
	 * @param req 
	 * @return
	 */
	public void addRequest(Request req) {
		// TODO implement here

	}

	/**
	 * @param address
	 * @param status
	 * @param dispatch
	 * @param arrival
	 * @param details
	 * @param fee
	 * @return
	 */
	public Shipment generateShipment(String address,  String status,  Date dispatch,  Date arrival,  String details, Double fee  ) {
		// TODO implement here
		return null;
	}

	/**
	 * @param  a1
	 * @param  a2
	 * @return
	 */
	public Boolean initiateTransaction( UserAccount a1,  UserAccount a2) {
		// TODO implement here
		return null;
	}

	/**
	 * @param  a
	 * @param  b
	 * @return
	 */
	public Boolean initiateTransaction( UserAccount a,  BusinessAcc b) {
		// TODO implement here
		return null;
	}

	/**
	 * @param rep
	 * @return
	 */
	public void assignReportToAdmin(Report rep) {
		// TODO implement here

	}

}