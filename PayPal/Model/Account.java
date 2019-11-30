
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
	public Email email;

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
		return null;
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
	 * @param new 
	 * @return
	 */
	public Boolean changePassword(String old, String new) {
		// TODO implement here
		return null;
	}

}