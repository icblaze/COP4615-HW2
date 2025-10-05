// Robert Morris
// Rule 13. Input Output (FIO)
//
// Implementation FIO02-J

import java.io.*;
import java.nio.*;

public class R13_FIO02_J
{
  public void NonCompliantSolution()
  {
    File file = new File("newFile.txt");
    file.delete();
  }

  public void CompliantSolution()
  {
    File file = new File("newFile.txt");
    if (!file.delete()) {
      System.out.println("File failed to delete!");
    }
  }
}
