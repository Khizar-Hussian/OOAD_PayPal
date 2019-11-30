package  PayPalProject;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import com.microsoft.sqlserver.jdbc.*;

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
	public void storeAccount(BusinessAcc acc) {
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
	 * @param bt
	 */
	public void storeTransaction(BusinessTransaction bt) {
		// TODO implement here
	}

	/**
	 * @param st
	 */
	public void storeTransaction(StandardTransaction st) {
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
	 * @param acc
	 * @return
	 */
	public List<Transaction> getAllTransactions(Account acc) {
		// TODO implement here
		return null;
	}

	/**
	 * @param req
	 */
	public void storeRequest(Request req) {
		// TODO implement here
	}

	/**
	 * @param mr
	 */
	public void storeRequest(MonetaryReq mr) {
		// TODO implement here
	}

	/**
	 * @param rep
	 */
	public void storeRequest(Report rep) {
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
	 * @param acc
	 * @return
	 */
	public List<Request> getAllRequests(Account acc) {
		// TODO implement here
		return null;
	}

	/**
	 * @param in
	 */
	public void storeInvoice(Invoice in) {
		// TODO implement here
	}

	/**
	 * @param acc
	 */
	public void storeShipmentInfo(Shipment acc) {
		// TODO implement here
	}

	/**
	 * @param acc
	 * @return
	 */
	public List<Invoice> getAllInvoice(Account acc) {
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