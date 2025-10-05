// Robert Morris
// Rule 14. Serialization (SER)
//
// Implementation SER00-J

import java.io.Serializable;

public class R14_SER00_J
{
  class NonCompliantSolution implements Serializable
  {
    int numOfWeapons = 10;

    public String toString() {
      return String.valueOf(numOfWeapons);
    }
  }

  class CompliantSolution implements Serializable
  {
    private static final long serialVersionUID = 24L;

    int numOfWeapons = 10;

    public String toString() {
      return String.valueOf(numOfWeapons);
    }
  }
}
