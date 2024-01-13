public class GameRunner
{
  public static void main(String[] args)
  {
    Bridge b = new Bridge();
    System.out.println("You're standing on the edge of a cliff face overlooking what appears to be an endless void; \nfacing you is a long, rickety, wooden suspension bridge that has seen better days. \nYou try to view what's on the other side, only to be stopped by a thick fog.");
    
    if (b.crossChoice())
    {
      if (!(b.bridgeBreak()))
      {
        System.out.println("You decide to cross the bridge, treading lightly to not fall through. \nUpon making it safely to the other side, you check your surroundings only to notice that you are in the same spot you began. \nYou ponder whether you should cross the bridge again.");
 
        if (b.crossChoice())
        {
          if (!(b.bridgeBreak()))
          {
            System.out.println("Deciding to cross, you again try your best to tread lightly on the loose boards. \nWhen on the other side, you once more find yourself back to the beginning of the bridge. \nYou begin to have doubts about the bridge.");
            
            if (b.crossChoice())
            {
              if (!(b.bridgeBreak()))
              {
                System.out.println("Choosing to find the truth, you walk across the bridge. \nWithout any doubt, you find yourself anew at the suspended planks. \nYou begin to grow impatient.");
                
                if (b.crossChoice())
                {
                  if (!(b.bridgeBreak()))
                  {
                    System.out.println("You cross the bridge again, needing to understand what's happening. \nAgain, you find yourself back to the beginning. \nYou become more impatient.");
                    
                    if (b.crossChoice())
                    {
                      if (!(b.bridgeBreak()))
                      {              
                        System.out.println("You choose to cross the bridge, your frustration leading you to hurry without a second thought. \nBack at the beginning once more, you wonder if it is all worth it.");
                        
                        if (b.crossChoice())
                        {
                          System.out.println("Ultimately, your impatience leads you to run over the old bridge. \nThis decision leads to the snapping of the suspensions, causing you to fall into the void below. \nTHE END");
                        }
                        else
                        {
                          System.out.println("You decide not to take your chances with the bridge, leaving never to return.\nTHE END");
                        }
                      }
                      else
                      {
                        System.out.println("As your curiosity grows, your cautiousness begins to dwindle. \nThis trade-off becomes a factor in your downfall as the bridge snaps, and you fall into the ever-loving void beneath. \nTHE END");
                      }
                    }
                    else
                    {
                      System.out.println("You decide not to take your chances with the bridge, leaving never to return.\nTHE END");
                    }
                  }
                  else
                  {
                    System.out.println("Needing the truth, you walk less cautiously over the old, rotting planks. \nThis careless decision leads you to your demise as it causes the bridge to collapse, and you fall into the bottomless void. \nTHE END");
                  }
                }
                else
                {
                  System.out.println("You decide not to take your chances with the bridge, leaving never to return.\nTHE END");
                }
              }
              else
              {
                System.out.println("As you cross the bridge, it begins to wobble, eventually leading to the snapping of the suspensions. \nAs the bridge collapses, you fall into the endless void below. \nTHE END");
              }
            }
            else
            {
              System.out.println("You decide not to take your chances with the bridge, leaving never to return.\nTHE END");
            }
          }
          else
          {
            System.out.println("Attempting to cross the bridge, you slip as the old suspensions begin to snap. \nWhen they eventually do, you immediately fall into the endless void beneath. \nTHE END");
          }
        }
        else
        {
          System.out.println("You decide not to take your chances with the bridge, leaving never to return.\nTHE END");
        }
      }
      else
      {
        System.out.println("You attempt to cross the bridge, everything seeming normal until you get to the mid-point; \nsuddenly, the old bridge collapses, and, unable to grab ahold of anything, you fall into the endless void the bridge was suspended above. \nTHE END");
      }
    }
    else
    {
      System.out.println("You decide not to take your chances with the bridge, leaving never to return.\nTHE END");
    }   
  }
}    