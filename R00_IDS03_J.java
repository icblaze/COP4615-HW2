// Robert Morris
// Rule 00. Input Validation and Data Sanitization (IDS)
//
// Implementation IDS03-J

import java.util.regex.Pattern;

public class R00_IDS03_J
{

  private static String username;
  private Boolean loginSuccessful;
  
  class logger
  {
    public static void severe(String input)
    {
      System.out.println(input); 
    }
  }

  public void NonCompliantSolution()
  {
    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + username);
    } else {
      logger.severe("User login failed for: " + username);
    }
  }

  public void CompliantSolution()
  {
    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + sanitizeUser(username));
    } else {
      logger.severe("User login failed for: " + sanitizeUser(username));
    }
  }

  private String sanitizeUser(String input)
  {
    return Pattern.matches("[A-Za-z0-9_]+", username)
      ? username : "unauthorized user";
  }
}
