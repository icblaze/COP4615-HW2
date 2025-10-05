// Robert Morris
// Rule 09. Locking (LCK)
//
// Implementation LCK01-J


public class R09_LCK01_J
{
  private final Boolean initialized = Boolean.FALSE;

  public void NonCompliantSolution()
  {
     synchronized (initialized){
      // Does Something
    }
  }

  private int count = 0;
  private final Integer Lock = count;

  public void CompliantSolution()
  {
    synchronized (Lock) {
      count++;
      // Do something
    }
  }
}
