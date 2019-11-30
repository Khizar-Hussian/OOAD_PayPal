package  PayPalProject;
import java.util.*;

/**
 * 
 */
public abstract class Account {

	/**
	 * Default constructor
	 */
	public Account() {
	}

	/**
	 * 
	 */
	public int accID;

	/**
	 * 
	 */
	public String email;

	/**
	 * 
	 */
	public String name;

	/**
	 * 
	 */
	private String password;

	/**
	 * 
	 */
	public String phoneNum;


	/**
	 * @return
	 */
	public void printInfo() {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public Boolean updateInfo() {
		// TODO implement here
		return null;
	}

	/**
	 * @param old 
	 * @param New
	 * @return
	 */
	public Boolean changePassword(String old, String New) {
		// TODO implement here
		return null;
	}

}