// Robert Morris
// Rule 02. Expressions (EXP)
//
// Implementation XP00-J

import java.io.File;

public class R02_XP00_J
{
  public void NonCompliantSolution()
  {
    File someFile = new File("someFileName.txt");
    // Do something with File
    someFile.delete();
  }

  public void CompliantSolution()
  {
    File someFile = new File("someFileName.txt");
    // Do Something with File
    if (!someFile.delete())
    {
      System.out.println("someFileName.txt failed to be deleted!");
    }
  }
}
