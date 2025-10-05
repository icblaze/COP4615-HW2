// Robert Morris
// Rule 04. Characters and Strings (STR)
//
// Implementation STR03-J

import java.math.BigInteger;

public class R04_STR03_J
{
  public static void NonCompliantSolution()
  {
    BigInteger x = new BigInteger("530500452766");
    byte[] byteArray = x.toByteArray();
    String s = new String(byteArray);
    byteArray = s.getBytes();
    x = new BigInteger(byteArray);
  }

  public static void CompliantSolution()
  {
    BigInteger x = new BigInteger("530500452766");
    String s = x.toString();  // Valid character data
    byte[] byteArray = s.getBytes();
    String ns = new String(byteArray); 
    x = new BigInteger(ns);  
  }
}
