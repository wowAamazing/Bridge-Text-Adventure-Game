import java.util.Scanner;
import java.lang.Math;

public class Bridge
{
  private int max;
  private static int c = 0;
  
  public Bridge()
  {
    max = 1 + (int)(Math.random() * 6);
  }
  
  public boolean crossChoice()
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Do you cross the bridge? (Y/N)");
    String cross = scan.nextLine();
    
    boolean cho = false;
    
    if (cross.equals("y") || cross.equals("Y"))
    {
      c++;
      cho = true;
    }
    
    return cho;
  }
  
  public boolean bridgeBreak()
  {
    boolean brak = false;
    
    if (c >= max)
    {
      brak = true;
    }

    return brak;
  }
  
  
}
