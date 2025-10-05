// Robert Morris
// Rule 07. Exceptional Behavior (ERR)
//
// Implementation ERR00-J

import java.io.FileNotFoundException;
import java.io.IOException;

public class R07_ERR00_J
{
  public static void NonCompliantSolution()
  {
    try {
      // Write Code Here
    } catch (IOException ioe) {
      ioe.printStackTrace();
    } 
  }

  public static void CompliantSolution()
  {
    Boolean validFlag = false;
    do {
      try {
        // Asking user for File 
        // IF file does not exist, throw FileNotFoundException
        validFlag = true;
      } catch (FileNotFoundException e) {
        System.out.println("Try to use a new File");
      }
    } while (validFlag != true);
    // use file
  }
}
