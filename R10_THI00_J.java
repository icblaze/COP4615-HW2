// Robert Morris
// Rule 10. Thread APIs (THI)
//
// Implementation THI00-J


public class R10_THI00_J
{

  public final class Foo implements Runnable {
    @Override public void run() {
      // Code for something
    }
  }
  
  public static void NonCompliantSolution()
  {
    R10_THI00_J x = new R10_THI00_J();
    Foo foo = x.new Foo();
    new Thread(foo).run();
  }

  public static void CompliantSolution()
  {
    R10_THI00_J x = new R10_THI00_J();
    Foo foo = x.new Foo();
    new Thread(foo).start();  
  }
}
