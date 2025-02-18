package uma;

import java.math.BigInteger;

/**
 * Class providing methods to compute the factorial of an integer number
 *
 * @author Antonio J. Nebro
 */
public class Factorial {
	
	/**
	 * Method using ints
	 *
	 * @param value
	 * @return the factorial of value
	 */
	public static int factrec(int n) {
		return n>0 ? n*Factorial.factrec(n-1) : 1;
	}
}