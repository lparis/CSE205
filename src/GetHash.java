package hashishy;

import java.security.*;
import java.math.*;

public class GetHash 
{
	public static void main(String[] args) throws NoSuchAlgorithmException 
	{
		String string = "Suppose he should relent and publish grace to all, on promise made of new subjection, with what eyes could we stand in his presence humble?";
		
		// Create instance of MD5 algorithm
		MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
		digest.update(string.getBytes(), 0, string.length());
		System.out.println("MD5 hash: " + new BigInteger(1, digest.digest()).toString(16));
	}
}