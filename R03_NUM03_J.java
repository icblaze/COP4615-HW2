// Robert Morris
// Rule 03. Numeric Types and Operations (NUM)
//
// Implementation NUM03-J

import java.io.DataInputStream;
import java.io.IOException;

public class R03_NUM03_J
{
  public static int NonCompliantSolution(DataInputStream is) throws IOException
  {
    return is.readInt();  
  }

  public static long CompliantSolution(DataInputStream is) throws IOException
  {
    return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
  }
}
