package  PayPalProject;
import java.util.*;

/**
 * 
 */
public class AdminAccount extends Account {

	/**
	 * Default constructor
	 */
	public AdminAccount() {
	}

	/**
	 * 
	 */
	public List<Transaction> transactions = null;

	/**
	 * 
	 */
	public List<Account> users = null;

	/**
	 * 
	 */
	public List<Request> requests = null;

	/**
	 * 
	 */
	public String privileges;







	/**
	 * @param act 
	 * @return
	 */
	public Boolean closeAccount(Account act) {
		// TODO implement here
		return null;
	}

	/**
	 * @param acc
	 * @return
	 */
	public Boolean banAccount(Account acc) {
		// TODO implement here
		return null;
	}

	/**
	 * 
	 */
	public void loadAllTransactions() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void loadAllUsers() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void loadAllRequests() {
		// TODO implement here
	}

	/**
	 * @param acc
	 * @return
	 */
	public boolean addAdmin(AdminAccount acc) {
		// TODO implement here
		return false;
	}

	/**
	 * @param acc
	 * @return
	 */
	public boolean removeAdmin(AdminAccount acc) {
		// TODO implement here
		return false;
	}

	/**
	 * @param req 
	 * @return
	 */
	public boolean respondToRequest(Request req) {
		// TODO implement here
		return false;
	}

	/**
	 * @param trans 
	 * @return
	 */
	public boolean undoTransaction(Transaction trans) {
		// TODO implement here
		return false;
	}

}